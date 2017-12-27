Feature: User Registration 

In Order to: become a site member
As a Vistor
I want to Go to registration page,enter first name/last name, phone, email, address, 
username and password and then hit submit.
   
Scenario Outline: Postive - User Registration
   
Given User visits homepage
When User clicks on register link
And user enters "<First name>", "<Last name>", "<E-mail>" , "<password>" , "<confirm password>".
And user clicks on submit button.
Then User recieves confirmation of successful registration
And user closes the browser

Examples:
|First name| |Last name| |  E-mail         | | password | |confirm password|
| John	   | |Johnson  | | JohnJ@gmail.com | | Blue123  | | Blue123| 
