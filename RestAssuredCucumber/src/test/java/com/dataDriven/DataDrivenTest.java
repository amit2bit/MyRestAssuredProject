package com.dataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/trimble/testing/DataDriven.feature"},
		glue= {"com/dataDriven"},
				plugin={"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report6.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
				}
		
		)
public class DataDrivenTest {
	
	

}
