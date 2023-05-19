@tag
Feature: Register new Account

Scenario Outline: Creating new user account
Given user is in the dsalgo url page
When user enters invalid data from "<sheetName>" and <rowNumber> in excelpath
Then user prints the error message
Examples:
| sheetName | rowNumber |
| Register | 2          |

Scenario Outline: Validating Login process for User with incorrect credentials
    Given User is on register page
    When User clicks on Login button with entering invalid Username "<SheetName>" and Password <Rownumber>
    Then User should land on register page
    
    Examples:
    
    | SheetName | Rownumber |
    | Test Data |         0 |

    
    
  Scenario Outline: User is trying register with correct credentials
    Given User is on the register page second time
    When clicks on Login button with entering valid Username "<SheetName>" and Password <Rownumber>
    Then User should land on home page

    Examples: 
      | SheetName | Rownumber |
      | Test Data |         1 |



  
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
