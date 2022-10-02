package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class PaypalPageObj extends CommonMethods {

	public PaypalPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//h1[@id='headerText']")
	public WebElement paypalTxt;

}
