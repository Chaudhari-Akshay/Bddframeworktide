#Author: Akshay

@tag
Feature: Tide Cleaners

  @tag1
  Scenario: Get the  Feature Tide Cleaners
    Given Go to Url "https://tide.com/en-us"
     And hover on Our commitment and click on tide cleaners 
    When click on Price and location
    And click on services near you
    And get newly open page title 
  