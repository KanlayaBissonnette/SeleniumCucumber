package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class ContactUsPageObj extends CommonMethods {

	public ContactUsPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//span[@style='font-family:arial,helvetica,sans-serif;']")
	public WebElement TorontoLocation;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[1]/h3")
	public WebElement BarrieLocation;

	@FindBy(xpath = "//*[@id='content']/div/div[2]/div[3]/div[1]/h3")
	public WebElement LondonLocation;

	@FindBy(xpath = "//*[@id='content']/div/div[2]/div[4]/div[1]/h3")
	public WebElement MontrealLocation;

}
