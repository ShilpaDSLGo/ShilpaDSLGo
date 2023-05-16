package POM_DsAlgo;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

public class POMQueue {


 WebDriver driver;

By Dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");

By Queue = By.xpath("//a[text()='Queue']");

By Implementation = By.xpath("//a[text()='Implementation of Queue in Python']");

By Try = By.xpath("//a[text()='Try here>>>']");
By Box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
By Run = By.xpath("//button[@type='button'][text()='Run']");
By Output = By.xpath("//pre[@id='output']");
By Box2 = By.xpath("//div[@class='code-area']");


public POMQueue(WebDriver driver) {

this.driver=driver;

PageFactory.initElements(driver, this);

}

public void dropdownModule() {

driver.findElement(Dropdown).click();



}

public void selectModule() {

driver.findElement(Queue).click();

}

public void Qimplementation() {

driver.findElement(Implementation).click();

}

public void Try_Here()
{
	driver.findElement(Try).click();
}
public void Editor(List<String> content)
{
	Actions act = new Actions(DriverFactory.getDriver());
	
	for(String contents : content) {
		
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
}