package stepdefinition;

import org.openqa.selenium.Keys;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep extends CommonMethods {
	
	
	@When("User clicks on search bar")
	public void user_clicks_on_search_bar() {
	   hp.searchBox.click();
	}

	@When("User enters item keyword {string}")
	public void user_enters_item_keyword(String str) {
	    sendText(hp.searchBox, str);
	}

	@When("User clicks enter")
	public void user_clicks_enter() {
	   hp.searchBox.sendKeys(Keys.RETURN);
	}

	@Then("User can view balance ball on the next page.")
	public void user_can_view_balance_ball_on_the_next_page() {
	   verifyHeader(bB.containsBalanceBall, ConfigReader.getInput("balanceBallTxt"));
		
	}

}
