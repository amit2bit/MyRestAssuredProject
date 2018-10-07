package com.firstExample;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class CucumberTesting {

Response resp; 
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
		resp=RestAssured.given().when().get("https://google.com");
		//System.out.println("my name is amit");
	   // throw new PendingException();
	}


	@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expectedSC) throws Throwable {
		int i = resp.getStatusCode();
		System.out.println("Status is : " + i); 
		Assert.assertTrue(expectedSC==i);
		System.out.println("Code is: " + i);
		//throw new PendingException();
	}
	

}