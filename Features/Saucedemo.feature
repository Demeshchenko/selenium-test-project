Feature: Saucedemo login

  Scenario: Logo present on Saucedemo home page
    Given I launch chrome browser
    When I open Saucedemo HomePage
    Then I Verify that the Logo present on page
    And Close browser