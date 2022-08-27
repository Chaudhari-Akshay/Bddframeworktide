#Author: Akshay

@tag
Feature: Search

  @tag1
  Scenario: To verify the Search Scenario
    Given Open the URL "https://tide.com/en-us"
    When  Search for "<Item>"
    And click on First Product
    Then Click Get Product name

     Examples: 
      | Item |
      | powder | 
      