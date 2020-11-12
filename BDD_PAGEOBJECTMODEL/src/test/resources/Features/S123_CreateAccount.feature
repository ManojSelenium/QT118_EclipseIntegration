Feature: Create Account flow

Scenario: Verify user can able to create an account
Given I launch the browser
When I enter URL
And I click on signin link in the landing page
And I enter create account email address "test986@yopmail.com"
And I click on create account button
And I enter firstname as "John" 
And I enter lastname as "David"
And I enter password as "Password@123"
And I enter address as "address"
And I enter city as "Test City"
And I select state as "5"
And I enter zipcode as "11111"
And I enter phonenumber as "7659879656"
And I enter alias as "7659879656"
And I click on register button
 