package com.dataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/DataDriven.feature"},
		glue= {"com/dataDriven"}
		
		)
public class DataDrivenTest {
	
	

}
