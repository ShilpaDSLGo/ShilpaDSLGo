package Steps_DsAlgo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Driver.DriverFactory;
import io.cucumber.java.en.*;

import POM_DsAlgo.POdataStructure;

import Utilities.Loggerload;

public class dataStructureSD {
	POdataStructure DSpage= new POdataStructure(DriverFactory.getDriver());
	
	//Scenario one
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() throws InterruptedException {
	Thread.sleep(1000);
		Loggerload.info("User is in Loginpage");
	    
	}

	@When("User Clicks on the DataStructure")
	public void user_clicks_on_the_data_structure() {
		DSpage.getDataStru();	
//		ExcelReader1 excelReader = 
//				new ExcelReader1("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel\\LoginDetails.xlsx", "Sheet1");
//
//    String Username= excelReader.getCellValueU1(2,0);
//	String Password= excelReader.getCellValueP1(2,1);
//	  DSpage.clickUsername(Username);
//	  DSpage.clickPassword(Password);
//	  DSpage.clickLogin();
	 	
	}

	@And("User clicks on Time Complexity and try here")
	public void user_clicks_on_time_complexity_and_try_here() throws InterruptedException {
		Actions a = new Actions(DriverFactory.getDriver());
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		 DSpage.timeComplexity();
		 a.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(1000);
		 DSpage.tryHere();
		
	}

	@Then("User gives the correct code")
	public void user_gives_the_correct_code() throws InterruptedException {
		//DSpage.clicktypeHere();
		Thread.sleep(1000);
		DSpage.typeCorrectCode();
		Thread.sleep(1000);
		DSpage.clickRun();
		//DSpage.clearCode();
		Loggerload.info("User tested the corRect code");
				
	}	
	
	//Scenario two
	
	@Given("The user is on Home page link")
	public void the_user_is_on_Home_page() throws InterruptedException {
		
		 DriverFactory.getDriver().navigate().back();
		System.out.println("Scenario two");
		
	}

	@When("User Clicks on the DataStructure link")
	public void user_clicks_on_the_data_structure_link() throws InterruptedException {
		Thread.sleep(1000);
		DSpage.tryHere();
		Loggerload.info("User is trying the incorrect code ");
		System.out.println("User is trying the incorrect code");
	}

	@And("User clicks on Time Complexity link and try here")
	public void user_clicks_on_time_complexity_link_and_try_here() throws InterruptedException {
		 DSpage.typeIncorrectCode();
		 Thread.sleep(1000);
		 DSpage.clickRun();
	    
	}

	@Then("User gives the incorrect code")
	public void user_gives_the_incorrect_code() throws InterruptedException {
		DSpage.acceptalert();
		Thread.sleep(1000);
	   System.out.println("User sucessfully tested the incorrect code");
	  
	}
	
}
