package runner;

import org.testng.annotations.DataProvider;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"html:target/report.html"
				},
		features="src/test/resources/feature",
		glue = "stepdefinition",
		monochrome = true,
		dryRun = false,
		tags = "@Smoke"
		)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object [][] scenarios(){
		return super.scenarios();
	}

}

