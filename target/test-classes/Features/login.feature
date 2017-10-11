Feature: LoginFeature

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter users email address as Email:admin
    And I verify the count digits for rs 1000
    
    And i enter following for login
    |username|password		|
    |Hello	 |World		    |
    And click login button
    Then I should see the userform page
    
    
  
 