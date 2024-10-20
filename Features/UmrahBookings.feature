

Feature: Hotel Search and Book
  

  
  Scenario: Verify Hotel Search by making a booking
  Given launch chromebrowser in new tab
    And navigate to https://umrahbookings.com/
    When enter kunal@puratech.in value in username field.
    And enter 123 value in password field.
    And user should be login to umrah bookings.
    Then make a hotel search
    And select hotel hotel to book
    And click on book 
    

  
