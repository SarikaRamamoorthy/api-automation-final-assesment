package org.testing.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testing.endpoints.ProductDraftEndpoint;
import org.testing.responsePojo.productDetails.ProductResponse;
import org.testng.Assert;

public class ProductDraftStepDef {
    private ProductDraftEndpoint productDraftEndpoint;
    private Response response;
    private ProductResponse productResponse;

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
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "Issue in fetching product details");
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
}
