package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonMethods;
import Utilities.PageInitialized;

public class BikePageObj extends CommonMethods {

	public BikePageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='content']/div/div[6]/div/form/div/button")
	private WebElement addCartBtn;

	@FindBy(xpath = "//*/div[@class='widget_content']//button")
	private WebElement checkoutBtn;

	public void clcikAddCartBtn() {
		addCartBtn.click();
	}

	public void clickCheckOutBtn() {
		checkoutBtn.click();
	}

}
