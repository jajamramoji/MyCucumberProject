package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/yatra.feature", glue="stepDefinitions",tags="@Chrome")

	/*features = "src/test/java/features/Account.feature",
	glue="stepDefinitions",tags="@seleniumtest",monochrome=true,
	plugin={"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
*/
public class TestRunner 
{
	
}