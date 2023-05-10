package ApplicationHooks;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import driverfactory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ApplicationHooks {
	
	private driverfactory DriverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before("@First")
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before("@First")
	public void launchBrowser() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		DriverFactory = new driverfactory();
		driver = DriverFactory.init_driver(browserName);
		
	}
//
//	@After   (order = 0)
//	public void quitBrowser() {
//		driver.quit();
//	}
//
//	@After
//	public  void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ","_");
//			final byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//}
//		}
	}


