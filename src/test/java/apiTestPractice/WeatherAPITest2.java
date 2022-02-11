package apiTestPractice;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class WeatherAPITest2 {


    String  key  = "f6e2b9cb21529365dfaf141c7071350c";
    String  url =  "https://api.openweathermap.org/data/2.5/weather";
    //@Test
    public void getCityName2() {
        given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                .then().log().body();
    }
    //@Test
    public void validateCountry(){


   String country= given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                 .then().extract().path("sys.country");

   Assert.assertTrue(country.equals("GB"));
    System.out.println("the name of the country = "+country);

    }
//@Test
    public  void validateTheWeather(){

        String cuurrentWeather= given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                .then().extract().path("weather[0].description");
                Assert.assertTrue(cuurrentWeather.equals("broken clouds"));
                System.out.println(cuurrentWeather);
    }
//@Test
    public void validateHeader(){
       // String header =
        given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                .then().log().headers();
    }
    @Test
    public void validateServerHeader(){
           given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                .then().assertThat().header("Server", "openresty");

    }
    @Test
    public void validateContentTypeHeader(){
        given().queryParam("q", "london")
                .queryParam("appid", key)
                .when().get(url)
                .then().assertThat().header("Content-Type", "application/json; charset=utf-8");

    }
}
