package runners;
import org.junit.runner.RunWith;

//Old Dependencies
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//For New Dependencies
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/pardeeptank/Desktop/QA/selenium_workplace/CucumberProjectBatch80/src/test/java/features"},//the path of the feature files
		glue={"stepdefinations"}//step Defination Package Name
		)
public class SuiteRunner {

}
