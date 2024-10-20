

Feature: Google Search.
  
  Scenario Outline: Verify Google Search functionality by search some product.
    Given launch chrome browser
    And navigate to https://www.google.com/
    When search the "<product>"
    Then I verify the "<Title>" in step

    Examples: 
      | product  | Title                 | 
      | shoes    | shoes - Google Search | 
      | watch    | watch - Google Search |
      | gopro    | gopro - Google Search |
      | phone    | phone - Google Search |
