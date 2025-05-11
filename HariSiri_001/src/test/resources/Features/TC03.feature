Feature: Create Skills Records Automatiom in orange hrm
	
Background: Common Steps 
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC03- Data Table Without Headers
    And User Enters Login Credentials
    
    |Admin|admin123|
    
    Then Click On LoginButton
    Then Navigate to Skills Page  
    When Add Skill Record Using Data Table Without Headers
    
    |JAva123|JavaDescr123|
    |JAva222|JavaDescr223|
    |JAva333|JavaDescr333|
    |JAva444|JavaDescr444|
    
    When Click on Logout Button
    Then Close the Browser
    
    