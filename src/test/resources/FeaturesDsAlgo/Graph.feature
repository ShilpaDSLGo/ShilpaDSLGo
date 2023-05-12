@tag

Feature: User should be able to run Graph Module features

@tag1

Scenario: Selecting the Graph Module from the dropdown list

Given user is on home page

When user selecting the Graph Module from the dropdown list

Then user will goto the Graph Module page

@tag2

Scenario Outline: Test the Graph Module with invalid syntax in editor box

Given user is on the Graph Module page

When user can scroll down to select option from Graph list

And user enters the invalid python code with "<sheetName>" and <rowNumber> in grapheditor box

Then user should have error message

Examples:

| sheetName | rowNumber |
| Python    | 5        |

@tag3

Scenario Outline: Test the Graph Module with valid syntax in editor box

Given user go back to the Graph Module page

When user scroll down to select option from Graph list

And user enters the valid python code in "<sheetName>" and <rowNumber> grapheditor box

Then user should get successful message

Examples:

| sheetName | rowNumber |

| Python    |     6     |