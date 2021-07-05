Feature: user search flights on the page

  Background:
    Given user open url

  @ChooseFly @RegresionVuelos @RegresionTest
  Scenario: user search flights on the page
    When user enter the data on fly
    Then user should the result fly

  @NoDestiny @RegresionVuelos @RegresionTest
  Scenario: user dont enter the destiny
    When user dont enter the destiny
    Then user shoud see a mesaage informaty

  @SameDestiny @RegresionVuelos @RegresionTest
  Scenario: user choose same destiny
    When user choose same destiny
    Then user shoud see a mesaage informaty
