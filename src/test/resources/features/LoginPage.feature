#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
 
Feature: User Authentication for Leaftaps Application

@positive
Scenario: Successful Login using Valid Credentials

Given the user is on the login page
When the user enters the username as 'demosalesmanager'
And the user enters the password as 'crmsfa'
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should view the welcome message

@negative
Scenario: Unsuccesful Login using Invalid Credentials

Given the user is on the login page
When the user enters the username as 'salesmanager'
And the user enters the password as 'crmsa'
And the user clicks the login button
But the user should not be redirected to welcome page
 