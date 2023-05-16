package Steps_DsAlgo;

import java.io.IOException;


import java.util.List;

import org.openqa.selenium.Alert;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import static Utilities.ConfigReader.getQueueUrl;
import static Utilities.ConfigReader.getExpText4;
import static Utilities.ConfigReader.getExpText5;



import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import Driver.DriverFactory;
import POM_DsAlgo.POMQueue;
import Utilities.ExcelReader;
import Utilities.Loggerload;

public class QueueSteps {


POMQueue queue = new POMQueue(DriverFactory.getDriver());


@Given("user is on the home page")
public void user_is_on_the_home_page() {

	DriverFactory.getDriver().navigate().back();
System.out.println("User is on home page");

}

@When("user select the Queue Module from the dropdown list")

public void user_select_the_queue_module_from_the_dropdown_list() throws InterruptedException {

queue.dropdownModule();

queue.selectModule();
System.out.println("user select queue module");

}

@Then("user goto the Queue Module page")

public void user_goto_the_queue_module_page() throws IOException {

String actualQueueUrl = DriverFactory.getDriver().getCurrentUrl();

String expectedQueueUrl = getQueueUrl();

Assert.assertEquals(actualQueueUrl, expectedQueueUrl);

Loggerload.info("user goto on queue module");

}

@Given("user is in the Queue Module page")

public void user_is_in_the_queue_module_page() {

System.out.println("user is in queue module");

}

@When("user scroll down to select option from Queue list")

public void user_scroll_down_to_select_option_from_Queue_list() throws InterruptedException {

Actions action = new Actions(DriverFactory.getDriver());

action.sendKeys(Keys.PAGE_DOWN).build().perform();

queue.Qimplementation();
Thread.sleep(1000);

queue.Try_Here();


System.out.println("user scroll to select the option from queue module page");

}

@When("user enters the invalid python code in {string} and {int} the editor box")

public void user_enters_the_invalid_python_code_in_the_editor_box(String sheetName,Integer rowNumber) throws InterruptedException {

ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");

Thread.sleep(2000);

List<String> content=reader.getCellData(sheetName,0,rowNumber);
Thread.sleep(1000);
queue.Editor(content);

Thread.sleep(2000);

queue.Click_Run();

Alert alert =DriverFactory.getDriver().switchTo().alert();

String alertMessage=alert.getText();

System.out.println(alertMessage);

alert.accept();

}

@Then("user should get a error message")

public void user_should_get_a_error_message() throws IOException {

String actualText1 = queue.Check_Output();

String expectedText1 = getExpText4();

Assert.assertEquals(actualText1, expectedText1);

Loggerload.error("Invalid python code");


}

@Given("user go back to the Queue Module page")

public void user_go_back_to_the_queue_module_page() throws InterruptedException {

	DriverFactory.getDriver().navigate().back();

	Thread.sleep(2000);
	queue.Try_Here();

}

@When("user enters the valid python code in {string} and {int} editor box")

public void user_enters_the_valid_python_code_in_editor_box(String sheetName1,Integer rowNumber1) throws InterruptedException {

ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");

Thread.sleep(2000);

List<String> content=reader.getCellData(sheetName1,0,rowNumber1);

queue.Editor(content);

Thread.sleep(2000);

queue.Click_Run();

}

@Then("user should get success message")

public void user_should_get_success_message() throws IOException {

String actualText1 = queue.Check_Output();

String expectedText1 = getExpText5();

Assert.assertEquals(actualText1, expectedText1);

Loggerload.error("valid python code");


}

}