package pageobject;


	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import driverfactory.driverfactory;

	public class POMLinkedList {

    private WebElement dropdownElement;	
	WebDriver driver;
	Actions actions = new Actions(driverfactory.getDriver());
	
	//@FindBy  = (xpath="//a[@class=\"nav-link dropdown-toggle\"]");

	By linkedlist = By.xpath("//div[3]/div/div/a");

	By intorduction = By.xpath("//a[text()='Introduction']");

	By tryhere = By.xpath("//a[text()='Try here>>>']");

	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");

	By console = By.xpath("//*[@id=\"output\"]");

	By clickRun=By.xpath("//button[text()='Run']");
	By Options = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	
	By stack=By.xpath("//a[text()='Stack']");
	
	public  POMLinkedList(WebDriver driver) {

	this.driver = driver ;
	this.actions = new Actions(driver);
//	dropdownElement = driver.findElement(By.id("dropdownElement"));

	PageFactory.initElements(driver, this);

	}
	
//
//	public void selectOptionByVisibleText(String optionText) {
//		dropdownElement.click();
//		String optionXpath = String.format("//a[@class=\"nav-link dropdown-toggle\"]", "Stack");
//	    WebElement optionElement = driver.findElement(By.xpath(optionXpath));
//	    optionElement.click();
//	}
	
	public void selectLinkedList() {

		driver.findElement(linkedlist).click();
	
	}
	
	public void selectstack() {

	driver.findElement(Options).click();

	driver.findElement(stack).click();
	
	
	}
	
	public void clickRun() {
		driver.findElement(clickRun).click();
		
	}

	public void clickIntroduction() {

	driver.findElement(intorduction).click();

	}

	public void clickTryHere () {

	driver.findElement(tryhere).click();

	}

	public void accpetAlert () {

	driver.switchTo().alert().accept();

	}

	public void typeCorrectCode() {

	driver.findElement(textbox).sendKeys("print 'This is linked list'");

	}
	 public void clearCode() {
		  actions.keyDown(driver.findElement(textbox), Keys.CONTROL).sendKeys("a").keyUp(driver.findElement(textbox), Keys.CONTROL).perform();
			actions.sendKeys(Keys.DELETE).perform();
	  }

	public void typeIncorrectCode() {

	driver.findElement(textbox).sendKeys("Linked list");

	}
	
	  public void clickBack() {
	     	 
	     	 driver.navigate().back();
	      }

	public String consoleOutputCheck() {

	return driver.findElement(console).getText();

	}

	}


