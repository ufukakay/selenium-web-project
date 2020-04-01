Feature: New Customer Verify Address Field

  Scenario Outline: Empty / First blank space
    Given I go to the New Customer Pages
    When  Address field "<value>"
    And   Press TABs and move to next Field
    Then  Show Error Messages "<message>"

    Examples:

      |     value     |            message                 |
      |               | Address Field must not be blank    |
      |   Keys        | First character can not have space |
