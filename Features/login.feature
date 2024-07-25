
Feature: To test login funtionality
 
  Scenario: To test login functionality with vaild data
    Given Browser is opened
    When user enters url
    When user enters valid username as "<Username>" and password as "<password>"
    And click on login 
    Then user should land on home page
     When user click on logout button
     Then user should logout successfully

     Examples:
     |Username|password|
     |Admin|admin123|
     |abc|abc123|
     |Admin|admin123|
     |xyz|xyz456|