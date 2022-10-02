package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class LoginPageObj extends CommonMethods {

	public LoginPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "login-username")
	public WebElement emailBox;

	@FindBy(id = "login-password")
	public WebElement passwordBox;

	@FindBy(id = "login-button")
	public WebElement loginBtn;

	@FindBy(xpath = "//span[@class='error']")
	public WebElement errMsg;

	@FindBy(xpath = "//span[@class='welcome-message']")
	public WebElement welcomeMsg;

}
