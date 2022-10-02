package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class ShipmentTrackingPageObj extends CommonMethods {

	public ShipmentTrackingPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='orderNumGroup']/label")
	public WebElement orderNumberTxt;

	@FindBy(xpath = "//*[@id='shippingTracking']/div[2]/label")
	public WebElement shippingPostalCode;

	@FindBy(xpath = "//*[@id='shippingTracking']/div[4]/label")
	public WebElement shippingEmail;

}
