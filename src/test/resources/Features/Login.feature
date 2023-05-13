@test @regression
Feature: login functionality

Background:
Given user should be on login page

@abc
Scenario: validLoginTC02
When user enters valid userid and password and click on login button
Then user should navigated to home page
And click on logout


@xyz
Scenario: InvalidLoginTC01
When user enters invalid userid and password and click on login button
Then user can see error message on login page


