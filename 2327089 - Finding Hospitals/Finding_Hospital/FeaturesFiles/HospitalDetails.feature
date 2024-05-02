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
@tag
Feature: Finding Hospital - Practo

  @sanity @regression
  Scenario: Capture the hospital name and rating
    Given the user is on Practo Home Page
    When user will select City from the City Input Field
    And user will select Hospital Type from Type Input Field
    Then user will capture the list of Hospital name from rating

  #@regression
  #Scenario: Capture Top Cities Name on Book Diagnostic and print all specialties on View all specialties page
    #Given the user navigates to Book Diagnostic Test page
    #When the user capture all the top cities name and navigates back
    #And the user click on View All Specialties
    #Then the user will Capture the list of specialties with price from View All Specialties Page
#
  #@regression
  #Scenario: Enter Invalid data to capture the Invalid Message and check Instagram is present in Social Homepage
    #Given the user click on practo drive
    #When the user enter the details into input field
    #And the user will capture the errorMessage and navigate back to Homepage
    #Then the user check Instagram is present on Social
