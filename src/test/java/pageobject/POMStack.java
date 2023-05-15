package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

	
	
	public class POMStack {

	WebDriver driver;
	By operations = By.xpath("//a[text()='Operations in Stack']");
	By tryhere = By.xpath("//div//a[@class='btn btn-info']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text()='Run']");


	public POMStack(WebDriver driver) {

	this.driver = driver ;
	PageFactory.initElements(driver, this);

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


	    public void accpetAlert () {

	driver.switchTo().alert().accept();
	}

	public void typeCorrectCode() {

	driver.findElement(textbox).sendKeys("print 'Hello'");
	}


	    public void typeIncorrectCode() {

	   
	driver.findElement(textbox).sendKeys("System.out.println(\"Hello\");");
	}
	   
	   
	   

	}


