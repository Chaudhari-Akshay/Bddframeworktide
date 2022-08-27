
@tag
Feature: Youtube

  @tag1
  Scenario: To get the youtube channel name of tide
    Given navigate to: "https://tide.com/en-us"
    And Go to footer
    When click youtube icon under fun ways to connect with US
    And Get the youtube channel name of tide
    
 