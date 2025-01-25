package org.testing.endpoints;


import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testing.requestPojo.draft.DraftRequest;


public class ProductDraftEndpoint {
    private RequestSpecification requestSpecification;
    private String baseURI;
    private Properties properties;
    private Response response;

    public ProductDraftEndpoint() {
        properties = new Properties();
        try {
            FileInputStream propertyFile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
            properties.load(propertyFile);
            this.baseURI = properties.getProperty("api.base.uri");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        requestSpecification = given().baseUri(baseURI).accept("application/json").header("Header-Authenticator", properties.getProperty("header.authenticator"));
    }

    public Response getProductDetails() {
        response = requestSpecification
                .given()
                .queryParam("businessPartnerCode", properties.getProperty("businessPartnerCode"))
                .queryParam("itemSku", properties.getProperty("itemSku"))
                .get(baseURI + properties.getProperty("get.product.details.endpoint"))
                .then().extract().response();
        response.prettyPrint();
        return response;
    }

    public Response postDraftDetails(DraftRequest draftRequest) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            response = requestSpecification
                    .given()
                    .body(objectMapper.writeValueAsString(draftRequest))
                    .post(baseURI + properties.getProperty("post.draft.details.endpoint"))
                    .then().extract().response();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        response.prettyPrint();
        return response;
    }

    public Response getDraftDetails(String draftNumber) {
        response = requestSpecification
                .given()
                .queryParam("draftNumber", draftNumber)
                .get(baseURI + properties.getProperty("get.draft.details.endpoint"))
                .then().extract().response();
        response.prettyPrint();
        return response;
    }

    public Response getAllDraftDetails() {
        response = requestSpecification
                .given()
                .get(baseURI + properties.getProperty("get.allDraft.details.endpoint"))
                .then().extract().response();
    }
}
