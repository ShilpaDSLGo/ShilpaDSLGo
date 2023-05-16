package Steps_DsAlgo;






import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import static Utilities.ConfigReader.getGraphUrl;
import static Utilities.ConfigReader.getExpectedText2;
import static Utilities.ConfigReader.getExpectedText3;

import Utilities.ExcelReader;
import Utilities.Loggerload;



import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import Driver.DriverFactory;
import POM_DsAlgo.POMGraph;

public class GraphSteps {

WebDriver driver;

POMGraph graph = new POMGraph(DriverFactory.getDriver());

@Given("user is on home page")

public void user_is_on_home_page() {
	DriverFactory.getDriver().navigate().back();
System.out.println("User is on home page");

}

@When("user selecting the Graph Module from the dropdown list")

public void user_select_the_graph_module_from_the_dropdown_list() {

System.out.println("user select graph module");

graph.gdropdownModule();

graph.graphModule();

}

@Then("user will goto the Graph Module page")

public void user_goto_the_graph_module_page() throws IOException {

String actualGraphUrl = DriverFactory.getDriver().getCurrentUrl();

String expectedGraphUrl = getGraphUrl();

Assert.assertEquals(actualGraphUrl,expectedGraphUrl);

Loggerload.info("user goto on graph module");

}

@Given("user is on the Graph Module page")

public void user_is_in_the_graph_module_page() {

System.out.println("user is in graph module");

}

@When("user can scroll down to select option from Graph list")

public void user_can_scroll_down_to_select_option_from_graph_list() throws InterruptedException {

Thread.sleep(1000);

graph.graphMod();
graph.Try_Here();

System.out.println("user scroll to select the option from graph module page");

}

@And("user enters the invalid python code with {string} and {int} in grapheditor box")

public void user_enters_the_invalid_python_code_in_grapheditor_box(String sheetName,Integer rowNumber) throws InterruptedException {

ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");

Thread.sleep(1000);

List<String> content=reader.getCellData(sheetName,0,rowNumber);

graph.Editor(content);
Thread.sleep(1000);
graph.Click_Run();

Alert alert =DriverFactory.getDriver().switchTo().alert();

String alertMessage=alert.getText();

System.out.println(alertMessage);

alert.accept();

}

@Then("user should have error message")

public void user_should_have_error_message() throws IOException {

String actualText2 = graph.Check_Output();

String expectedText2 = getExpectedText2();

Assert.assertEquals(actualText2, expectedText2);

Loggerload.error("Invalid python code");


}

@Given("user go back to the Graph Module page")

public void user_go_back_to_the_graph_module_page() throws InterruptedException {

DriverFactory.getDriver().navigate().back();

Thread.sleep(2000);
graph.Try_Here();



}

@When("user scroll down to select option from Graph list")

public void user_scroll_down_to_select_option_from_graph_list() {

System.out.println("user scroll to select the option from graph module page");

}

@And("user enters the valid python code in {string} and {int} grapheditor box")

public void user_enters_the_valid_python_code_in_grapheditor_box(String sheetName, Integer rowNumber) throws InterruptedException {

ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel.xlsx");

Thread.sleep(2000);

List<String> content=reader.getCellData(sheetName,0,rowNumber);


graph.Editor(content);
Thread.sleep(1000);
graph.Click_Run();

}

@Then("user should get successful message")

public void user_should_have_successful_message() throws IOException {

String actualText3 = graph.Check_Output();

String expectedText3 = getExpectedText3();

Assert.assertEquals(actualText3, expectedText3);

Loggerload.error("valid python code");


}

}