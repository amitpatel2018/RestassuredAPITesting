package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllGetRequests {
	
	@Test
	public void getAllUsersList() {
		RestAssured.baseURI = "https://reqres.in/";
		String allUsersList = RestAssured.given().get("/api/users?page=2").getBody().asString();
		System.out.println(allUsersList);
	}
	
	@Test
	public void getSingleUser() {
		String singleUser = RestAssured.given().get("/api/users/2").getBody().asString();
		System.out.println(singleUser);
	}
	
	@Test
	public void singleUserNotFound() {
		Response response = RestAssured.given().get("/api/users/23");
		String userData = response.getBody().asString();
		
	}
}
