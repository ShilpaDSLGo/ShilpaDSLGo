package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import driverfactory.driverfactory;

	
	
	public class POMStack {

	WebDriver driver;
	Actions actions = new Actions(driverfactory.getDriver());
	By operations = By.xpath("//a[text()='Operations in Stack']");
	By tryhere = By.xpath("//a[text()='Try here>>>']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text()='Run']");
	By stack=By.xpath("//a[text()='Stack']");

	public POMStack(WebDriver driver) {

	this.driver = driver ;
	PageFactory.initElements(driver, this);

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

	driver.findElement(textbox).sendKeys("print 'Hello this is Stacks '");
	}


	    public void typeIncorrectCode() {

	   
	driver.findElement(textbox).sendKeys("System.out.println(\"Hello Stacks\");");
	}
	   
	    public void clickback () {

	    	driver.navigate().back();
	    	}

	   

	}


