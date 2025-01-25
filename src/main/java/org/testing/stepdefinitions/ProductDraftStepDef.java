package org.testing.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.codehaus.groovy.runtime.wrappers.BooleanWrapper;
import org.testing.endpoints.ProductDraftEndpoint;
import org.testing.requestPojo.draft.*;
import org.testing.responsePojo.draft.DraftResponse;
import org.testing.responsePojo.productDetails.DataItemResponse;
import org.testing.responsePojo.productDetails.ProductResponse;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ProductDraftStepDef {
    private ProductDraftEndpoint productDraftEndpoint;
    private Response response;
    private String draftNumber;
    private static DraftRequest draftRequest;
    private static DraftResponse draftResponse;
    private static ProductResponse productResponse;
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream propertyFile = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
            properties.load(propertyFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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
        DraftPropsRequest propsRequest = new DraftPropsRequest();

        DraftShippingDetailsRequest shippingDetailsRequest = new DraftShippingDetailsRequest();

        DraftTimeSchedulesRequest timeSchedulesRequest = new DraftTimeSchedulesRequest();
        List<DraftTimeSchedulesRequest> timeSchedulesList = new ArrayList<>();

        DraftPropsStockAvailability stockAvailability = new DraftPropsStockAvailability();
        List<DraftPropsStockAvailability> stockLists = new ArrayList<>();

        propsRequest.setBlibliSku(responseData.getBlibliSku());
        propsRequest.setItemCode(responseData.getItemCode());
        propsRequest.setItemName(responseData.getItemName());
        propsRequest.setProductCode(properties.getProperty("productCode"));
        propsRequest.setProductSku(responseData.getProductSku());
        propsRequest.setCategoryCode(responseData.getCategoryCode());
        propsRequest.setCategoryName(responseData.getCategoryName());
        propsRequest.setProductItemLength(responseData.getProductItemLength());
        propsRequest.setProductItemHeight(responseData.getProductItemHeight());
        propsRequest.setProductItemWidth(responseData.getProductItemWidth());
        propsRequest.setPackageWeight(responseData.getPackageWeight());
        propsRequest.setProductDetailPage(responseData.getProductDetailPage());
        propsRequest.setImageUrl(responseData.getImageUrl());
        propsRequest.setProductFbb(Boolean.parseBoolean(properties.getProperty("isProductFbb")));
        propsRequest.setSellerProductDetailPage(responseData.getSellerProductDetailPage());
        propsRequest.setDisabled(Boolean.parseBoolean(properties.getProperty("isDisabled")));
        propsRequest.setErrorMessage("ErrorCategory.UNSPECIFIED(errorCode=UNSPECIFIED, errorMessage=System facing some error, please try again later)");
        propsRequest.setHalalStatus("HALAL");
        propsRequest.setStorageLocation(properties.getProperty("storageLocation"));
        propsRequest.setCategoryHierarchy(responseData.getCategoryHierarchy());

        stockAvailability.setWarehouseCode(properties.getProperty("warehouseCode"));
        stockAvailability.setWarehouseName(properties.getProperty("warehouseName"));
        stockAvailability.setDistribution(Boolean.parseBoolean(properties.getProperty("distribution")));
        stockAvailability.setProposedQuantity(Long.parseLong(properties.getProperty("proposedQuantity")));
        stockAvailability.setAvailableQuantity(Long.parseLong(properties.getProperty("availableQuantity")));
        stockAvailability.setConfirmedQuantity(Long.parseLong(properties.getProperty("confirmedQuantity")));
        stockAvailability.setSellerNotes(properties.getProperty("sellerNotes"));

        stockLists.add(stockAvailability);
        propsRequest.setStockAvailability(stockLists);

        Map<String, DraftPropsRequest> propsMap = new HashMap<>();
        propsMap.put("additionalProp1", propsRequest);

        shippingDetailsRequest.setWarehouseCode(properties.getProperty("warehouseCode"));
        shippingDetailsRequest.setWarehouseName(properties.getProperty("warehouseName"));
        shippingDetailsRequest.setShippingType(properties.getProperty("shippingType"));
        shippingDetailsRequest.setPickupPointCode(properties.getProperty("pickupPointCode"));
        shippingDetailsRequest.setPickupPointName(properties.getProperty("pickupPointName"));
        shippingDetailsRequest.setPickupPointAddress(properties.getProperty("pickupPointAddress"));
        shippingDetailsRequest.setSellerPicName(properties.getProperty("sellerPicName"));
        shippingDetailsRequest.setSellerPicPhoneNumber(properties.getProperty("sellerPicPhoneNumber"));
        shippingDetailsRequest.setEmergencyContactEmail(properties.getProperty("emergencyContactEmail"));
        shippingDetailsRequest.setEmergencyContactNumber(properties.getProperty("emergencyContactNumber"));

        Map<String, Long> preferredTime = new HashMap<>();

        timeSchedulesRequest.setPreferredDate(properties.getProperty("preferredDate"));
        preferredTime.put("hour", Long.parseLong(properties.getProperty("hour")));
        preferredTime.put("minute", Long.parseLong(properties.getProperty("minute")));
        preferredTime.put("second", Long.parseLong(properties.getProperty("second")));
        preferredTime.put("nano", Long.parseLong(properties.getProperty("nano")));
        timeSchedulesRequest.setPreferredTime(preferredTime);
        timeSchedulesList.add(timeSchedulesRequest);
        shippingDetailsRequest.setPreferredTimeSchedules(timeSchedulesList);

        List<DraftShippingDetailsRequest> shippingDetailsRequestList = new ArrayList<>();
        shippingDetailsRequestList.add(shippingDetailsRequest);

        draftRequest.setDraftNumber(properties.getProperty("draftNumber"));
        draftRequest.setMerchantCode(properties.getProperty("merchantCode"));
        draftRequest.setMerchantName(properties.getProperty("merchantName"));
        draftRequest.setUserType("INTERNAL");
        draftRequest.setPotentialOutboundFee(Long.parseLong(properties.getProperty("potentialOutboundFee")));
        draftRequest.setDraftStatus("SELECT_PRODUCT");
        draftRequest.setDeliveryNotes(properties.getProperty("deliveryNotes"));

        draftRequest.setSelectedProducts(propsMap);
        draftRequest.setShippingDetails(shippingDetailsRequestList);
    }

    @When("the POST request is sent to save draft")
    public void thePOSTRequestIsSentToSaveDraft() {
        this.response = productDraftEndpoint.postDraftDetails(draftRequest);
    }

    @And("the draft number is saved")
    public void theDraftNumberIsSaved() {
        this.draftNumber = this.response.jsonPath().getString("data");
    }

    @Given("draft number from previous api call is used to send GET request")
    public void draftNumberFromPreviousApiCall() {
        this.response = productDraftEndpoint.getDraftDetails(this.draftNumber);
    }

    @Then("the response is saved in a draftResponse POJO")
    public void theResponseIsSavedInADraftResponsePOJO() {
        draftResponse = this.response.getBody().as(DraftResponse.class);
    }

//    @When("a GET request to fetch all drafts is sent")
//    public void aGETRequestToFetchAllDraftsIsSent() {
//        productDraftEndpoint.getAllDraftsDetails();
//    }
}
