@Nelogin
Feature: User Registration 

In Order to: become a site member
As a Vistor
I want to Go to registration page,enter first name/last name, phone, email, address, 
username and password and then hit submit.
   
Scenario Outline: Negative - User Registration
   
Given User does visit homepage.
When User does click on register link
And user enters "<First name>", "<Last name>", "<E-mail>" , "<password>" , wrong "<confirm password>".
And user does click on submit button.
Then User recieves password do not match.
And closes the browser

Examples:
|First name| |Last name| |  E-mail         | | password | |confirm password|
| John	   | |Johnson  | | JohnJ@gmail.com | | Blue123  | | Blue124|