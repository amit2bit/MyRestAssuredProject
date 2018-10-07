package com.post;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/PostRequest.feature"},
		glue= {"com/restAssured/PostRequest/"}
		
		)
public class PostRequestRunnerTest {
	
	

}
