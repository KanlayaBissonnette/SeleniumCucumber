package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class BalanceBallPageObj extends CommonMethods {

	public BalanceBallPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[contains(text(),'Balance Ball')]")
	public WebElement containsBalanceBall;

}
