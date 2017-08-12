Feature: As a user
  I want to search in google.co.uk for "iPhone"
  In order to find the result from amazon.co.uk and find the price and name of the largest capacity iPhone


  Scenario: Search Google
    Given I am on the home page
    And I search for "iPhone"
    And I found results
    And I navigate to the result from "amazon.co.uk"
    When I select the iPhone with the largest storage capacity
    Then I can see the name of the phone
    And I can see the price of the phone