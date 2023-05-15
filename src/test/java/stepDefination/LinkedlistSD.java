package stepDefination;

import driverfactory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.POMLinkedList;
import pageobject.POloginclass;
import utilities.LoggerLoad;

public class LinkedlistSD {
	POMLinkedList linkedlist = new POMLinkedList (driverfactory.getDriver());
	POloginclass loginpage = new POloginclass(driverfactory.getDriver());

	@Given("User selects Linked List Page after logging in")
	public void user_selects_linked_list_page_after_logging_in() {
	System.out.println("User is logged in and trying to acess LinkedList");
	//loginpage.clickLogin();
	 linkedlist.selectLinkedList();
	 
	}

	@When("User clicks introduction button")
	public void user_clicks_introduction_button() throws InterruptedException {
	  linkedlist.clickIntroduction();
	   Thread.sleep(1000);
	   System.out.println("User clicke don linked list");
	 
	}


	@Then("User is directed to the Intorduction Page of Linked List")
	public void user_is_directed_to_the_introduction_page_of_Linked_List() {
	System.out.println("we are on introduction page");

	}

	@Given("User is on Introduction Page")
	public void user_is_on_introduction_page() throws InterruptedException {
	System.out.println("we are on introduction page");
	   Thread.sleep(1000);

	}

	@When("User clicks Try Here and writes in-valid code in python")
	public void user_clicks_try_here_and_writes_in_valid_code_in_python() throws InterruptedException {
	Thread.sleep(1000);
	linkedlist.clickTryHere();
	linkedlist.typeIncorrectCode();
	linkedlist.clickRun();
	
	System.out.println("user types in-correct code");
	   
	}

	@Then("User accept The pop - up block appears")
	public void user_accept_the_pop_up_block_appears() {
	linkedlist.accpetAlert();
	LoggerLoad.info("User tries the incorrect code in Linkedlist");

	}

	@Given("User Clears the code")
	public void user_clears_the_code() throws InterruptedException {
    linkedlist.clearCode();
    System.out.println("user types correct code");
	Thread.sleep(1000);

	}

	@When("User clicks on in Try Here and writes valid code in python")
	public void user_clicks_on_in_try_here_and_writes_valid_code_in_python() throws InterruptedException {
	Thread.sleep(1000);
	linkedlist.clickTryHere();
	linkedlist.typeCorrectCode();
	linkedlist.clickRun();
	linkedlist.accpetAlert();
 
	}

	@Then("User checks for console")
	public void user_checks_for_console() throws InterruptedException {
	Thread.sleep(1000);
	linkedlist.clickBack();	
	linkedlist.clickBack();	
	linkedlist.clickBack();
//	linkedlist.selectOptionByVisibleText("Stack");
	LoggerLoad.info("User tries the correct code in Linkedlist");

	}

	}



