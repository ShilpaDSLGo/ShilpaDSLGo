Feature: User should be able to run Queue Module features
@tag1

Scenario: Selecting the Queue Module from the dropdown list
Given user is on the home page
When user select the Queue Module from the dropdown list
Then user goto the Queue Module page

@tag2

Scenario Outline: Test the Queue Module with invalid syntax in editor box

Given user is in the Queue Module page

When user scroll down to select option from Queue list

And user enters the invalid python code in "<sheetName>" and <rowNumber> the editor box

Then user should get a error message

Examples:

| sheetName    | rowNumber |

| Python       | 7         |

@tag3

Scenario Outline: Test the Queue Module with valid syntax in editor box

Given user go back to the Queue Module page

When user enters the valid python code in "<sheetName1>" and <rowNumber1> editor box

Then user should get success message

Examples:

| sheetName1   | rowNumber1 |

| Python       | 8          |

