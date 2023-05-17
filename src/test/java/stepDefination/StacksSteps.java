package stepDefination;

import java.sql.Driver;

import org.openqa.selenium.By;

import driverfactory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.POMStack;

public class StacksSteps {
	POMStack stack = new POMStack(driverfactory.getDriver());


    @Given("User is logged in and selects Stack from Data Structures")
    public void user_is_logged_in_and_selects_stack_from_data_structures() {
   // stack.goingbackStack();
    	//stack.clickStack();
    }

     @When("User clicks on Operations in Stack")
    public void user_clicks_on_operations_in_stack() {
    stack.clickOperationsInStack();

    }

    @Then("User is on Operations in Stack page")
    public void user_is_on_operations_in_stack_page() throws InterruptedException {
    System.out.println("we are on introduction page");
Thread.sleep(1000);
    }

    @Given("User navigates back to Operations Page")
   public void user_navigates_back_to_operations_page() throws InterruptedException {
   System.out.println("we are on introduction page please write code");
   Thread.sleep(1000);
   }

    @When("User scrolls down on Try Here and writes valid code in python")
    public void user_scrolls_down_on_try_here_and_writes_valid_code_in_python() {
   stack.clickTryHere();
   stack.typeCorrectCode();
   stack.clickRun();

   }

    
   @Then("User checks for stack console")
    public void user_checks_for_stack_console() throws InterruptedException {
   System.out.println("user checks output on console");
   Thread.sleep(1000);
   stack.clearCode();
    }
  
   @Given("User is going back to Operations Page")
   public void user_is_going_back_to_operations_page() throws InterruptedException {
   System.out.println("user is on opertaion page");
   Thread.sleep(1000);
    
   }

   @When("User clicks on Try Here and writes in-valid code")
   public void user_clicks_on_try_here_and_writes_in_valid_code() {
   //stack.clickTryHere();
   stack.typeIncorrectCode();
   stack.clickRun();
   }

   @Then("User accepts pop-up")
   public void user_accepts_pop_up() {
   stack.accpetAlert();
   stack.clickback();
   System.out.println("user accepted pop-up msg");
   
   }

}

	


