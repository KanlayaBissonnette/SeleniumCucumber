package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.CommonMethods;
import Utilities.ConfigReader;

public class CheckoutPageObj extends CommonMethods{

	public CheckoutPageObj() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy (xpath="//div[@id='section_payment']")
	public WebElement paymentMtd;
	
	@FindBy (xpath="//input[@name='billing_fname']")
	public WebElement billingFN;
	
	@FindBy (xpath="//input[@name='billing_lname']")
	public WebElement  billingLN;
	
	@FindBy (xpath="//input[@name='billing_line_1']")
	public WebElement billingAddress;
	
	@FindBy (xpath="//select[@id='billing_country']")
	public WebElement billingCountryDropDown;
	
	@FindBy (id="billing_country_division")
	public WebElement billingStateDropDown;
	
	@FindBy (id="billing-city")
	public WebElement billingCity;
	
	@FindBy (id="billing-postal-code")
	public WebElement billingZip;
	
	@FindBy (id="billing-phone")
	public WebElement billingPhone;
	
	@FindBy (id="billing-email")
	public WebElement billingEmail;
	
	@FindBy (id="PaypalHpp")
	public WebElement paypalRadio;
	
	@FindBy (xpath="//input[@name='agree']")
	public WebElement agreeBox;
	
	@FindBy (id="ship_method_freeShipping")
	public WebElement freeShippingRadioBtn;
	
	@FindBy (xpath="//button[@id='checkout-button']")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//*[@id='section_address_billing']/fieldset/table/tbody/tr/td/input")
	public List<WebElement> billingInformation;

	@FindBy(xpath = "//*[@id= 'billing_country']/option")
	public List<WebElement> Billingcountry;

	@FindBy(xpath = "//*[@id='billing_country_division']/option")
	public List<WebElement> BillingState;

	@FindBy(xpath = "//*[@name='ship_method']")
	public List<WebElement> shippingMethod;

	@FindBy(xpath = "//*[@class='order_review_table normal_font_sz']/tbody/tr")
	public List<WebElement> ReviewOrder;
	
	public void fillBillingForm() {
		sendText(billingFN, ConfigReader.getInput("FN"));
		sendText(billingLN, ConfigReader.getInput("LN"));
		sendText(billingAddress, ConfigReader.getInput("address"));
		scrollByPixel(100);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(billingCountryDropDown));
		Select country = new Select(billingCountryDropDown);
		wait(2);
		country.selectByValue("USA");
		Select state = new Select(billingStateDropDown);
		wait(2);
		state.selectByValue(ConfigReader.getInput("state"));
		sendText(billingCity, ConfigReader.getInput("city"));
		sendText(billingZip, ConfigReader.getInput("zipcode"));
		numberInput(billingPhone, ConfigReader.getInput("phone"));
		sendText(billingEmail, ConfigReader.getInput("email"));
	}
	
	
}
