package Steps_DsAlgo;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import Driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import POM_DsAlgo.POMStack;

public class StacksSteps {
	POMStack stack = new POMStack(DriverFactory.getDriver());


    @Given("User is logged in and selects Stack from Data Structures")
    public void user_is_logged_in_and_selects_stack_from_data_structures() {
    	DriverFactory.getDriver().navigate().back();
//    	Actions a = new Actions(DriverFactory.getDriver());
//    	//scroll down a page
//    	a.sendKeys(Keys.PAGE_UP).build().perform();	
//    	Thread.sleep(1000);
        stack.Options();
    	stack.clickStack();
    }

     @When("User clicks on Operations in Stack")
    public void user_clicks_on_operations_in_stack() {
    stack.clickOperationsInStack();

    }

    @Then("User is on Operations in Stack page")
    public void user_is_on_operations_in_stack_page() throws InterruptedException {
    	Actions a = new Actions(DriverFactory.getDriver());
    	//scroll down a page
    	a.sendKeys(Keys.PAGE_DOWN).build().perform();	
    	System.out.println("we are on introduction page");

    }

    @Given("User navigates back to Operations Page")
   public void user_navigates_back_to_operations_page() throws InterruptedException {
   System.out.println("we are on introduction page please write code");
   
   }

    @When("User scrolls down on Try Here and writes valid code in python")
    public void user_scrolls_down_on_try_here_and_writes_valid_code_in_python() throws InterruptedException {
   stack.clickTryHere();
   Thread.sleep(1000);
   stack.typeCorrectCode();
   Thread.sleep(1000);
   stack.clickRun();

   }

    
   @Then("User checks for stack console")
    public void user_checks_for_stack_console() throws InterruptedException {
   System.out.println("user checks output on console");
   Thread.sleep(1000);
 //  stack.clearCode();
    }
  
   @Given("User is going back to Operations Page")
   public void user_is_going_back_to_operations_page() throws InterruptedException {
   System.out.println("user is on opertaion page");
   DriverFactory.getDriver().navigate().back();
   Thread.sleep(1000);
   stack.clickTryHere();
   }

   @When("User clicks on Try Here and writes in-valid code")
   public void user_clicks_on_try_here_and_writes_in_valid_code() throws InterruptedException {

   stack.typeIncorrectCode();
   Thread.sleep(1000);
   stack.clickRun();
   }

   @Then("User accepts pop-up")
   public void user_accepts_pop_up() {
   stack.accpetAlert();
      System.out.println("user accepted pop-up msg");
   
   }

}

	


