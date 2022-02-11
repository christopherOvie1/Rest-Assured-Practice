package apiTestPractice;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BitCoinAPITest {


    @Test
    public void getStatusCode(){
        int statusCode=  given().when().get("https://reqres.in/api/users?page=2").statusCode();
        System.out.println(statusCode);
    }
    @Test
    public void getResponseBody(){
        given().when().get("https://reqres.in/api/users?page=2").then().log().all();
    }

}
