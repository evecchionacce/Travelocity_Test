Feature: User create a account

  Background:
    Given user open url

  @SingInSuccessful @RegresionSignIn @RegresionTest
  Scenario: user make sing in
    When user enter your date
    Then user should sing in