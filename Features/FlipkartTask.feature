

Feature: Flipkart Search and Add To Cart

  Scenario Outline: Verify Flipkart Search by adding products in cart
    Given launch chromebrowser
    And navigate to https://www.flipkart.com/
    When search the "<product>" in flipkart
    Then add product to cart
    And I verify the product "<Title>" in step

    Examples: 
      | product  | Title                        | 
      | shoes    | Shopping Cart  Flipkart.com | 
      | watch    | Shopping Cart  Flipkart.com |
      | gopro    | Shopping Cart  Flipkart.com |
      | phone    | Shopping Cart  Flipkart.com |
     
