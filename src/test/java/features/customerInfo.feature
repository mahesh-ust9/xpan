Feature: Test customer details


  Scenario: check customer details
    Given open customer_deatils Page
    
    When click on customer_Info button
    Then should redirect to customer Info page
    