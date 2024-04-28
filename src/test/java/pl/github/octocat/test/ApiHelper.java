package pl.github.octocat.test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.GetPropertyValues;

import static io.restassured.RestAssured.given;


public class ApiHelper {

    GetPropertyValues getPropertyValues = new GetPropertyValues();

    private final String TOKEN = getPropertyValues.getPropValue("token");

    public final String BASE_URI = getPropertyValues.getPropValue("ApiUrl");

    private final SampleRest SAMPLE_REST = new SampleRest();

    public Response sendGetRequest(){
        SAMPLE_REST.response = given()
                .headers(
                        "Authorization",
                        "Bearer " + TOKEN,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .get(BASE_URI)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        return SAMPLE_REST.response;
    }

    public Response sendGetRequest(String body){
        SAMPLE_REST.response = given()
                .headers(
                        "Authorization",
                        "Bearer " + TOKEN,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .get(BASE_URI)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        return SAMPLE_REST.response;
    }

}

class SampleRest {
    public Response response;
}