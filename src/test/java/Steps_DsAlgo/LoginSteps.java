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
		// List<String> username =reader.getCellData(sheetName,0,rowNumber);
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

	@Given("user is in the dsalgo register page")
	public void user_is_in_the_dsalgo_register_page() {
		loginpage.Register_Click();
		

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