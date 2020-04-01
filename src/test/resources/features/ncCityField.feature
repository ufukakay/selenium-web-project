Feature: New Customer Verify City Field

  Scenario Outline: Empty / Numeric / Special Character / Blank Space
    Given I go to the New Customer Page City Field
    When  City field "<value>"
    And   Press TAB City Field and move to next Field
    Then  Show Error Message City Field "<message>"

    Examples:

      |     value     |            message                 |
      |               |    City Field must not be blank    |
      |     city12    |      Numbers are not allowed       |
      |     city@**   | Special characters are not allowed |
      |     Keys      | First character can not have space |
