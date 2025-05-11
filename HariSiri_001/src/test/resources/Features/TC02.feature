Feature: Create Skills Records Automatiom in orange hrm
	
Background: Common Steps 
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: TC02- Multiple Test Objects
    And User Enters Usename as "Admin" and Password as "admin123"
    Then Click On LoginButton
    Then Navigate to Skills Page  
    When Add Skill Record <SkillName> and <SDescr>
    When Click on Logout Button
    Then Close the Browser
    
    Examples: 
    |SkillName|SDescr|
    |"Skill111"|"NewSkill111"|
    |"Skill222"|"NewSkill444"|
    |"Skill333"|"NewSkill555"|
    |"Skill555"|"NewSkill666"|
    
    