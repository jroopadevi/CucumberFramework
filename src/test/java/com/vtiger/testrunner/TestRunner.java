package com.vtiger.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vtiger.stepdefinitions.BaseTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue="com.vtiger.stepdefinitions",
		plugin = { "pretty", "html:target/cucumber-html-report.html","json:target/cucumber.json" }
		,tags = "@regression"
		//,dryRun=true
		
		)

public class TestRunner {
	
	
	@AfterClass
    public static void tearDown()
	{

    BaseTest.driver.quit();
    
	}

}
