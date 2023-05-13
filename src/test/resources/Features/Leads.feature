@Leads @regression
Feature: leads functionality


Scenario: CreateLeadwithMandatoryFields_TC04
Given user should be on home page
When user click on new lead
Then user should be navigated to new lead page 
When user enters lastname and company name and click on save button
Then lead should be created successfully
And click on logout