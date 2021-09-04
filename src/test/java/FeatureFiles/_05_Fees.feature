Feature: Fees Functionality


  Background:
    Given Navigate to Mersys
    When User enter valid username and password
    And User navigate to Fees page

  Scenario Outline: Add Fees
    And User create a  Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name        | code   | intCode       | priority |
      | CengizDept  | 00777  | bankTransfer  | 8961     |
      | CengizDept2 | 007772 | bankTransfer2 | 8962     |
      | CengizDept3 | 007773 | bankTransfer3 | 8963     |