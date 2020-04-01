Feature: New Customer Verify State Field

  Scenario Outline: Empty / Numeric / Special Character
    Given I go to the New Customer Page State
    When  State field "<value>"
    And   State Press TAB and move to next Field
    Then  State Show Error Message "<message>"

    Examples:

      |     value     |            message                 |
      |               |      State must not be blank       |
      |    a212       |      Numbers are not allowed       |
      |    a+!        | Special characters are not allowed |
