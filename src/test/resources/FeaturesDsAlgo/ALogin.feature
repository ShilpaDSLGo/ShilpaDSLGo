@tag
Feature: Register new Account

Scenario Outline: Creating new user account
Given user is in the dsalgo url page
When user enters invalid data from "<sheetName>" and <rowNumber> in excelpath
Then user prints the error message
Examples:
| sheetName | rowNumber |
| Register | 2          |
Scenario Outline: Creating new user account
Given user is in the dsalgo register page
When user enters valid data from "<sheetName>" and <rowNumber> excelpath
Then user lands on the login page
Examples:
| sheetName | rowNumber |
| Register  | 3         |
@third 
Scenario Outline: Validate the login page with invalid credentials
Given user is in the login page
When user enters invalid username from "<SheetName>" and password from <rowNumber2>
Then user stays on the login page
Examples: 
| SheetName | rowNumber2 |
| LoginPage | 3          |
@second 
Scenario Outline: Validate the login page with valid credentials
Given user is in the login page
When user enters valid username from "<SheetName>" and password from <rowNumber1>
Then user lands on the home page
Examples:
| SheetName | rowNumber1 |
| LoginPage | 2          |
