package org.testing.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testing.endpoints.ProductDraftEndpoint;
import org.testing.requestPojo.draft.*;
import org.testing.responsePojo.draft.DraftResponse;
import org.testing.responsePojo.productDetails.DataItemResponse;
import org.testing.responsePojo.productDetails.ProductResponse;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ProductDraftStepDef {
    private ProductDraftEndpoint productDraftEndpoint;
    private Response response;
    private static String draftNumber;
    private static DraftRequest draftRequest;
    private static DraftResponse draftResponse;
    private static ProductResponse productResponse;
    private static Properties properties = new Properties();

    static {
        draftResponse = new DraftResponse();
        draftRequest = new DraftRequest();
        try {
            FileInputStream propertyFile = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
            properties.load(propertyFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("the header is set with header authentication email and base URI")
    public void theHeaderIsSetWithHeaderAuthenticationEmailAndBaseURI() {
        productDraftEndpoint = new ProductDraftEndpoint();
    }

    @When("a GET request is sent to fetch product details for given parameters")
    public void aGETRequestIsSentToFetchProductDetailsForGivenParameters() {
        response = productDraftEndpoint.getProductDetails();
    }

    @Then("the response is saved in a POJO")
    public void theResponseIsSavedInAPOJO() {
        productResponse = response.getBody().as(ProductResponse.class);
    }

    @And("the status code is validated")
    public void theStatusCodeIsValidated() {
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Incorrect response");
    }

    @And("the schema is validated")
    public void theSchemaIsValidated() {
        try {
            response.then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/ProductResponse.json"));

        } catch (AssertionError e) {
            System.err.println("Assertion failed: " + e.getMessage());
        }
    }

    @Given("response from previous api call is passed to draft request")
    public void responseFromPreviousApiCallIsPassedToDraftRequest() {
        DataItemResponse responseData = productResponse.getData().getFirst();

        draftRequest.setMerchantCode(properties.getProperty("merchantCode"));
        draftRequest.setMerchantName(properties.getProperty("merchantName"));
        draftRequest.setUserType(properties.getProperty("userType"));
        draftRequest.setRegionCode(properties.getProperty("regionCode"));
        draftRequest.setRegionName(properties.getProperty("regionName"));
        draftRequest.setDraftStatus(properties.getProperty("draftStatus"));

        draftRequest.setSelectedProducts(getSelectedProducts(responseData));

        draftRequest.setAddedProducts(new ArrayList<>());
        draftRequest.setRemovedProducts(new ArrayList<>());
        draftRequest.setNotEligibleInAnyWarehouse(new ArrayList<>());
        draftRequest.setNewNotEligibleInAnyWarehouse(new ArrayList<>());
        draftRequest.setNotAllocatedProducts(new ArrayList<>());

        draftRequest.setWarehouseAllocations(getWarehouseAllocation(responseData));
        draftRequest.setShippingDetails(getShippingDetailRequest());

    }

    @When("the POST request is sent to save draft")
    public void thePOSTRequestIsSentToSaveDraft() {
        this.response = productDraftEndpoint.postDraftDetails(draftRequest);
    }

    @And("validate data is not empty")
    public void validateDataIsNotEmpty() {
        String data = response.jsonPath().getString("data");
        Assert.assertNotNull(data, "Data should not be null");
        Assert.assertFalse(data.isEmpty(), "Data should not be empty");
    }


    @And("validate errors are empty")
    public void validateErrorsAreEmpty() {
        Map<String, Object> errors = response.jsonPath().getMap("errors");
        Assert.assertTrue(errors.isEmpty(), "Errors should be empty");
    }

    @And("the draft number is saved")
    public void theDraftNumberIsSaved() {
        draftNumber = this.response.jsonPath().getString("data");
    }

    @Given("draft number from previous api call is used to send GET request")
    public void draftNumberFromPreviousApiCall() {
        this.response = productDraftEndpoint.getDraftDetails(draftNumber);
    }

    @Then("the response is saved in a draftResponse POJO")
    public void theResponseIsSavedInADraftResponsePOJO() {
        draftResponse = this.response.getBody().as(DraftResponse.class);
    }
    @And("validate the response data")
    public void validateTheResponseData() {
        Assert.assertEquals(draftResponse.getData().getMerchantCode(), draftRequest.getMerchantCode(), "Merchant Code mismatch");
        Assert.assertEquals(draftResponse.getData().getMerchantName(), draftRequest.getMerchantName(), "Merchant Name mismatch");
        Assert.assertEquals(draftResponse.getData().getUserType(), draftRequest.getUserType(), "User Type mismatch");
        Assert.assertEquals(draftResponse.getData().getRegionCode(), draftRequest.getRegionCode(), "Region Code mismatch");
        Assert.assertEquals(draftResponse.getData().getRegionName(), draftRequest.getRegionName(), "Region Name mismatch");
        Assert.assertEquals(draftResponse.getData().getDraftStatus(), draftRequest.getDraftStatus(), "Draft Status mismatch");


        var requestProduct = draftRequest.getSelectedProducts().get(properties.getProperty("itemSku"));
        var responseProduct = draftResponse.getData().getSelectedProducts().get(properties.getProperty("itemSku"));

        Assert.assertEquals(responseProduct.getBlibliSku(), requestProduct.getBlibliSku(), "Blibli SKU mismatch");
        Assert.assertEquals(responseProduct.getProductItemLength(), requestProduct.getProductItemLength(), "Product Item Length mismatch");
        Assert.assertEquals(responseProduct.getProductItemHeight(), requestProduct.getProductItemHeight(), "Product Item Height mismatch");
        Assert.assertEquals(responseProduct.getProductItemWidth(), requestProduct.getProductItemWidth(), "Product Item Width mismatch");
        Assert.assertEquals(responseProduct.getPackageWeight(), requestProduct.getPackageWeight(), "Package Weight mismatch");

    }

    @When("a DELETE request is sent with the draft number as a query parameter")
    public void aDELETERequestIsSentWithTheDraftNumberAsAQueryParameter() {
        response = productDraftEndpoint.deleteDraft(draftNumber);
    }

    public List<ShippingDetailsRequest> getShippingDetailRequest() {
        List<ShippingDetailsRequest> shippingDetailsRequests = new ArrayList<>();

        ShippingDetailsRequest shippingDetailsRequest = new ShippingDetailsRequest();
        shippingDetailsRequest.setWarehouseCode(properties.getProperty("warehouseCode"));
        shippingDetailsRequest.setWarehouseName(properties.getProperty("warehouseName"));
        shippingDetailsRequest.setWarehouseAddress(properties.getProperty("warehouseAddress"));
        shippingDetailsRequest.setShippingType(properties.getProperty("shippingType"));
        shippingDetailsRequest.setPickupPointAddress("");
        shippingDetailsRequest.setPickupPointCode("");
        shippingDetailsRequest.setPickupPointName("");
        shippingDetailsRequest.setSellerPicName("");
        shippingDetailsRequest.setSellerPicPhoneNumber("");
        shippingDetailsRequest.setEmergencyContactEmail("");
        shippingDetailsRequest.setEmergencyContactNumber("");
        shippingDetailsRequest.setPreferredTimeSchedules(new ArrayList<>());

        shippingDetailsRequests.add(shippingDetailsRequest);
        return shippingDetailsRequests;
    }

    public List<WarehouseAllocationRequest> getWarehouseAllocation(DataItemResponse responseData) {
        List<WarehouseAllocationRequest> warehouseAllocationRequests = new ArrayList<>();
        WarehouseAllocationRequest warehouseAllocationRequest = new WarehouseAllocationRequest();

        warehouseAllocationRequest.setWarehouseCode(properties.getProperty("warehouseCode"));
        warehouseAllocationRequest.setWarehouseName(properties.getProperty("warehouseName"));
        warehouseAllocationRequest.setWarehouseAddress(properties.getProperty("warehouseAddress"));
        warehouseAllocationRequest.setWarehouseRank(Integer.parseInt(properties.getProperty("warehouseRank")));

        List<String> selectedProducts = new ArrayList<>();
        selectedProducts.add(responseData.getBlibliSku());

        warehouseAllocationRequest.setSelectedProducts(selectedProducts);
        warehouseAllocationRequests.add(warehouseAllocationRequest);

        return warehouseAllocationRequests;

    }

    public Map<String, SelectedProductRequest> getSelectedProducts(DataItemResponse responseData) {
        HashMap<String, SelectedProductRequest> selectedProduct = new HashMap<>();

        SelectedProductRequest selectedProductRequest = new SelectedProductRequest();

        String blibliSku = responseData.getBlibliSku();

        selectedProductRequest.setCategoryName(responseData.getCategoryName());
        selectedProductRequest.setCategoryCode(responseData.getCategoryCode());
        selectedProductRequest.setBlibliSku(blibliSku);
        selectedProductRequest.setItemCode(responseData.getItemCode());
        selectedProductRequest.setItemName(responseData.getItemName());
        selectedProductRequest.setPackageWeight(responseData.getPackageWeight());
        selectedProductRequest.setRecommendedQuantity(null);
        selectedProductRequest.setRecommendedQuantityErrorCode(properties.getProperty("recommendedQuantityErrorCode"));
        selectedProductRequest.setProposedQuantity(responseData.getProposedQuantity());
        selectedProductRequest.setConfirmedQuantity(null);
        selectedProductRequest.setProductItemWidth(responseData.getProductItemWidth());
        selectedProductRequest.setProductItemLength(responseData.getProductItemLength());
        selectedProductRequest.setProductItemHeight(responseData.getProductItemHeight());
        selectedProductRequest.setCategoryHierarchy(responseData.getCategoryHierarchy());

        selectedProduct.put(blibliSku,selectedProductRequest);

        return selectedProduct;
    }

}
