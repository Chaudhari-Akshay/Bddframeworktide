
@tag
Feature: Contact us

  @tag1
  Scenario: to get the Number for contact
    Given open "https://tide.com/en-us"
 And Click on Contact us
    When click on call
    And get number for contact
    