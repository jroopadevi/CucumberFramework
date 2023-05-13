package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.CommonActions;

public class HomePage {
	
private WebDriver driver;
private CommonActions actions;

	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	@FindBy(linkText="New Lead")
	WebElement NewLead;
	
	
	public void clickLogout()
	{
		//logout.click();
		actions.clickElement(logout, "Link Logout clicked");
	}
	
	public void clickNewLead()
	{
		actions.clickElement(NewLead, "Link New Lead clicked");
	}

}
