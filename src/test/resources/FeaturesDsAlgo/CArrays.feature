@tag
Feature: The module Arrays
  

  @tag1
  Scenario: Trying the correct script
    Given The user is able to navigate to Array Data Structure Page. 
    When The user clicks Arrays in Python button.
    Then  The user tries the correct script 
    
   
    @tag2
  Scenario: Trying the incorrect script
    Given The user is on the Array page link  after logged in.
    When  The user clicks Arrays in Python link button.
    Then  The user tries the incorrect script link.

Scenario Outline: Testing the tryEditor Box with valid syntax in Find Even Numbers Question
Given user lands on home page
When user trys to enter the valid python code in Search tryEditor Box using "<SheetName>" and <RowNumber1> from excel
When user trys to enter the valid python code in Max tryEditor Box using "<SheetName>" and <RowNumber2> from excel
When user trys to enter the valid python code in the tryEditor Box using "<SheetName>" and <RowNumber> from excel
Then user validates the input message printed in the console
Examples: 
| SheetName | RowNumber | RowNumber1 | RowNumber2 |
| Python    | 1         |  9         |  10        |
Scenario Outline: Testing the tryEditor Box with valid syntax in Squares of a Sorted Array Question
Given user redirected back to the Practice Questions page
When user trys to enter the valid python code in the tryEditor Box using "<SheetName>" and <RowNumber> from excel sheet
Then user validates the input message printed in console
Examples: 
| SheetName | RowNumber |
| Python    | 2         | 
   