Feature: Test Inventory page

  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

  Scenario: Test the navigation menu
    #And the navigation menu should be visible
    Then user opens the menu
    And user navigates to "All Items"
    Then all the products should be available

    Scenario: Test sorting products
      And sort by "Price (low to high)"
      And the first listed product should be "Sauce Labs Onesie"
      And sort by "Price (high to low)"
      And the first listed product should be "Sauce Labs Fleece Jacket"


    Scenario: test Cart
      And user navigates to "Cart"
