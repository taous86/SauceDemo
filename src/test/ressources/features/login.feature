@login
Feature: Test Login functionality

  Scenario: The user should be able to login
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

  Scenario Outline: Test all accepted users
    Given user is on the sauceDemo LoginPage
    And user logs in with "<user>","<pass>"
    Then user should land on the Inventory page

    Examples:
      | user                    | pass         |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |


  Scenario: The user should not be able to login with invalid data
    Given user is on the sauceDemo LoginPage
    And user logs in with "locked_out_user","secret_sauce"
    Then user should see the error button


