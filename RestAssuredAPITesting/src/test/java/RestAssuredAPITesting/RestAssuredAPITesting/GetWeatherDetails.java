package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetWeatherDetails {
	@Test
	public void getWeatherDetailsForCity() {
		/*
		http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1
		RestAssured.baseURI = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		*/
//		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//		int responseCode = response.statusCode();
//		System.out.println(responseCode + "---" + response.getBody() + "--" + response.asString());
		// given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
		
	}
}
