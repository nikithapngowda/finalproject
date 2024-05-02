Feature: Finding Hospital - Practo

  Scenario: click on practo drive and enter invalid details
    Given the user is on Practo Home Page
    When user will select practo drive
    Then user will enter invalid details and capture the warning message
