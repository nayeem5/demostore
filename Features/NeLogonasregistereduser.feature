@nelogon
Feature: In Order To: Log on to the website
As A: Registered user
I Want To: Open the website, click on the log on button which is on the top right corner of the index bar, then enter my User name, password and click on the log on button

Scenario Outline: (negative)
Given visits the homepage
When  user click on the log on button
And   enter my valid "<User name>" and  wrong "<password>"
And   click the Log on button
Then  User will not be logged on

Examples:
|User name      | |password|
|JohnJ@gmail.com| |Blue12   |