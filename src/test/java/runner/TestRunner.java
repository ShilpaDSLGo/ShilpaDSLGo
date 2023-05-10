
package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utilities.ConfigReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution
@CucumberOptions(
plugin = {"pretty","html:target/dsalgo123.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
monochrome = true, //console output
dryRun = false,
//tags = ("@tags,@tag1"), //tags from feature file
features = {"src/test/resources/FeaturesDsAlgo"}, //location of feature files
glue = {"Steps_DsAlgo","ApplicationHooks"}) //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests{
@Override
@DataProvider(parallel=false)
public Object[][] scenarios()
{
return super.scenarios();

}
/*@BeforeTest
@Parameters({"browser"})
public void defineBrowser(String browser)
{
	ConfigReader.setBrowserType(browser);
}*/


}