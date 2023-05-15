@tag
Feature: The module Arrays
  

  @tag1
  Scenario Outline: Trying the correct script
    Given The user is able to navigate to Array Data Structure Page. 
    When The user clicks Arrays in Python button.
    Then  The user tries the correct script 
    
    #| name  | value | status  |
    #| name1 |     5 | success |

    @tag2
  Scenario Outline: Trying the incorrect script
    Given The user is on the Array page link  after logged in.
    When  The user clicks Arrays in Python link button.
    Then  The user tries the incorrect script link.


    #Examples: 
      #| name  | value | status  |
      #| name2 |     7 | Fail    |
