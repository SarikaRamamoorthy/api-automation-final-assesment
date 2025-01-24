package org.testing.endpoints;


import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


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
}
