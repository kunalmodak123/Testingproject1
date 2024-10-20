Feature: Login and Logout

  Scenario: Check Sauce Demo Login and Logout functionality
    Given SauceDemo site open in chromebrowser
    When enter standard_user value in username field.
    And enter secret_sauce value in password field.
    And user should be login to sauce demo.
    Then user should be logout from sauce demo.
    And validate whether user is logged out and login page is displayed.
