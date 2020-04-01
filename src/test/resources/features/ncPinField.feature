Feature: New Customer Verify PIN Field

  Scenario Outline: Empty / Numeric / 6 digits / Special Character / First blank space
    Given I go to the New Customer Page PIN
    When  PIN field "<value>"
    And   PIN Press TAB and move to next Field
    Then  PIN Show Error Message "<message>"

    Examples:

      |     value     |            message                 |
      |               | PIN Code must not be blank    |
      |       1234PIN        | Characters are not allowed    |
      |      123         | PIN Code must have 6 Digits   |
      |     123?          | Special characters are not allowed   |
      |   Keys        | First character can not have space |
