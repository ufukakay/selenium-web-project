Feature: New Customer Verify Email Field

  Scenario Outline: Empty / First blank space / Cannot Format
    Given I go to the New Customer Page Email
    When  Email field "<value>"
    And   Email Press TAB and move to next Field
    Then  Email Show Error Message "<message>"

    Examples:

      |     value     |            message                 |
      |               | Email-ID must not be blank   |
      |   Keys        | First character can not have space |
      |   ufuk@        | Email-ID is not valid |

