

Feature: Tags Example Demo
  

  @Sanity
  Scenario: Example1
    Given user is on login page 
    When user enter valid data
    Then user login successfully
  

  @Sanity
  Scenario: Example2
    Given user is on login page 
    When user enter valid data
    Then user login successfully
    
   @Regression
   Scenario: Example3
   Given user is on login page 
    When user enter valid data
    Then user login successfully