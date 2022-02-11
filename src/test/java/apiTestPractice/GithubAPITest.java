package apiTestPractice;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GithubAPITest {

    String token = "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";
    String url = "https://api.github.com";


   @Test
    public void verifyRepositories() {
        String url_new = url + "/user/repos";
                given().auth().oauth2(token)

                .queryParam("sort","created")
                .queryParam("direction", "desc")
                .when().get(url_new)
                .then().log().body();
    }
@Test
    public  void getRepoForSecificUser() {
    String api_url = url + "/users/{username}/repos";
    given().auth().oauth2(token)
            .pathParams("username", "christopherovie1")
            .when().get(api_url).then().log().all();

           // .when().get(api_url).then().body();

}
}