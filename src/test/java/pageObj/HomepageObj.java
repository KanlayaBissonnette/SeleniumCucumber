package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonMethods;

public class HomepageObj extends CommonMethods {

	public HomepageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='header']/div[4]/a[1]")
	public WebElement loginTab;

	@FindBy(xpath = "//*[@id='header']/div[4]/a[2]")
	public WebElement logoutBtn;

	@FindBy(xpath = "//*[@id='header']/div[4]/a[2]")
	public WebElement signupBtn;

	@FindBy(xpath = "//a[contains(text(), 'Strength Equipment')]")
	public WebElement strengthEquipmentTab;

	@FindBy(xpath = "//*[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[3]/ul/li/div/div[3]/div[1]/div/a/img")
	public WebElement powerRacks;

	@FindBy(xpath = "//ul[@class='nav navbar-nav ng-scope']/li[@class='btn-group dropdown yamm-fw ng-scope']")
	public List<WebElement> menuBar;

	@FindBy(xpath = "//*[@id='header']/div[2]/form/input[1]")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id='main-menu-navigation-footer-menu-collapse']/ng-include/ul/li[4]/ul/li/a")
	public WebElement storeLocatorBtn;

	@FindBy(xpath = "//*[@id='main-menu-navigation-footer-menu-collapse']/ng-include/ul/li[2]/ul/li[2]/a")
	public WebElement trackYourOrderBtn;

	@FindBy(xpath = "//*[@id='bottom_bar_content']/div[1]/ul/li[2]/a")
	public WebElement instagramBtn;
	
//	@FindBy(xpath = "//*[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[2]/a")
//    public WebElement cardioBtn;

	@FindBy(xpath = "//*[@id=\"main-menu-navigation-menu-collapse\"]/ng-include/ul/li[1]/a")
    public WebElement cardioBtn;

	public void clickWeightTab() {
		menuBar.get(5).click();

	}

	public boolean validateURL(String expURL) {

		boolean result = false;
		if (driver.getCurrentUrl().equals(expURL)) {
			result = true;
		}

		return result;
	}


}
