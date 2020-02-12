Feature: New Customer Verify Name Field

  Scenario: Name field is empty
    Given I go to the New Customer Page
    When  Name field empty
    And   Press TAB and move to next Field
    Then  Show Error Message

