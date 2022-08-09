Feature: User login data tdd
@DataDriven
    Scenario Outline: verify user valid login
    Given user start home page
    When user insert "<username>" and "<password>"
   	Then user click login button
   	
   	Examples:
   	|username|password|
   	|qatrainer|admin123|
   	|qatrainer|admin123|
   	|qatrainer|admin123|
   	|qatrainer|admin123|
   	|qatrainer|admin123|

   	