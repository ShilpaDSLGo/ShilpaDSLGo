package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import driverfactory.driverfactory;
;
public class POdataStructure {
	 WebDriver driver;
	 Actions actions = new Actions(driverfactory.getDriver());
	 By homepage=By.xpath("//title[text()='NumpyNinja']");
	 By username=By.xpath("//input[@name='username']");
	 By password=By.xpath("//input[@name='password']");
	 By login=By.xpath("//input[@type='submit']");
     By getDataStru=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//a");
     By timeComplexity=By.xpath("//a[text()='Time Complexity']");
     By tryHere=By.xpath("//a[text()='Try here>>>']");
     By typeHere=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
     By clickRun=By.xpath("//button[text()='Run']");
     By clickBack=By.xpath("//a[text()='NumpyNinja']");
     
     
     
     // this I have to understand-- constructor for webdriver
     public POdataStructure(WebDriver driver) {
		  
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
   
     public void homepage() {
    	 
    	 driver.findElement(homepage);
     }
     
     public void getDataStru() {
    	 
    	 driver.findElement(getDataStru).click();
    	 
     }
     public void clearCode() {
		  actions.keyDown(driver.findElement(typeHere), Keys.CONTROL).sendKeys("a").keyUp(driver.findElement(typeHere), Keys.CONTROL).perform();
			actions.sendKeys(Keys.DELETE).perform();
	  }
   
     public void clickBack() {
    	 
    	 driver.navigate().back();
     }
     
    public void clickUsername(String Username ) {
    	 
    	 driver.findElement(username).sendKeys(Username);
     }
     
    public void clickPassword(String Password) {
 	 
 	 driver.findElement(password).sendKeys(Password);;
  }	 
    
    public void clicktypeHere() {
  	 
  	 driver.findElement(typeHere).click();
   }
   
    public void clickLogin() {
     	 
  	 driver.findElement(login).click();
   }
    public void acceptAlert(){

		driver.switchTo().alert().accept();

	}
   
   public void timeComplexity() {
        	 driver.findElement(timeComplexity).click();
     }
     
     	 public void tryHere() {
        	 driver.findElement(tryHere).click();
     }
     	 
     	 public void typeCorrectCode() {
        	 driver.findElement(typeHere).sendKeys("print 'Welcome to DataStructure' ");
     }
    	 public void clear() {
        	 driver.findElement(typeHere).clear();
     }
     	  	 
    	 public void clickRun() {
        	 driver.findElement(clickRun).click();
     }
       	
    	 public void typeIncorrectCode() {
        	 driver.findElement(typeHere).sendKeys("Welcome to DataStructure");
     }
    	 public void acceptalert() {
    		 driver.switchTo().alert().accept();
    		 
    	 }
}
