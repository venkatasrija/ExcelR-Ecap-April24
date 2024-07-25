

Feature: Swaglab Login
  I want to use this template for my feature file

  
  Scenario: Login with vaild data
    Given User is on homepage 
    When user enters data username as "standard_user" and password as "secret_sauce"
    And click on Swaglogin button
    Then user login successfully with swaglab
  
