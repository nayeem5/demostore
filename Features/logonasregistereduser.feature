@logon
Feature: In Order To: Log on to the website
As A: Registered user
I Want To: Open the website, click on the log on button which is on the top right corner of the index bar, then enter my User name, password and click on the log on button

Scenario Outline:
Given User visit homepage
When   click on the log on button
And   enter my "<User name>" and   "<password>"
And   click Log on button
Then  User will be logged on

Examples:
|User name      | |password|
|JohnJ@gmail.com| |Blue123   |