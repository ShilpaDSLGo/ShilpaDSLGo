@tag
Feature: Run the tryEditor in Overview of Trees Tree Module 
@tag1 
Scenario: Choosing of Tree Module from the List page
Given user navigates back to home page
When user chooses the Tree Module from the lists in the home page
Then user lands on the Tree Module page
@tag2 
Scenario Outline: Testing the tryEditor Box with invalid syntax in Overview of Trees Option
Given user is in the Tree Modules page
When user scrolls down and chooses Overview of Trees link
And user trys to enter the invalid python code in the tryEditor Box from "<sheetName>" and <rowNumber> 
Then user checks for the error message
Examples: 
| sheetName | rowNumber |
| Python | 3 | 
@last
Scenario Outline: Testing the tryEditor Box with valid syntax in Overview of Trees Option
Given user redirected back to the Overview of Trees page
When user trys to enter the valid python code in the tryEditor Box from "<SheetName>" and <RowNumber> 
Then user validates the input message in the console
Examples: 
| SheetName | RowNumber |
| Python | 4 | 
