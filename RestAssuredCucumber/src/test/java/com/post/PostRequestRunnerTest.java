package com.post;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/PostRequest.feature"},
		glue= {"com/post"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"}
		
		
		)
public class PostRequestRunnerTest {
	
	

}
