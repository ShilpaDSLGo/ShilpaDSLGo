package stepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import driverfactory.driverfactory;
import io.cucumber.java.en.*;

import pageobject.POdataStructure;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class dataStructureSD {
	POdataStructure DSpage= new POdataStructure(driverfactory.getDriver());
	
	//Scenario one
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		driverfactory.getDriver();
		String expectedUrl="https://dsportalapp.herokuapp.com/login";
		String actualUrl=driverfactory.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		LoggerLoad.info("User is in Loginpage");
	    
	}

	@When("User Clicks on the DataStructure")
	public void user_clicks_on_the_data_structure() {
		ExcelReader excelReader = 
				new ExcelReader("C:/Users/shilp/eclipse-workspace/DslgoSnam/excel/LoginDetails.xlsx", "Sheet1");

    String Username= excelReader.getCellValueU1(2,0);
	String Password= excelReader.getCellValueP1(2,1);
	  DSpage.clickUsername(Username);
	  DSpage.clickPassword(Password);
	  DSpage.clickLogin();
	 
	
	
	}

	@And("User clicks on Time Complexity and try here")
	public void user_clicks_on_time_complexity_and_try_here() {
		 DSpage.getDataStru();	
		 DSpage.timeComplexity();
		 DSpage.tryHere();
		
	}

	@Then("User gives the correct code")
	public void user_gives_the_correct_code() {
		//DSpage.clicktypeHere();
		DSpage.typeCorrectCode();
		DSpage.clickRun();
		LoggerLoad.info("User tested the corect code");
		System.out.println("User tested the corect code");
		
	}	
	
	//Scenario two
	
	@Given("The user is on Home page link")
	public void the_user_is_on_Home_page() {
		DSpage.clearCode();
		String expectedUrl="https://dsportalapp.herokuapp.com/tryEditor";
		String actualUrl=driverfactory.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Scenario two");
		
	}

	@When("User Clicks on the DataStructure link")
	public void user_clicks_on_the_data_structure_link() {
		LoggerLoad.info("User is trying the incorrect code ");
		System.out.println("User is trying the incorrect code");
	}

	@And("User clicks on Time Complexity link and try here")
	public void user_clicks_on_time_complexity_link_and_try_here() {
		 DSpage.typeIncorrectCode();
		 DSpage.clickRun();
	    
	}

	@Then("User gives the incorrect code")
	public void user_gives_the_incorrect_code() {
		DSpage.acceptalert();
		DSpage.clickBack();
	   System.out.println("User sucessfully tested the incorrect code");
	  
	}
	
}
