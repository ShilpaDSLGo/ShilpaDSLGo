@tag
Feature: Run the tryEditor in Practice Questions ,Numbers and Square
Scenario Outline: Testing the tryEditor Box with valid syntax in Find Even Numbers Question
Given user lands on home page
When user trys to enter the valid python code in the tryEditor Box using "<SheetName>" and <RowNumber> from excel
Then user validates the input message printed in the console
Examples: 
| SheetName | RowNumber |
| Python    | 1         | 
Scenario Outline: Testing the tryEditor Box with valid syntax in Squares of a Sorted Array Question
Given user redirected back to the Practice Questions page
When user trys to enter the valid python code in the tryEditor Box using "<SheetName>" and <RowNumber> from excel sheet
Then user validates the input message printed in console
Examples: 
| SheetName | RowNumber |
| Python    | 2         | 