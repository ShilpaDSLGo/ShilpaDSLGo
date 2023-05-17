package stepDefination;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobject.POloginclass;
import driverfactory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.exceldemo;

 
 public class loginSD {
	
	private POloginclass loginpage= new POloginclass(driverfactory.getDriver());
	
	
	@Given("The dsportal browser is open")
	public void the_dsportal_browser_is_open() {
		driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		LoggerLoad.info("Website Launched");
		System.out.println("The website was launched");
     }

	@When("User clicks on the Get Started butoon")
	public void user_clicks_on_the_get_Started_button() throws Exception {
		loginpage.getStarted();
		LoggerLoad.info("Clicked on Get started button");
	
	}
	
	@Then("User is navigated to the Registering page")
	public void user_is_navigated_to_the_Registering_page() {
		loginpage.clickRegister() ;
		System.out.println("Clicked on Registered button");
		LoggerLoad.info("Clicked on register button ");
		}
	
	//Scenario one 
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
		String expectedUrl="https://dsportalapp.herokuapp.com/register";
		String actualUrl=driverfactory.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);		
	   System.out.println("The used is on registration file ");
	}
	
	
	
	
	@When("User clicks on Login button with entering invalid Username {string} and Password {int}")
	public void user_clicks_on_login_button_with_entering_invalid_username_sheet_name_and_password_rownumber(String Sheetname ,Integer Rownumber) throws InterruptedException {
	
	Thread.sleep(1000);	
	ExcelReader excelReader = new ExcelReader("C:/Users/shilp/eclipse-workspace/DslgoSnam/excel/LoginDetails.xlsx","Sheet1");
			
	String  Username = ExcelReader.getCellValueU1(1,0);
	String  Password= ExcelReader.getCellValueP1(1,1);
	    loginpage.setUserName(Username);
		loginpage.setPassword1(Password);
		loginpage.setPassword2(Password);
		loginpage.clickRegister();
		
}
	
	@Then("User should land on register page")
	public void user_should_land_on_register_page() {
		String expectedUrl="https://dsportalapp.herokuapp.com/register";
		String actualUrl=driverfactory.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		LoggerLoad.info("Invalid username and password");
	}
	
	
	// Scenario two
	@Given("User is on the register page second time")
	public void user_is_on_register_page1() {
	   System.out.println("User is on the Register page");
	}
	
	@When("clicks on Login button with entering valid Username {string} and Password {int}")
	public void clicks_on_login_button_with_entering_valid_username_(String Sheetname ,Integer Rownumber) {
		ExcelReader excelReader = 
				new ExcelReader("C:/Users/shilp/eclipse-workspace/DslgoSnam/excel/LoginDetails.xlsx", "Sheet1");

    String Username= excelReader.getCellValueU1(2,0);
	String Password= excelReader.getCellValueP1(2,1);
	String Password2=excelReader.getCellValueP1(2,1);
	        loginpage.setUserName(Username);
			loginpage.setPassword1(Password);
			loginpage.setPassword2(Password);
			loginpage.clickRegister();
			loginpage.clickLogin();
	}
	
	@Then("User should land on home page")
	public void user_should_land_on_home_page() {
		String expectedUrl="https://dsportalapp.herokuapp.com/home";
		String actualUrl=driverfactory.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		loginpage.clickLogin();
		LoggerLoad.info("User Registered Successfully");
	
	}
	
	
}
