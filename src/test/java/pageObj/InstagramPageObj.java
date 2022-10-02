package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class InstagramPageObj extends CommonMethods {

	public InstagramPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='react-root']/section/nav/div[2]/div/div/div[1]/a/div/div/img")
	public WebElement instaG;

	@FindBy(xpath = "/html/body/div[1]/section/main/div/div/div[1]/div[1]/div/img")
	public WebElement instaImage;

}
