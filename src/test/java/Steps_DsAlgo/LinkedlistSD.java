package Steps_DsAlgo;

import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;

import Driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import POM_DsAlgo.POMLinkedList;

import Utilities.Loggerload;

public class LinkedlistSD {
	POMLinkedList linkedlist = new POMLinkedList (DriverFactory.getDriver());
	
	@Given("User selects Linked List Page after logging in")
	public void user_selects_linked_list_page_after_logging_in() {
		 DriverFactory.getDriver().navigate().back();
		System.out.println("User is logged in and trying to acess LinkedList");
	//loginpage.clickLogin();
		linkedlist.Options();
	 linkedlist.selectLinkedList();
	 
	}

	@When("User clicks introduction button")
	public void user_clicks_introduction_button() throws InterruptedException {
	  linkedlist.clickIntroduction();
	   Thread.sleep(1000);
	   Actions a = new Actions(DriverFactory.getDriver());
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	   System.out.println("User clicked on linked list");
	 
	}


	@Then("User is directed to the Intorduction Page of Linked List")
	public void user_is_directed_to_the_introduction_page_of_Linked_List() {
	System.out.println("we are on introduction page");

	}

	@Given("User is on Introduction Page")
	public void user_is_on_introduction_page() throws InterruptedException {
		linkedlist.clickTryHere();
	   Thread.sleep(1000);

	}

	@When("User clicks Try Here and writes in-valid code in python")
	public void user_clicks_try_here_and_writes_in_valid_code_in_python() throws InterruptedException {
		
	linkedlist.typeIncorrectCode();
	Thread.sleep(1000);
	linkedlist.clickRun();
	System.out.println("user types in-correct code");
	   
	}

	@Then("User accept The pop - up block appears")
	public void user_accept_the_pop_up_block_appears() {
	linkedlist.accpetAlert();
	Loggerload.info("User tries the incorrect code in Linkedlist");

	}

	@Given("User Clears the code")
	public void user_clears_the_code(){
        System.out.println("user types correct code");
	

	}

	@When("User clicks on in Try Here and writes valid code in python")
	public void user_clicks_on_in_try_here_and_writes_valid_code_in_python() throws InterruptedException {
	Thread.sleep(1000);
DriverFactory.getDriver().navigate().back();
linkedlist.clickTryHere();
	linkedlist.typeCorrectCode();
	Thread.sleep(1000);
	linkedlist.clickRun();
   // linkedlist.accpetAlert();
 
	}

	@Then("User checks for console")
	public void user_checks_for_console() throws InterruptedException {
		
	Loggerload.info("User tries the correct code in Linkedlist");

	}

	}



