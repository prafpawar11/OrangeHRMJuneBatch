Feature: Test the Orange HRM application

  Scenario: Test Login functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  #Suraj Automation test Engineer
  Scenario: Test Home Page Functionality
    When user is on home page and validate home page title
    And validate home page url
    And validate home page logo
