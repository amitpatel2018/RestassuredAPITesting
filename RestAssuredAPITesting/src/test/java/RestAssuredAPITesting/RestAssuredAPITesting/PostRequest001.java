package RestAssuredAPITesting.RestAssuredAPITesting;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class PostRequest001 {
	/*
	@Test
	public void createUser() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Amit");
		map.put("job", "QA");
		JSONObject jobject = new JSONObject(map);
		// jobject.put("firstname", "Aarti"); = not good way 
		RestAssured.given().
			body(jobject).
			contentType("application/json").
			when().
			post("https://reqres.in/api/users").
			then().
			statusCode(201).log().all();
	}
	*/
	
	// String token  = getToken();
	// Header header = new Header("authorization", "Bearer " + token);
	String url = "https://test.salesforce.com/services/oauth2/token?";
	String grantType = "password";
	String clientID = "3MVG98_Psg5cppyaJMvU2E3zL1BuPgH_cLpkoDcnuCvXNnqFGV6xzKk.1atX3TxDuhNnZVAE9TqenZoIFkZru";
	String clientSecret = "3265369361863522187";
	String username = "amit.patel@oodlefinance.com.uat";
	String password = "NavoPasswordForUat@182";
	

	@Test
	public void getTokenAgain() {
		String token = RestAssured.given().post(url + "grant_type=" + grantType + "&client_id=" + clientID + "&client_secret=" + clientSecret + "&username=" + username + "&password=" + password).
						then().
						extract().
						path("access_token");
		System.out.println(token);
	}
	
	/*
	//@BeforeMethod
	public String getToken() {
		String token = 
		RestAssured.given().
		post("https://test.salesforce.com/services/oauth2/token?grant_type=password&client_id=3MVG98_Psg5cppyaJMvU2E3zL1BuPgH_cLpkoDcnuCvXNnqFGV6xzKk.1atX3TxDuhNnZVAE9TqenZoIFkZru&client_secret=3265369361863522187&username=amit.patel@oodlefinance.com.uat&password=NavoPasswordForUat@182").
		then().statusCode(200).extract().path("access_token");
		return token;
	}
	//@Test
	public void createLoanApplication() {
		File file = new File(".//LoanData.json");
		Response response = RestAssured.given().when().header(header).contentType(ContentType.JSON).body(file).
			post("https://oodle--uat.my.salesforce.com/services/apexrest/tobermory/v2/loanapplications/");
		System.out.println(response.getStatusCode());
	}*/
}
