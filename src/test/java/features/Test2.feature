Feature: API Testing


  Scenario: check flipkart Homepage api
    Given Set API endpoint
    
    When run GET request
    Then should get valid HTTP respone
    