package POM_DsAlgo;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

	
	
	public class POMStack {

	WebDriver driver;
	Actions actions = new Actions(DriverFactory.getDriver());
	By Options = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By operations = By.xpath("//a[text()='Operations in Stack']");
	By tryhere = By.xpath("//a[text()='Try here>>>']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text()='Run']");
	By stack=By.xpath("//a[text()='Stack']");

	public POMStack(WebDriver driver) {

	this.driver = driver ;
	PageFactory.initElements(driver, this);

	}
	  public void Options()
	   {
		   driver.findElement(Options).click();
	   }
	public void clickStack() {
		
		driver.findElement(stack).click();;
	}
	
	
	public void goingbackStack () {

	driver.navigate().back();
	driver.navigate().back();

	}

	public void clickOperationsInStack() {

	driver.findElement(operations).click();
	}


	public void clickTryHere() {

	driver.findElement(tryhere).click();
	}


	public void clickRun () {

	driver.findElement(run).click();
	}

	 public void clearCode() {
		  actions.keyDown(driver.findElement(textbox), Keys.CONTROL).sendKeys("a").keyUp(driver.findElement(textbox), Keys.CONTROL).perform();
			actions.sendKeys(Keys.DELETE).perform();
	  }

	    public void accpetAlert () {

	driver.switchTo().alert().accept();
	}

	public void typeCorrectCode() {

	driver.findElement(textbox).sendKeys("print'Welcome to Stacks'");
	}


	    public void typeIncorrectCode() {

	   
	driver.findElement(textbox).sendKeys("Welcome to Stacks");
	}
	   
	    public void clickback () {

	    	driver.navigate().back();
	    	}

	   

	}


