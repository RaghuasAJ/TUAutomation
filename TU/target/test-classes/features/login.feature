Feature: Login

Scenario: Login With Valid Data
Given I am in Home page
When I Select on Login Link
And I should see the login page
And I enter email "chandanrauniyar2002@gmail.com" and password "Test1277"
#And I enter the valid email address and valid password
And I click login buuton
Then i should see the welcome page

@raghu
Scenario: Register with valid credentials
Given I am in Home page
When I click on Register Link
And I should see Register Page
And I select Register Button on register page
And I enter valid details
|Title|mr|
|EmailId|chandanrauniyar2002@gmail.com|
|FirstName|Chnadan|
And I select complete registration button
Then I should see welcom page with successful registration 




Scenario Outline: Login With Valid Data
Given I am in Home page
When I Select on Login Link
And I should see the login page
And I enter email "<email id>" and password "<Password>"
#And I enter the valid email address and valid password
And I click login buuton
Then i should see the welcome page

Examples:
|email id|Password|
|chandanrauniyar2002@gmail.com|Test1277|
|raghu2@gmail.com|Test1277|
|shashi@gmail.com|Test1277|





















