Feature: To Add Nationalities in Orange HRM

Scenario Outline: 
Given user Launches Chrome Browser
Then navigate to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then Enter Username and password as
|Admin|admin123|
Then Click on Login button
Then Click on Admin 
Then Click on Nationalities
Then Click on Add Enter Nationality name 


|Indian1|
|American1|
|European2|
