Feature: Test the Orange HRM application

  Scenario: Test Login functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  #Suraj Automation test Engineer
  Scenario: Test Home Page Functionality
    When user is on home page and validate home page title
    And validate home page url
    And validate home page logo

    #Gauri Automation test Engineer
    Scenario: PIM page Functionality
    When user click on PIM link
    Then Click on Add Employee 
    And Enter Firstname MiddleName LastName and capture the Empid
    And Click on save button.
    
    #Kreeti Automation test Engineer
    Scenario: Test my info functionality
    When User click on My Info link
    And User enter Firstname MiddleName LastName
    And User click on save button