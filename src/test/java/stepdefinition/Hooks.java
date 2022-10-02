package stepdefinition;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Driver {

	@Before
	public void setUp() {
		getDriver();
	}

	/*
	 * !!! KEEP IT COMMENT UNTIL FINISH ALL TESTCASE !!!!
	 * */

	@After
	public void destroy(Scenario scenario) {

		if (scenario.isFailed()) {
			CommonMethods.takeScreenshot("FAILED");
		}
		tearDown();
	}

}
