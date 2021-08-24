Feature: Login Functionality

  # We can have multiple scenarios for a single feature
  # After creating scenarios in a feature file, we need to create step definition
  # All the step are reusable - once we create the step definition for a step we don't have to do it again

  Scenario: Login with valid username and password
    Given Navigate to the website
    When User enters valid username and password
    Then User should be able to login their account

# eger yazilarin backround u sari renk te olursa, loginFunction.java dosyasinda tanimlanmadigi icindir
  Scenario: Login with invalid username and password
    Given Navigate to the website
    When User enters invalid username and password
    Then User should not login to their account