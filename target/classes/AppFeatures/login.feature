Feature: User login test
    
   @Login
    Scenario: verify user valid login
    Given user start home page
    When user insert username and password
   	Then user click login button
   	Then user click logout
   
   

   