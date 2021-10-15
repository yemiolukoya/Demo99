Feature: Login

  Scenario Outline: Data Driven Login
    Given user opens a browser
    And user navigates to "http://demo.guru99.com/V4/"
    And check user navigates to MyAccount page by passing email and password with excel row "<row_index>"
    When user clicked login
    Then welcome to manager's page is displayed with a Manger id: mngr344271

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
