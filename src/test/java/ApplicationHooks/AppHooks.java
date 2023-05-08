package ApplicationHooks;


import java.io.ByteArrayInputStream;
import java.io.IOException;


import java.util.List;
import java.util.Map;
import java.util.Properties;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import Driver.DriverFactory;
import Utilities.ConfigReader;
import Utilities.Loggerload;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;


public class AppHooks {
	
	public static DriverFactory driverFactory;
public static WebDriver driver;

public static ConfigReader configReader;
	public static Properties prop;
	@Before ("@first")
	public static void getProperty() throws IOException
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	@Before ("@first")
	public static void launchBrowser() throws InvalidFormatException, IOException
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
				}
	
	
	/*@After 
	public static void quitBrowser()
	{
		driver.quit();
	}*/
	@After 
	public static void tearDown (Scenario scenario)
	{
		if(scenario.isFailed())
		{
			// take screenshot
			
			String screenshot = scenario.getName().replaceAll(" ", "_");
			Loggerload.error("Steps Failed , Taking Screenshot");
			final byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath,"image/png",screenshot);
			Allure.attachment("screenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			
					}
	}

}
