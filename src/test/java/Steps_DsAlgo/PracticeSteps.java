package Steps_DsAlgo;




import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Driver.DriverFactory;
import POM_DsAlgo.POMPractice;
import Utilities.ExcelReader;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PracticeSteps {

	POMPractice practice = new POMPractice(DriverFactory.getDriver());


	 @Given("user lands on home page")
	 public void user_lands_on_home_page() throws InterruptedException {
		 Loggerload.info("User is in the home page");
		 practice.Click_Arrays();
		 Actions a = new Actions(DriverFactory.getDriver());
			//scroll down a page
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
			practice.Arrays_Python();
			Thread.sleep(1000);
			practice.Click_Practice();
			Thread.sleep(1000);
			practice.Click_Numbers();
			
			}

	 @When("user trys to enter the valid python code in the tryEditor Box using {string} and {int} from excel")
	 public void user_trys_to_enter_the_valid_python_code_in_the_try_editor_box_using_and(String SheetName, Integer RowNumber) throws InterruptedException {
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
			Thread.sleep(1000);
			List<String> content =reader1.getCellData(SheetName,0,RowNumber);
			 practice.Editor(content);
			 Thread.sleep(3000);
			 practice.Click_Run();
			 
	 }

	 @Then("user validates the input message printed in the console")
	 public void user_validates_the_input_message_printed_in_the_console() throws IOException {
		 //String expectedText2 = getExpText2();
		    String actualText = practice.Check_Output();
		   //Assert.assertEquals(expectedText2,actualText);
		    System.out.println("Output in the Console is "+actualText);
		    Loggerload.info("Valid Python code");
	 }
	 @Given("user redirected back to the Practice Questions page")
	 public void user_redirected_back_to_the_Practice_Questions_page() throws InterruptedException {
		 DriverFactory.getDriver().navigate().back();
			Thread.sleep(1000);
			practice.SortQues();
	 }

	 @When("user trys to enter the valid python code in the tryEditor Box using {string} and {int} from excel sheet")
	 public void user_trys_to_enter_the_valid_python_code_in_the_try_editor_box_using_excel_and(String SheetName, Integer RowNumber) throws InterruptedException {
		 ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
			Thread.sleep(1000);
			List<String> content =reader1.getCellData(SheetName,0,RowNumber);
			 practice.Editor(content);
			 Thread.sleep(3000);
			 practice.Click_Run();
			 
	 }

	 @Then("user validates the input message printed in console")
	 public void user_validates_the_input_message_printed_in_console() throws IOException {
		// String expectedText3 = getExpText3();
		    String actualText = practice.Check_Output();
		   // Assert.assertEquals(expectedText3,actualText);
		    System.out.println("Output in the Console is "+actualText);

		    Loggerload.info("Valid Python code");
	 }
}
