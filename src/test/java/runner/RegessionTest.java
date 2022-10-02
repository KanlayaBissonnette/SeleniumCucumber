package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"html:target/report.html"
				},
		features="src/test/resources/feature",
		glue = "stepdefinition",
		monochrome = true,
		dryRun = false
		)


public class RegessionTest {

	
}
