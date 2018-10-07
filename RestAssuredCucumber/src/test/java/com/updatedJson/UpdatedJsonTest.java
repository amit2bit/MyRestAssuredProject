package com.updatedJson;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/UpdatedJson.feature"},
		glue= {"com/updatedJson"}
		
		)
public class UpdatedJsonTest {
	
	

}
