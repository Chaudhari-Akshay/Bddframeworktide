#Author:Akshay
@tag
Feature: Stain Remover
 

  @tag1
  Scenario: Get article for stain remover
    Given navigate to "https://tide.com/en-us"
    When hover on Shop products and click on stain remover
    And click on deep clean and click on article
    Then get Text of article
