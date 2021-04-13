Feature: Test login functionality

  Scenario: check login
    Given browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to the home page
