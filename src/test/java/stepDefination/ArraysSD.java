package stepDefination;

import org.openqa.selenium.UnhandledAlertException;

import driverfactory.driverfactory;
import io.cucumber.java.en.*;
import pageobject.POarrays;
import utilities.LoggerLoad;

public class ArraysSD {
	POarrays Arraypage =new POarrays(driverfactory.getDriver());
	
	@Given("The user is able to navigate to Array Data Structure Page.")
	public void the_user_is_on_the_after_logged_in() {
		Arraypage.arrays();
   
}

	@When("The user clicks Arrays in Python button.")
	public void the_user_clicks_button () {
		
		Arraypage.arrayPython();
		Arraypage.tryHere();
//		try {
//		Arraypage.arrayPython();
//		Arraypage.tryHere();
//		}catch	(UnhandledAlertException e) {
//		    // Handle the alert dialog
//		    Arraypage.acceptAlert();
//}
		}

	@Then("The user tries the correct script")
	public void the_user_tries_the_correct_script() throws InterruptedException {
		Thread.sleep(3000);
		//Arraypage.typeArray1();
		Arraypage.typeArray2();
		Arraypage.clickRun();
		LoggerLoad.info("User tried the correct code in arrays");
		
    
}

	//Scenario two
	
	@Given("The user is on the Array page link  after logged in.")
	public void the_user_is_on_the_array_page_link_after_logged_in() {
		System.out.println("User will try the incorrect code in Array");
		Arraypage.clearCode();
   
}

	@When("The user clicks Arrays in Python link button.")
	public void the_user_clicks_Arrays_in_Python_link_button() throws InterruptedException {
		Thread.sleep(3000);
		Arraypage.typeArray3();
		Arraypage.clickRun();
		
    
}

	@Then("The user tries the incorrect script link.")
	public void the_user_tries_the_incorrect_script_link() throws InterruptedException {
		Thread.sleep(1000);
		Arraypage.acceptAlert();
		Arraypage.clickBack();
		Arraypage.clickBack();
		Arraypage.clickBack();

		LoggerLoad.info("User tried the incorrect code in arrays");
}


}
