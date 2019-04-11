import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import jsonObjects.JO_LogIn;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.with;

public class Test_LogInBack {

    private JO_LogIn jo = new JO_LogIn();
    private String url = "https://dealt-api.test4echo.app/api-test/api/authenticate";
    private String method = "POST";
    private String token;

    @Test
    public void PostWithRestAssured(){
        JSONObject json = jo.correctLogIn();
        Response resp = with().body(json.toString()).with().contentType(ContentType.JSON)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = resp.jsonPath();
        token = jsonPath.get("id_token");
        System.out.println(token);
    }
}
