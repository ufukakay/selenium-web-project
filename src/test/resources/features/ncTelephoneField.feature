Feature: New Customer Verify Telephone Field

  Scenario Outline: Empty / First blank space / Spaces
    Given I go to the New Customer Page Telephone
    When  Telephone field "<value>"
    And   Telephone Press TAB and move to next Field
    Then  Telephone Show Error Message "<message>"

    Examples:

      |     value     |            message                 |
      |               | Mobile no must not be blank   |
      |   Keys        | First character can not have space |
      |   123 123        | Characters are not allowed |
