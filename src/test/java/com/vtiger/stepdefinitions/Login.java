package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseTest {
	
	
	
	@Before
	public void GetScenario(Scenario scenario)
	{
		if(driver==null)
		{
		initiation();
		}
		TCName = scenario.getName();
		logger = extent.createTest(TCName);
	}
	
	@After
	public void savereport()
	{
		extent.flush();
		//driver.quit();
	}
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		
	}
	@When("user enters valid userid and password and click on login button")
	public void user_enters_valid_userid_and_password_and_click_on_login_button() {
	    lp.Login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
	}
	
	@When("user enters invalid userid and password and click on login button")
	public void user_enters_invalid_userid_and_password_and_click_on_login_button() {
	    lp.Login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
	}
	
	@Then("user should navigated to home page")
	public void user_should_navigated_to_home_page() {
	   // hp.clickLogout();
	}
	
	@Then("click on logout")
	public void click_on_logout() {
	    hp.clickLogout();
	}
	
	
	
	
	
	@Then("user can see error message on login page")
	public void user_can_see_error_message_on_login_page() {
	  
	    lp.verifyErrorMsg();
	}
	
	



}
