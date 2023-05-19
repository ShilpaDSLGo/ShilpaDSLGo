package Driver;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class DriverFactory {
		
  public WebDriver driver;
  public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
  
  public WebDriver init_driver(String browser)
  {
	  System.out.println("Brower value is:" + browser);
	  if(browser.equals("chrome"))
	  {
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\shaun\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\Chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
		  tlDriver.set(new ChromeDriver());
	  }
	  else if (browser.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  tlDriver.set(new EdgeDriver());
	  }
	  else 
	  {
		  System.out.println("Please pass the correct value:"+ browser);
	  }
	  getDriver().manage().deleteAllCookies();
	  getDriver().manage().window().maximize();
	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  return getDriver();
  }
  


	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}

}

