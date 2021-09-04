Feature: Login to Mersys

  Scenario: Login Mersys with valid username and password
    Given Navigate to Mersys
    When User enter valid username and password
    Then User should login successfully