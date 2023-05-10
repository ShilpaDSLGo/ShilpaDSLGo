Feature: dsLgo project login

@First
 Scenario: Registring in dsportal app portal
  
    Given The dsportal browser is open
    When User clicks on the Get Started butoon
    Then User is navigated to the Registering page
   
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



  