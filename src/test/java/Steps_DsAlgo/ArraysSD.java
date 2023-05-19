package Steps_DsAlgo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.interactions.Actions;

import Driver.DriverFactory;
import io.cucumber.java.en.*;
import POM_DsAlgo.POarrays;
import Utilities.ExcelReader;
import Utilities.Loggerload;

public class ArraysSD {
	POarrays Arraypage =new POarrays(DriverFactory.getDriver());
	
	@Given("The user is able to navigate to Array Data Structure Page.")
	public void the_user_is_on_the_after_logged_in() throws InterruptedException {
		 DriverFactory.getDriver().navigate().back();
		Arraypage.Click_Arrays();
   
}

	@When("The user clicks Arrays in Python button.")
	public void the_user_clicks_button () throws InterruptedException {
		Actions a = new Actions(DriverFactory.getDriver());
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		Arraypage.arrayPython();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(500);
		Arraypage.tryHere();
	
		}

	@Then("The user tries the correct script")
	public void the_user_tries_the_correct_script() throws InterruptedException {
		
		//Arraypage.typeArray1();
		Arraypage.typeArray2();
		Thread.sleep(1000);
		Arraypage.clickRun();
		Loggerload.info("User tried the correct code in arrays");
		    
}

	//Scenario two
	
	@Given("The user is on the Array page link  after logged in.")
	public void the_user_is_on_the_array_page_link_after_logged_in() {
		System.out.println("User will try the incorrect code in Array");
		//Arraypage.clearCode();
   
}

	@When("The user clicks Arrays in Python link button.")
	public void the_user_clicks_Arrays_in_Python_link_button() throws InterruptedException {
		DriverFactory.getDriver().navigate().back();
		Arraypage.Try_Here();
		Thread.sleep(1000);
		Arraypage.typeArray3();
		Arraypage.clickRun();
		
    
}

	@Then("The user tries the incorrect script link.")
	public void the_user_tries_the_incorrect_script_link() throws InterruptedException {
		Thread.sleep(1000);
		Arraypage.acceptAlert();
		//Arraypage.clickBack();
		//Arraypage.clickBack();

		Loggerload.info("User tried the incorrect code in arrays");
}
	 @Given("user lands on home page")
	 public void user_lands_on_home_page() throws InterruptedException {
		 Loggerload.info("User is in the home page");
		// Arraypage.Click_Arrays();
		 DriverFactory.getDriver().navigate().back();
			
		 Actions a = new Actions(DriverFactory.getDriver());
			//scroll down a page
			a.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			Arraypage.Click_Practice();
			
						}

	 @When("user trys to enter the valid python code in the tryEditor Box using {string} and {int} from excel")
	 public void user_trys_to_enter_the_valid_python_code_in_the_try_editor_box_using_and(String SheetName, Integer RowNumber) throws InterruptedException {
		 DriverFactory.getDriver().navigate().back();
		 Arraypage.Click_Numbers();
			
		 Thread.sleep(1000);
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
			
			List<String> content =reader1.getCellData(SheetName,0,RowNumber);
			Arraypage.Editor(content);
			 Thread.sleep(1000);
			 Arraypage.clickRun();
			 DriverFactory.getDriver().navigate().back();
			 
	 }
	 @When("user trys to enter the valid python code in Search tryEditor Box using {string} and {int} from excel")
	 public void user_trys_to_enter_in_the_valid_python_code_in_the_try_editor_box_using_and(String SheetName, Integer RowNumber1) throws InterruptedException {
		 Arraypage.Click_Search();
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");
			List<String> content =reader1.getCellData(SheetName,0,RowNumber1);
			Arraypage.Editor(content);
			 Thread.sleep(1000);
			 Arraypage.clickRun();
	 }
	 @When("user trys to enter the valid python code in Max tryEditor Box using {string} and {int} from excel")
	 public void user_trys_to_the_enter_in_the_valid_python_code_in_the_try_editor_box_using_and(String SheetName, Integer RowNumber2) throws InterruptedException {
	
		 DriverFactory.getDriver().navigate().back();
		 Arraypage.Click_Max();
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");
			List<String> content =reader1.getCellData(SheetName,0,RowNumber2);
			Arraypage.Editor(content);
			 Thread.sleep(1000);
			 Arraypage.clickRun();
	 }
	 @Then("user validates the input message printed in the console")
	 public void user_validates_the_input_message_printed_in_the_console() throws IOException {
		 
		    Loggerload.info("Valid Python code");
	 }
	 @Given("user redirected back to the Practice Questions page")
	 public void user_redirected_back_to_the_Practice_Questions_page() throws InterruptedException {
		
			Thread.sleep(1000);
			Arraypage.SortQues();
	 }

	 @When("user trys to enter the valid python code in the tryEditor Box using {string} and {int} from excel sheet")
	 public void user_trys_to_enter_the_valid_python_code_in_the_try_editor_box_using_excel_and(String SheetName, Integer RowNumber) throws InterruptedException {
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
			List<String> content =reader1.getCellData(SheetName,0,RowNumber);
			Arraypage.Editor(content);
			 Thread.sleep(1000);
			 Arraypage.clickRun();
			 
	 }

	 @Then("user validates the input message printed in console")
	 public void user_validates_the_input_message_printed_in_console() throws IOException {
		
		 Loggerload.info("Valid Python code");
	 }
}




