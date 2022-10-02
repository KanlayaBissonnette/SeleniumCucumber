package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUpStep extends CommonMethods {
	
	String tempEmail;
	String tempPassword;
	
	@When("User click SignUp button")
	public void user_click_sign_up_button() {
	    hp.signupBtn.click();
	}

	@When("User click Register button")
	public void user_click_register_button() {
		wait(1);
		reg.registerBtn.click();
	}

	@Then("User should see text under requirement box")
	public void user_should_see_text_under_requirement_box() {
	    reg.verifyErrorTextLists();
	}

	@Then("User put Email {string} in the email box")
	public void user_put_email_in_the_email_box(String email) {
		wait(1);
	    sendText(reg.emailBox, email);
	}

	@Then("User put Password {string} in the password box")
	public void user_put_password_in_the_password_box(String password) {
	   sendText(reg.passwordBox, password);
	}

	@Then("verify Email and Password with message {string} and {string}")
	public void verify_email_and_password_with_message(String emailMsg, String pwdMsg) {
		tempEmail = emailMsg;
		tempPassword = pwdMsg;
		wait(1);
		if(!emailMsg.equals("goodEmail")) {
			System.out.println("email error message is: " +emailMsg);
			verifyHeader(reg.invalidEmailMsg, ConfigReader.getInput(emailMsg));
		}
		if(pwdMsg.equals("requiredPwd")) {
			verifyHeader(reg.reqPwd, ConfigReader.getInput(pwdMsg));
		}else {
			verifyHeader(reg.pwdMsg, ConfigReader.getInput(pwdMsg));
		}
	}

	@Then("User fill all the requirement")
	public void user_fill_all_the_requirement() {
	   sendText(reg.cfPwd, ConfigReader.getInput("regPwd"));
	   sendText(reg.firstName, ConfigReader.getInput("FN"));
	   sendText(reg.lastName, ConfigReader.getInput("LN"));
	   sendText(reg.address, ConfigReader.getInput("address"));
	   sendText(reg.city, ConfigReader.getInput("city"));
	   reg.countryDropDown.click();
	   Select country = new Select(reg.countryDropDown);
	   country.selectByValue(ConfigReader.getInput("country"));;
	   reg.stateDropDown.click();
	   Select state = new Select(reg.stateDropDown);
	   state.selectByValue(ConfigReader.getInput("state"));
	   sendText(reg.zipcode, ConfigReader.getInput("zipcode"));
	   numberInput(reg.phone,ConfigReader.getInput("phone"));
	}

	@Then("verify that no error message has been displayed")
	public void verify_that_no_error_message_has_been_displayed() {
		if(tempEmail.equals("goodEmail") && tempPassword.equals("strongPwd")) {
			for(int i = 0; i< reg.errorTxtLists.size(); i++) {
				Assert.assertFalse(reg.errorTxtLists.get(i).isDisplayed());
			}
		}else {
			Assert.assertTrue(reg.regBtn.isDisplayed());
		}
	}
}
