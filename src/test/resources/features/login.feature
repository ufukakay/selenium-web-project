Feature: Login Page Credentials


  Scenario Outline: Valid UserName and Valid Password
    Given I go to the Guru login page
    When  Enter valid "<username>" and valid "<password>"
    And   Login Button Click
    Then  Login Successful

    Examples:
    | username    | password        |
    | mngr243629  | arymUha         |
#    | mngr243629  | invalidpassword |
#    | invaliduser | arymUha         |
#   | invaliduser | invalidpassword |