package apiTestPractice;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BasicPreemptiveAuth {


    @Test
    public void basicPreemptiveAuthTest(){

      given().auth().preemptive().basic("postman","password")
              .when().get("http://postman-echo.com/basic-auth")
              .then().log().body();
    }
    @Test
public  void basicChallengeAuthTest(){
    given().auth().basic("postman","password")
            .when().get("http://postman-echo.com/basic-auth")
            .then().log().body();
}
}
