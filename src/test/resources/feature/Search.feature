Feature: Search Functionality

  Background: 
    Given User is on Home Page

  Scenario Outline: FooterHeader_001_SearchBar
    When User clicks on search bar
    And User enters item keyword "<item>"
    And User clicks enter
    Then User can view balance ball on the next page.

    Examples: 
      | item         |
      | balance ball |
