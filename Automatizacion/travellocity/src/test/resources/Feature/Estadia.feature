Feature: user search flights on the page
  Background:
    Given user open url

    @ChooseStays @RegresionEstadia @RegresionTest
    Scenario: user search Stays on the page
      When user enter the data on Stays
      Then user should the result