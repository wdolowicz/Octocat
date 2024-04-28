package pl.github.octocat.test;

import org.json.JSONObject;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import utils.GetResponse;
import utils.GetValuesRequestPOJO;

public class Zadanie {

    private final ApiHelper apiHelper = new ApiHelper();

    @org.junit.Test
    public void ReadStatus(){
        Response response = apiHelper.sendGetRequest();

        System.out.println(response.getStatusCode());
    }

    @org.junit.Test
    public void ReadValues(){
        Response response = apiHelper.sendGetRequest();

        response.getBody().prettyPrint();
    }

    @Test
    public void ReadName(){
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("return", true);

        Response response = apiHelper.sendGetRequest();

        String name = response.getBody().jsonPath().getString("name");

        System.setProperty("Zmienna", name);
    }

    @Test
    public void Assertion(){
        Integer id = 583231;
        Boolean site_admin = false;
        String email = "octocat@github.com";
        String created_at = "2011-01-25T18:44:36Z";

        GetValuesRequestPOJO bodyRequest = new GetValuesRequestPOJO(id, site_admin, email, created_at);

        Response response = apiHelper.sendGetRequest(bodyRequest.toString());

        GetResponse responseBody = response.as(GetResponse.class);

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(583231, responseBody.getId());
        Assertions.assertEquals(false, responseBody.getSiteAdmin());
        Assertions.assertEquals("octocat@github.com", responseBody.getEmail());
        Assertions.assertEquals("2011-01-25T18:44:36Z", responseBody.getCreatedAt());
    }
}
