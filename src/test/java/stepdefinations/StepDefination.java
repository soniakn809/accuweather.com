package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefination {
	
	RequestSpecification reqSpecs;
	Response res;
	@Given("I have header with key {string} and value {string}")
	public void iHaveHeaderWithKeyAndValue(String key, String value) {
		RestAssured.baseURI = "https://api.openweathermap.org/";
		System.out.println("log given header param");
		reqSpecs = RestAssured.
		given();
		
	}
	
	@Given("query param {string} with value {string}")
	public void queryParamWithValue(String queryParm, String queryValue) {
		System.out.println("log given");
		reqSpecs = reqSpecs.queryParam(queryParm,queryValue)
		.and()
		.queryParam("appid", "7fe67bf08c80ded756e598d6f8fedaea");
	}
	@When("I do a {string} request with path {string}")
	public void iDoARequestWithPath(String string, String url) {
		   System.out.println("log when get");
		  res= reqSpecs.when().log().all().get(url);
	}
	@Then("verify status code is {int}")
	public void verifyStatusCodeIs(Integer expectedStatusCode) {
		   System.out.println("log Then");
		  res.then()
		  .log().body()
		  .statusCode(expectedStatusCode);
	}


}
