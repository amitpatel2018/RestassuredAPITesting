package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequest {
	@Test
	public void getListOfUsers() {
		Response response = RestAssured.given().when().get("https://reqres.in/api/users?page=2");
		response.then().body("data.id[0]", equalTo(7));
		response.then().body("data.first_name", hasItems("Michael", "Lindsay"));
		String resbody = response.getBody().asString();
		System.out.println(resbody);
		System.out.println("Content-type is: " + response.getContentType());
		Map<String, String> cookies = response.getCookies();
		System.out.println("Cookies are: " + cookies);
		System.out.println("Headers are: " + response.getHeaders());
		String statusLine = response.getStatusLine();
		System.out.println("Status line is: " + statusLine);
		String sessionID = response.getSessionId();
		System.out.println("sessionID is: " + sessionID);
		Long time = response.getTime();
		System.out.println("Time is: " + time);
		Long getTimeInDays = response.getTimeIn(TimeUnit.DAYS);
		System.out.println("Time in days is: " + getTimeInDays);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
