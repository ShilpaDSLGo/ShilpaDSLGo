@tag
Feature: The module Data Structure
  

  @tag1
  Scenario: Trying the correct script
    Given The user is on Home page 
    When  User Clicks on the DataStructure
    And   User clicks on Time Complexity and try here
    Then   User gives the correct code
    
    @tag2
  Scenario: Trying the incorrect script
    Given The user is on Home page link
    When  User Clicks on the DataStructure link
    And   User clicks on Time Complexity link and try here
    Then  User gives the incorrect code


   
