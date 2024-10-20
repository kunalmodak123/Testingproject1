Feature: Login

  Scenario: Check Login Functionality
    Given FrontAccounting site open in chromebrowser
    When enter demouser value in username field.
    And enter password value in password field.
    Then user should be login.
    And validate whether user is login or not by checking sales quotation entry.
