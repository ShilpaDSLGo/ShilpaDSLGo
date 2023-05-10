package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POloginclass {

	 private WebDriver driver ;
	  String URL="https://dsportalapp.herokuapp.com/";
	  By getStarted=By.xpath("//button[@class='btn']");
	  By register1=By.xpath("//a[text()=' Register ']");
	  By userName=By.name("username");
	  By password1=By.name("password1");
	  By password2=By.name("password2");
	  By register2=By.xpath("//div[2]//form/input[5]");
	  By login=By.xpath("//a[text()='Login ']");
	  By homepage=By.xpath("//title[text()='NumpyNinja']");
	  
	  
	  //Constructor of the page class:
	  
	  public POloginclass(WebDriver driver) {
		  
		  this.driver=driver;
		
		 // PageFactory.initElements(driver, this);
	  }
	   
	  public void getURL () {

			driver.get(URL);	

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
 
	  }




