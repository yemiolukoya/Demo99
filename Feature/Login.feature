Feature: Login to guru99 bank

Scenario: validate user can login with valid credentials

Given user opens a browser
And user navigates to "http://demo.guru99.com/V4/"
And user enters a valid "UserID" and "Password"
When user clicked login
Then welcome to manager's page is displayed with a Manger id: mngr344271