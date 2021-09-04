Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to Mersys
    When User enter valid username and password
    And User create a country
    Then Success message should be displayed


  Scenario: Edit Country
    Given Navigate to Mersys
    When User enter valid username and password
    And User edit the country
    Then Success message should be displayed


  Scenario: Delete Country
    Given Navigate to Mersys
    When User enter valid username and password
    And User delete the country
    Then Success message should be displayed