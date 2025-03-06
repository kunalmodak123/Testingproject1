

Feature: Hotel Booking Flow
  

  
  Scenario: Book a Hotel in Makkah for 2 nights
  Given I launch chrome browser
  And I navigate to umrahbookings website
  When I login with username and password 
  And I search for hotel in Makkah with checkin date as "30/03/2025" and check out date as "01/04/2025"
  And I select the first hotel from the results
  And I select the room
  And I fill in passenger details
  Then I see the payment option
    

  
