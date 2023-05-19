package POM_DsAlgo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverFactory;

public class POMTree {
 
	By Options = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By Tree = By.xpath("//a[text()='Tree']");
	By Overview = By.xpath("//a[text()='Overview of Trees']");
	By Try = By.xpath("//a[text()='Try here>>>']");
	By Box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By Run = By.xpath("//button[@type='button'][text()='Run']");
	By Output = By.xpath("//pre[@id='output']");
	By Box2 = By.xpath("//div[@class='code-area']");
			
	 WebDriver driver;
		
		public POMTree(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void Choose_Tree() throws InterruptedException
		{
			driver.findElement(Options).click();
			Thread.sleep(1000);
			driver.findElement(Tree).click();
						
		}
		public void Overview_Click()
		{
			driver.findElement(Overview).click();
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
