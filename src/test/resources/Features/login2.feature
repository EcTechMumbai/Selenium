  Feature: LoginFeature
  
  Scenario Outline: Login with correct username and password using scenario outline
    Given user navigate to the login page
    And user enter <username> and <password> 
    And click login button
    Then user should see the userform page
    
    Examples:
    |username|password		|
    |execute |automation    |
    |Testing |QA			|