package Steps_DsAlgo;


import Driver.DriverFactory;




import POM_DsAlgo.POMTree;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utilities.ConfigReader.getTreeURL;
import static Utilities.ConfigReader.getExpText;
import static Utilities.ConfigReader.getExpText1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

public class TreeSteps {   //1
	POMTree tree = new POMTree(DriverFactory.getDriver());
	
	@Given("user navigates back to home page")
	public void user_navigates_back_to_home_page() {
		DriverFactory.getDriver().navigate().back();
	}

	@When("user chooses the Tree Module from the lists in the home page")
	public void user_chooses_the_tree_module_from_the_dropdown_lists_in_the_home_page() throws InterruptedException {
	    tree.Choose_Tree();
	}

	@Then("user lands on the Tree Module page")
	public void user_lands_on_the_tree_module_page() throws IOException, InterruptedException {
	    String expectedTreeUrl = getTreeURL(); 
	    String actualTreeUrl = DriverFactory.getDriver().getCurrentUrl();
	    Thread.sleep(500);
	    Assert.assertEquals(expectedTreeUrl, actualTreeUrl);
	    Loggerload.info("User Landed on the Tree Page");
	}

	@Given("user is in the Tree Modules page")
	public void user_is_in_the_tree_modules_page() {
	   Loggerload.info("User is in the Tree Module Page");
	}

	@When("user scrolls down and chooses Overview of Trees link")
	public void user_scrolls_down_and_chooses_overview_of_trees_link() throws InterruptedException {
		Actions a = new Actions(DriverFactory.getDriver());
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(500);
		tree.Overview_Click();
		
		tree.Try_Here();
	}

	@When("user trys to enter the invalid python code in the tryEditor Box from {string} and {int}")
	public void user_trys_to_enter_the_invalid_python_code_in_the_try_editor_box_from_and(String sheetName, Integer rowNumber) throws InterruptedException {
		ExcelReader read = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		 Thread.sleep(1000);

		List<String> content =read.getCellData(sheetName,0,rowNumber);
		
		 tree.Editor(content);
		 Thread.sleep(1000);
		 tree.Click_Run();
	Alert alert = DriverFactory.getDriver().switchTo().alert();
		   String alertMessage = alert.getText();
		  System.out.println(alertMessage);
		  alert.accept();
	
	}

	@Then("user checks for the error message")
	public void user_checks_for_the_error_message() throws InterruptedException, IOException {
		String expectedText1 = getExpText1();
	    String actualText = tree.Check_Output();
	    Assert.assertEquals(expectedText1, actualText);
	 
	   Loggerload.error("Invalid Python Code");
	}

	@Given("user redirected back to the Overview of Trees page")
	public void user_redirected_back_to_the_overview_of_trees_page() throws InterruptedException {
		DriverFactory.getDriver().navigate().back();
		Thread.sleep(1000);
		tree.Try_Here();
	}

	@When("user trys to enter the valid python code in the tryEditor Box from {string} and {int}")
	public void user_trys_to_enter_the_valid_python_code_in_the_try_editor_box_from_and(String SheetName, Integer RowNumber) throws InterruptedException {
		ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		Thread.sleep(1000);
		List<String> content =reader1.getCellData(SheetName,0,RowNumber);
		 tree.Editor(content);
		 Thread.sleep(3000);
		 tree.Click_Run();
		 Thread.sleep(3000);
	}

	@Then("user validates the input message in the console")
	public void user_validates_the_input_message_in_the_console() throws IOException {
	    String expectedText = getExpText();
	    String actualText = tree.Check_Output();
	    Assert.assertEquals(expectedText, actualText);
	    Loggerload.info("Valid Python code");
	}
}
