package pageObj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class RegistrationPageObj extends CommonMethods {

	public RegistrationPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(name = "submituser")
	public WebElement registerBtn;

	@FindBy(xpath = "//label[@class='error']")
	public List<WebElement> errorTxtLists;

	@FindBy(id = "email")
	public WebElement emailBox;

	@FindBy(id = "password")
	public WebElement passwordBox;

	@FindBy(xpath = "//label[contains (text(), 'Invalid email address')]")
	public WebElement invalidEmailMsg;

	@FindBy(xpath = "//div[contains(text(), 'Strong')]")
	public WebElement strongPassword;

	@FindBy(id = "password_strength")
	public WebElement pwdMsg;

	@FindBy(xpath = "//label[@for='password'][contains(text(), 'Required')]")
	public WebElement reqPwd;

	@FindBy(id = "password_confirmation")
	public WebElement cfPwd;

	@FindBy(id = "first_name")
	public WebElement firstName;

	@FindBy(id = "last_name")
	public WebElement lastName;

	@FindBy(id = "billing_address1")
	public WebElement address;

	@FindBy(id = "billing_city")
	public WebElement city;

	@FindBy(id = "billing_country_code")
	public WebElement countryDropDown;

	@FindBy(id = "billing_province_state")
	public WebElement stateDropDown;

	@FindBy(id = "billing_postal_zip_code")
	public WebElement zipcode;

	@FindBy(id = "billing_phone")
	public WebElement phone;

	@FindBy(id = "billing_fax")
	public WebElement fax;

	@FindBy(xpath = "//label[@class='error'][@style='display: none;']")
	public WebElement noErrMsg;

	@FindBy(xpath = "//*[@id='NewCustomer']/div[6]/button")
	public WebElement regBtn;

	public void verifyErrorTextLists() {
		ArrayList<String> errTxts = new ArrayList<String>(Arrays.asList("A valid email address is required", "Required",
				"You must confirm your password", "Your first name is required", "Your last name is required",
				"Required", "Required", "Please select", "Required", "Required"));

		for (int i = 0; i < errTxts.size(); i++) {
			CommonMethods.verifyHeader(errorTxtLists.get(i), errTxts.get(i));
		}

	}

}
