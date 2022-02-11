package apiTestPractice;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class WeatherAPITest {

   // @Test

   /* public void getCityName(){
        given().queryParam("q","london")
                .queryParam("appid","f6e2b9cb21529365dfaf141c7071350c")
                .when().get("https://api.openweathermap.org/data/2.5/weather")
                .then().log().all();
    */

    String  key  = "f6e2b9cb21529365dfaf141c7071350c";
 String  url =  "https://api.openweathermap.org/data/2.5/weather";
      @Test
    public void getCityName2(){
          given().queryParam("q","london")
                  .queryParam("appid", key)
                  .when().get(url)
                  .then().log().body();
    }





}
