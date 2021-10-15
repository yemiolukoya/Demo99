Feature: Create new customer

Scenario: Create a new customer

Given user opens a browser
And user navigates to "http://demo.guru99.com/V4/"
And user enters a valid "UserID" and "Password"
When user clicked login
Then welcome to manager's page is displayed with a Manger id: mngr344271
And user click on new customer link
And fillin all the add customer page
Then Customer Registered Successfully!!! message is displayed