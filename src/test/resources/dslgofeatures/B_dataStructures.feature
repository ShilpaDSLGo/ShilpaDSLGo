@tag
Feature: The module Data Structure
  

  @tag1
  Scenario Outline: Trying the correct script
    Given The user is on Home page 
    When  User Clicks on the DataStructure
    And   User clicks on Time Complexity and try here
    Then   User gives the correct code
    
    #| name  | value | status  |
    #| name1 |     5 | success |

    @tag2
  Scenario Outline: Trying the incorrect script
    Given The user is on Home page link
    When  User Clicks on the DataStructure link
    And   User clicks on Time Complexity link and try here
    Then  User gives the incorrect code


    #Examples: 
      #| name  | value | status  |
      #| name2 |     7 | Fail    |
