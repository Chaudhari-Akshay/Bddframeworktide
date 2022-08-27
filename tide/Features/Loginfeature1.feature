#Author: Akshay

@tag
Feature: Login

  @tag1
  Scenario: To verify the Login Scenario
    Given Open the URL: "https://tide.com/en-us"
    When Click Register
    And Click on Sign up Now
    Then Click on Log in
    And Enter "akshaypatilchuadhary@gmail.com" in email
    And Enter "abcd@123" in password section
    Then click on login button
    
    