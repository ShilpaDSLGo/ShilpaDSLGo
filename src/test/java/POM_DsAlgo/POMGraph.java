package POM_DsAlgo;




import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

public class POMGraph {

 WebDriver driver;

By Dropdown1 = By.xpath("//a[@class='nav-link dropdown-toggle']");

By GraphModule = By.xpath("//a[text()='Graph']");

//By Clickbtn1 = By.xpath("//html/body/div[2]/div[5]/div/div/a");

By Graph = By.xpath("/html/body/div[2]/ul[2]/a");



//By accept

By GraphRepresent = (By.xpath("/html/body/div[2]/ul[3]/a"));
By Try = By.xpath("//a[text()='Try here>>>']");
By Box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
By Run = By.xpath("//button[@type='button'][text()='Run']");
By Output = By.xpath("//pre[@id='output']");
By Box2 = By.xpath("//div[@class='code-area']");
//constructor of page class

public POMGraph(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);


}

public void gdropdownModule() {

driver.findElement(Dropdown1).click();

}

public void graphModule() {

driver.findElement(GraphModule).click();

}


public void graphMod() {

driver.findElement(Graph).click();

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
}



