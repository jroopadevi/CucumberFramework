package com.vtiger.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadStepdefinitions extends BaseTest {
	
	
	@Given("user should be on home page")
	public void user_should_be_on_home_page() {
		 lp.Login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
	}
	@When("user click on new lead")
	public void user_click_on_new_lead() {
	    hp.clickNewLead();
	}
	@Then("user should be navigated to new lead page")
	public void user_should_be_navigated_to_new_lead_page() {
	    
	}
	@When("user enters lastname and company name and click on save button")
	public void user_enters_lastname_and_company_name_and_click_on_save_button() {
	    ldp.CreateLead(dt.get(TCName).get("LastName"), dt.get(TCName).get("Company"));
	}
	@Then("lead should be created successfully")
	public void lead_should_be_created_successfully() {
	    
	}




}
