Feature: Test Finance Info


  @avoid
  Scenario: check Finance details
    Given open Finance_deatils Page
    
    When click on Finance_Info button
    Then should redirect to Finance Info page