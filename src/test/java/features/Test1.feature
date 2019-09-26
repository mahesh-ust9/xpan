
Feature: Testing


  Scenario: validate login Page
    Given Open login Page
    And Enter valid username and password
    
    When clicked on login button
    Then should open Homepage
    