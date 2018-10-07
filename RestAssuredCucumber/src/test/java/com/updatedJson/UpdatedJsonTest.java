package com.updatedJson;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/UpdatedJson.feature"},
		glue= {"com/updatedJson"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"}
		
		
		)
public class UpdatedJsonTest {
	
	

}
