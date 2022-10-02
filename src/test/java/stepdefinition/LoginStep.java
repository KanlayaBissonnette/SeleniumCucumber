package stepdefinition;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStep extends CommonMethods {
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    Driver.getDriver();
	}

	@When("User click Login tab")
	public void user_click_login_tab() {
		hp.loginTab.click();
	}

	@When("User put {string} in the email box")
	public void user_put_in_the_email_box(String validEmail) {
		wait(1);
		sendText(login.emailBox,validEmail );
	}

	@When("User put {string} in the password box")
	public void user_put_in_the_password_box(String validPassword) {
	    sendText(login.passwordBox, validPassword);
	}
	
	@When("User click Login button")
	public void user_click_login_button() {
		login.loginBtn.click(); 
	}

	@Then("User should see Logout button on the page")
	public void user_should_see_logout_button_on_the_page() {
		wait(1);
		verifyHeader(login.welcomeMsg, ConfigReader.getInput("welcomeTxt"));
	    verifyHeader(hp.logoutBtn, ConfigReader.getInput("logoutTxt"));
	}

	@When("User put empty {string} in the email box")
	public void user_put_empty_in_the_email_box(String Email) {
		wait(1);
	    sendText(login.emailBox, Email);
	}

	@When("User put empty {string} in the password box")
	public void user_put_empty_in_the_password_box(String Password) {
	    sendText(login.passwordBox, Password);
	    wait(1);
	}

	@Then("User should see error message if put empty email and empty password")
	public void user_should_see_error_message_if_put_empty_email_and_empty_password() {
		wait(5);
	    verifyHeader(login.errMsg, ConfigReader.getInput("errTxt"));
	}

	@When("User put error {string} in the email box")
	public void user_put_error_in_the_email_box(String Email) {
		wait(1);
		sendText(login.emailBox, Email);
	}

	@When("User put error {string} in the password box")
	public void user_put_error_in_the_password_box(String Password) {
		sendText(login.passwordBox, Password);
	}

	@Then("User should see error message if put error email and password")
	public void user_should_see_error_message_if_put_error_email_and_password() {
		wait(4);
		verifyHeader(login.errMsg, ConfigReader.getInput("errTxtInvalid"));
	}

}
