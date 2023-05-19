package Steps_DsAlgo;


import org.testng.Assert;

import static Utilities.ConfigReader.getURL;
import static Utilities.ConfigReader.ExpURL;
import static Utilities.ConfigReader.getMessage;

import java.io.IOException;
import java.util.List;

import Driver.DriverFactory;
import POM_DsAlgo.POMLogin;
import RandomString.UsernameRandom;
import Utilities.ConfigReader;
import Utilities.ExcelReader;
import Utilities.ExcelReader1;
import Utilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	POMLogin loginpage = new POMLogin(DriverFactory.getDriver());

	@Given("user is in the dsalgo url page")
	public void user_is_in_the_dsalgo_url_page() throws IOException {
		
		DriverFactory.getDriver().get(getURL());
		Loggerload.info("Website Opened");
		loginpage.loginPage();
		loginpage.Register_Click();
	}
	@When("user enters invalid data from {string} and {int} in excelpath")
	public void user_enters_invalid_data_from_and_in_excelpath(String sheetName, Integer rowNumber) throws InterruptedException, IOException {
		ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		Thread.sleep(1000);

		List<String> password = reader.getCellData(sheetName,1,rowNumber);
		 List<String> password1 = reader.getCellData(sheetName,2,rowNumber);
		 Thread.sleep(1000);
		 loginpage.RegisterUser();
		 loginpage.RegisterAcc(password, password1);
		 loginpage.click_Button();		
		
		
	}

	@Then("user prints the error message")
	public void user_prints_the_error_message() throws IOException {
		String expectedMessage = getMessage();
		String actualmessage = loginpage.ErrorMsg();
		System.out.println(actualmessage);
		Assert.assertEquals(expectedMessage,actualmessage);
	}

	@Given("User is on register page")
	public void user_is_on_register_page() {
		String expectedUrl="https://dsportalapp.herokuapp.com/register";
		String actualUrl=DriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);		
	   System.out.println("The used is on registration file ");
	}
	
	
	
	@When("User clicks on Login button with entering invalid Username {string} and Password {int}")
	public void user_clicks_on_login_button_with_entering_invalid_username_sheet_name_and_password_rownumber(String Sheetname ,Integer Rownumber) throws InterruptedException {
	
	Thread.sleep(1000);	
	ExcelReader1 excelReader = new ExcelReader1("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel\\LoginDetails.xlsx","Sheet1");
			
	String  Username = excelReader.getCellValueU1(1,0);
	String  Password= excelReader.getCellValueP1(1,1);
	    loginpage.setUserName(Username);
		loginpage.setPassword1(Password);
		loginpage.setPassword2(Password);
		loginpage.clickRegister();
		
}
	
	@Then("User should land on register page")
	public void user_should_land_on_register_page() {
		String expectedUrl="https://dsportalapp.herokuapp.com/register";
		String actualUrl=DriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		Loggerload.info("Invalid username and password");
	}
	
	
	// Scenario two
	@Given("User is on the register page second time")
	public void user_is_on_register_page1() {
		
	   System.out.println("User is on the Register page");
	}
	
	@When("clicks on Login button with entering valid Username {string} and Password {int}")
	public void clicks_on_login_button_with_entering_valid_username_(String Sheetname ,Integer Rownumber) {
		ExcelReader1 excelReader = 
				new ExcelReader1("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel\\LoginDetails.xlsx", "Sheet1");

    String Username= excelReader.getCellValueU1(2,0);
	String Password= excelReader.getCellValueP1(2,1);
	String Password2=excelReader.getCellValueP1(2,1);
	        loginpage.setUserName(Username);
			loginpage.setPassword1(Password);
			loginpage.setPassword2(Password);
			loginpage.clickRegister();
			//loginpage.clickLogin();
	}
	
	@Then("User should land on home page")
	public void user_should_land_on_home_page() {
//		String expectedUrl="https://dsportalapp.herokuapp.com/home";
//		String actualUrl=DriverFactory.getDriver().getCurrentUrl();
//		Assert.assertEquals(expectedUrl,actualUrl);
	
		Loggerload.info("User Registered Successfully");
	
	}
	
	


	@Given("user is in the dsalgo register page")
	public void user_is_in_the_dsalgo_register_page() {
		//loginpage.Register_Click();
		loginpage.Register_Click();

     System.out.println("Success in Registering");

	}

	

	@When("user enters valid data from {string} and {int} excelpath")
	public void user_enters_valid_username_password_and_confirm_password_from_and_password_from(String sheetName,Integer rowNumber) throws IOException, InterruptedException {
		ExcelReader reader = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		Thread.sleep(1000);
		// List<String> username =reader.getCellData(sheetName,0,rowNumber);
		 List<String> password = reader.getCellData(sheetName,1,rowNumber);
		 List<String> password1 = reader.getCellData(sheetName,2,rowNumber);
		 Thread.sleep(1000);
		 loginpage.RegisterUser();
		 loginpage.RegisterAcc(password, password1);
		 loginpage.click_Button();		
	}

	@Then("user lands on the login page")
	public void user_lands_on_the_login_page() throws InterruptedException {
		
	    
	    loginpage.signOut();
	   loginpage.click_Signin();
	}
	@Given("user is in the login page")
	public void user_is_in_the_login_page() throws IOException {
		
		System.out.println("User is in the Login Page");
		
	    
	}
	@When("user enters invalid username from {string} and password from {int}")
	public void user_enters_invalid_username_from_and_password_from(String SheetName, Integer rowNumber2) throws InterruptedException {
		
		ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		
		List<String> usernameInvalid =reader1.getCellData(SheetName,0,rowNumber2);
		 List<String> passwordInvalid = reader1.getCellData(SheetName,1,rowNumber2);
		 
		 loginpage.UserInvalid(usernameInvalid, passwordInvalid);
		 loginpage.Login_Button();
	}

	@Then("user stays on the login page")
	public void user_stays_on_the_login_page() throws IOException, InterruptedException {
		Thread.sleep(500);
	    String actualMessage = loginpage.Check_Message();
	    String expectedMessage = getMessage();
	    Assert.assertEquals(actualMessage, expectedMessage);
	    System.out.println("Sign In is unsuccessful");
	}
	

	@When("user enters valid username from {string} and password from {int}")
	public void user_enters_valid_username_from_and_password_from(String SheetName, Integer rowNumber1) throws InterruptedException, IOException {
		ExcelReader reader1 = new ExcelReader("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject\\src\\test\\resources\\excel.xlsx");
		Thread.sleep(1000);
		loginpage.RegisterUser();
		 //List<String> username =reader1.getCellData(SheetName,0,rowNumber1);
		 List<String> password = reader1.getCellData(SheetName,1,rowNumber1);
		 Thread.sleep(1000);
		 loginpage.AccountPass(password);
		 loginpage.Login_Button();
	}

	@Then("user lands on the home page")
	public  void user_lands_on_the_home_page() throws IOException, InterruptedException {
		
		String expectedURL = ExpURL();
		System.out.println(expectedURL);
		String actualURL = DriverFactory.getDriver().getCurrentUrl();
		Thread.sleep(1000);
		Assert.assertEquals(expectedURL, actualURL);
		Loggerload.info("U are in the Home Page");
	}

	
}