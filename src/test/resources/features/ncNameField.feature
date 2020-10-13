Feature: New Customer Verify Name Field

  Scenario Outline: Empty / numeric / special
    Given I go to the New Customer Page
    When  Name field "<value>"
    And   Press TAB and move to next Field
    Then  Show Error Message "<message>"

    Examples:

    |     value     |            message                 |
    |               | Customer name must not be blank    |
    |    ufuk123    | Numbers are not allowed            |
    |    ufuk@**    | Special characters are not allowed |