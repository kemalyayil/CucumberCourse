Feature: Citizenship Functionality

  Background:
    Given Navigate to Mersys
    When User enter valid username and password
    And User navigate to Citizenship page

  Scenario: Add Citizenship
    And User create a citizenship with "Test1234567" name and "T12345" shortname
    Then Success message should be displayed

  Scenario: Edit Citizenship
    And User edit the "Test1234567" citizenship to "Something1234567"
    Then Success message should be displayed

  Scenario: Delete Citizenship
    And User delete "Something1234567" citizenship
    Then Success message should be displayed