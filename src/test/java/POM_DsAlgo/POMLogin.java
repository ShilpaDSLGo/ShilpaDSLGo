package POM_DsAlgo;


import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import RandomString.UsernameRandom;



public class POMLogin {

	By Start = By.xpath("//button[@class='btn']");
	By Register = By.xpath("//a[text()=' Register ']");
	By Username = By.xpath("//input[@name='username']");
	By LoginUsername = By.xpath("//input[@name='username']");
	By Password1 = By.xpath("//input[@name='password1']");
	By Password2 = By.xpath("//input[@name='password2']");
	By RegButton = By.xpath("//input[@value='Register']");
	By Sign0ut = By.linkText("Sign out");
	By SignIn = By.linkText("Sign in");
	By Password = By.xpath("//input[@name='password']");
	By LoginButton = By.xpath("//input[@value='Login']");
	By Message =  By.xpath("//div[@class='alert alert-primary']");
	By Error = By.xpath("//div[@class='alert alert-primary']");
	By getStarted=By.xpath("//button[@class='btn']");
	  By register1=By.xpath("//a[text()=' Register ']");
	  By userName=By.xpath("//input[@name='username']");
	  By password1=By.xpath("//input[@name='password1']");
	  By password2=By.xpath("//input[@name='password2']");
	  By register2= By.xpath("//input[@value='Register']");
	  By login=By.xpath("//a[text()='Login ']");
	  By homepage=By.xpath("//title[text()='NumpyNinja']");
         WebDriver driver;
         public POMLogin(WebDriver driver)
     	{
     		this.driver = driver;
     		PageFactory.initElements(driver, this);
     	}

         public void getStarted () throws Exception {
  		   Thread.sleep(1000);

  			driver.findElement(getStarted).click();	

  		}	
  	   
  	 public void setUserName (String UserName) {

  			driver.findElement(userName).sendKeys(UserName);	

  		}	
  	 
  		
  	 //in data driven it becomes for  password1 &2(String Password) & username
  		
  	 public void setPassword1 (String Password) {

  			driver.findElement(password1).sendKeys(Password);	

  		}
  		
  		public void setPassword2 (String Password) {

  			driver.findElement(password2).sendKeys(Password);	

  		}

  		 public void clickRegister (){

  			driver.findElement(register1).click();

  		}
  		  
  		 public void clickRegister2 (){

  				driver.findElement(register2).click();

  			}
  		 
   
  		 public void clickLogin (){

  				driver.findElement(login).click();

  			}
  		 
  		 
  		 public void acceptAlert(){

  				driver.switchTo().alert().accept();

  			}
   
  	          
	 public void loginPage()
 {
	 driver.findElement(Start).click();
	 
 }
 public void Register_Click()
 {
	 driver.findElement(Register).click();
 }

 public void RegisterUser() throws IOException
 {
	
	 
	 driver.findElement(Username).sendKeys(UsernameRandom.random);
	 
	 
 }
 public void RegisterAcc(List<String> password,List<String> password1) throws IOException
 {
	 
		//for(String username1:username) {
	 //driver.findElement(Username).sendKeys(username1);}
		for(String password2 : password ) {
	 driver.findElement(Password1).sendKeys(password2);}
		for (String password3 : password1) {
	 driver.findElement(Password2).sendKeys(password3);}
	 	 
 }
 public void PassChange(List<String> password)
 {
	 for(String password2 : password ) {
		 driver.findElement(Password1).sendKeys(password2);
			
		 driver.findElement(Password2).sendKeys(password2);
		 }
		  }
 public String ErrorMsg()
 {
	 return driver.findElement(Error).getText();
 }
 public void click_Button()
 {
	 driver.findElement(RegButton).click();
 }
 public void signOut()
 {
	 driver.findElement(Sign0ut).click();
	 
 }
 public void click_Signin()
 {
	 driver.findElement(SignIn).click();
 }
 public void AccountPass(List<String> password)
 {
	 for (String password1 : password)
		 driver.findElement(Password).sendKeys(password1);
 }
/* public void Account()
 {
	 
	 driver.findElement(LoginUsername).sendKeys(username);
	// for(String username1: username) {
	 //driver.findElement(Username).sendKeys(username1);}
	 
 }*/
 public void UserInvalid(List<String> usernameInvalid,List<String> passwordInvalid)
 {
	 for(String InvUser: usernameInvalid) {
	 driver.findElement(Username).sendKeys(InvUser);}
	 for (String InvPass : passwordInvalid) {
	 driver.findElement(Password).sendKeys(InvPass);}
 }
 public void Login_Button()
 {
	 driver.findElement(LoginButton).click();
 }
 public String Check_Message()
 {
	 return driver.findElement(Message).getText();
 }
}

