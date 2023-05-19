package POM_DsAlgo;

import java.util.List;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

public class POarrays {

	 WebDriver driver;
	 By arrays=By.xpath("//a[text()='Arrays']");
	 //By arrayPython=By.xpath("//a[text()='Arrays in Python']");
	 By arrayPython=By.xpath("//body/div[2]/ul[1]/a");
	 By arrayList=By.xpath("//a[text()='Arrays Using List']");
	 By tryHere=By.xpath("//a[text()=\"Try here>>>\"]");
	 By typeHere=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	 By clickRun=By.xpath("//button[@type='button'][text()='Run']");
	 By dropDown=By.xpath("//a[@class='nav-link dropdown-toggle']");

		By Options = By.xpath("//a[@class='nav-link dropdown-toggle']");
		By Arrays = By.xpath("//a[text()='Arrays']");
	    By PythonArrays = By.xpath("//a[text()='Arrays in Python']");
	    By PractQues = By.xpath("//a[text()='Practice Questions']");
	    By Number = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	    By sorted = By.xpath("//a[text()='Squares of  a Sorted Array']");
	    By Search = By.xpath("//a[text()='Search the array']");
	    By Max = By.xpath("//a[text()='Max Consecutive Ones']");
		
		By Try = By.xpath("//a[text()='Try here>>>']");
		By Box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		By Run = By.xpath("//button[@type='button'][text()='Run']");
		By Output = By.xpath("//pre[@id='output']");
		By Box2 = By.xpath("//div[@class='code-area']");
				
		 public POarrays(WebDriver driver) {
			  
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
		  }
		 
		 public void Options()
		   {
			   driver.findElement(Options).click();
		   }
			
			public void Click_Arrays() throws InterruptedException
			{
				driver.findElement(Options).click();
				Thread.sleep(1000);
				driver.findElement(Arrays).click();
			}
			public void Arrays_Python()
			{
				driver.findElement(PythonArrays).click();
			}
			public void Click_Practice()
			{
				driver.findElement(PractQues).click();
			}
			public void Click_Search()
			{
				driver.findElement(Search).click();
			}
			public void Click_Max()
			{
				driver.findElement(Max).click();
			}
			public void Click_Numbers()
			{
				driver.findElement(Number).click();
			}
			public void SortQues()
			{
				driver.findElement(sorted).click();
			}
			public void Try_Here()
			{
				driver.findElement(Try).click();
			}
			public void Editor(List<String> content)
			{
				Actions act = new Actions(DriverFactory.getDriver());
				
				for(String contents : content) {
					act.click(driver.findElement(Box)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
				act.moveToElement(driver.findElement(Box)).sendKeys(contents).build().perform();
				}
			}
			public void Click_Run()
			{
				driver.findElement(Box2).click();
				WebElement Run1 = driver.findElement(Run);
				Actions act = new Actions(DriverFactory.getDriver());
						act.moveToElement(Run1).click().perform();
			}
			public String Check_Output()
			{
				return driver.findElement(Output).getText();
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
	    	 
	    	 driver.findElement(typeHere).sendKeys("print'Welcome to Arrays in Python'");
	     }
       
       public void typeArray2() {
	    	 
	    	 driver.findElement(typeHere).sendKeys("print'Welcome to Arrays in Python'");
	     }
       
       public void typeArray3() {
	    	 
	    	 driver.findElement(typeHere).sendKeys(" This is array's page");
	     }
       
       public void acceptAlert() {
           Alert alert = driver.switchTo().alert();
           alert.accept();
           
       }
       
       public void clickRun() {
	    	 
	    	 driver.findElement(clickRun).click();
	     }
       
       
    
      public void clickBack() {
     	 
     	 driver.navigate().back();
      }
       
      
}       
       
       
       
       
       
	     
	     
	     
	     
	 

