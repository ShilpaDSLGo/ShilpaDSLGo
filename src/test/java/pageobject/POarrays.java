package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import driverfactory.driverfactory;

public class POarrays {

	 WebDriver driver;
	 Actions actions = new Actions(driverfactory.getDriver());
	 By arrays=By.xpath("//div[2]/div/div/a");
	 //By arrayPython=By.xpath("//a[text()='Arrays in Python']");
	 By arrayPython=By.xpath("//body/div[2]/ul[1]/a");
	 By arrayList=By.xpath("//a[text()='Arrays Using List']");
	 By tryHere=By.xpath("//a[text()=\"Try here>>>\"]");
	 By typeHere=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	 By clickRun=By.xpath("//button[text()='Run']");
	 By dropDown=By.xpath("//a[@class='nav-link dropdown-toggle']");
	  
	   public POarrays(WebDriver driver) {
			  
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
		  }

	     public void arrays() {
	    	 
	    	 driver.findElement(arrays).click();
	     }
	     
       public void arrayPython() {
	    	 
	    	 driver.findElement(arrayPython).click();
	     }
	    
       public void arrayList() {
	    	 
	    	 driver.findElement(arrayPython).click();
	     }
       public void tryHere() {
	    	 
	    	 driver.findElement(tryHere).click();
	     }
       
       public void typeHere() {
	    	 
	    	 driver.findElement(typeHere);
	     }
       
       public void typeArray1() {
	    	 
	    	 driver.findElement(typeHere).sendKeys("print'array1 = array('i', [10,20,30,40,50])'");
	     }
       
       public void typeArray2() {
	    	 
	    	 driver.findElement(typeHere).sendKeys("print 'array1.insert(1,60),print x'");
	     }
       
       public void typeArray3() {
	    	 
	    	 driver.findElement(typeHere).sendKeys(" This is array's page");
	     }
       
       public void acceptAlert() {
           Alert alert = driver.switchTo().alert();
           alert.accept();
           driver.switchTo().defaultContent();
       }
       
       public void clickRun() {
	    	 
	    	 driver.findElement(clickRun).click();
	     }
       
       public void clearCode() {
 		  actions.keyDown(driver.findElement(typeHere), Keys.CONTROL).sendKeys("a").keyUp(driver.findElement(typeHere), Keys.CONTROL).perform();
 			actions.sendKeys(Keys.DELETE).perform();
 	  }
    
      public void clickBack() {
     	 
     	 driver.navigate().back();
      }
       
      
      
//      public void dropdown() {
//    	  
//    	  WebElement selectElement = driver.findElement(dropDown);
//          Select select = new Select(selectElement);
      }
//       public void arrayPython() {
//	    	 
//	    	 driver.findElement(arrayPython).click();
//	     }
       
       
       
       
       
       
       
       
	     
	     
	     
	     
	 

