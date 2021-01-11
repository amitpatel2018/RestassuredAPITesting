package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetAuthToken {
	String BASE_URI = "https://test.salesforce.com/services/oauth2/token?";
	String url = "https://test.salesforce.com/services/oauth2/token?" + 
			"grant_type=password&" + 
			"client_id=3MVG98_Psg5cppyaJMvU2E3zL1BuPgH_cLpkoDcnuCvXNnqFGV6xzKk.1atX3TxDuhNnZVAE9TqenZoIFkZru&" +
			"client_secret=3265369361863522187&"
			+ "username=amit.patel@oodlefinance.com.uat&password=NavoPasswordForUat@182";
					
	
	// https://test.salesforce.com/services/oauth2/token?grant_type=password&client_id=3MVG98_Psg5cppyaJMvU2E3zL1BuPgH_cLpkoDcnuCvXNnqFGV6xzKk.1atX3TxDuhNnZVAE9TqenZoIFkZru&client_secret=3265369361863522187&username=amit.patel@oodlefinance.com.uat&password=NavoPasswordForUat@182
	@Test(priority=1)
	public void getToken() {
//	        RestAssured.requestSpecification = RestAssured.given().auth().oauth2(getAccessToken(url))
//	                .header("Accept", ContentType.JSON.getAcceptHeader())
//	                .contentType(ContentType.JSON);
//	}
//	@Test(priority=2)
//	public String getAccessToken(String payload) {
//        return RestAssured.given()
//                .contentType(ContentType.JSON)
//                .body(payload)
//                .post("/token")
//                .then().extract().response()
//                .jsonPath().getString("access_token");
	String oauth_token = RestAssured.given().auth().basic("amit.patel@oodlefinance.com.uat", "NavoPasswordForUat@182")
    .queryParams("client_id", "3MVG98_Psg5cppyaJMvU2E3zL1BuPgH_cLpkoDcnuCvXNnqFGV6xzKk.1atX3TxDuhNnZVAE9TqenZoIFkZru")
    .queryParams("client_secret", "3265369361863522187")
    .queryParams("grant_type", "password")
  .when().get("https://test.salesforce.com/services/oauth2/token")
    .then()
    .statusCode(200)
    .extract().header("access_token");
	System.out.println(oauth_token);
   }
}
