package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class BoxingMMAPageObj extends CommonMethods {

	public BoxingMMAPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[7]/a")
	public WebElement boxingAndMMALink;

	@FindBy(xpath = "(//div[@class='widget product_code_image']/div)[1]/a")
	public WebElement mMAStndsAndBagsLink;

	@FindBy(xpath = "//*[@id='searchApp']/div[5]/select")
	public WebElement shortByDescriptionLink;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div[2]/div[2]/div[2]/div[2]/div[2]/a/img")
	public List<WebElement> firstItemListLink;

	@FindBy(xpath = "//*[@id='content']/div/div[3]")
	public WebElement verifyFirstMMAText;

	@FindBy(xpath = "//*[@id='header']/div[1]/a")
	public WebElement backToHomepage;

	@FindBy(xpath = "//*[@id='searchApp']/div[4]/div[2]")
	public WebElement mMAAccessoriesLink;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div[2]/div[2]/div/div/div/a/img")
	public List<WebElement> allTenItemsList;

	@FindBy(xpath = "//*[@class='widget product_short_description']/h1")
	public WebElement verifyProductHeaderText;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div[2]/div[2]/div[10]/div[5]/div/form/div/button")
	public WebElement addAmStaffFitness12ozBtn;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div[2]/div[2]/div[2]/div[5]/div/form/div/button")
	public WebElement add108HandWrapsBlueBtn;

	@FindBy(xpath = "//*[@id='scroll_section']/table/tbody/tr[1]/td[3]/div")
	public WebElement verifyPriceAmStaffText;

	@FindBy(xpath = "//*[@id='scroll_section']/table/tbody/tr[2]/td[3]/div")
	public WebElement verifyPriceHandWrapsBlueText;

	@FindBy(xpath = "//*[@id='sidebar_cart_preview']/div[2]/div[3]/button")
	public WebElement checkOutBtn;

	@FindBy(xpath = "//*[@id='shipping-estimates-title']/h3")
	public WebElement shippingEstimateText;

	@FindBy(xpath = "//*[@id='shipping-estimates-postal-code'] ")
	public WebElement postalCode;

	@FindBy(xpath = "//*[@id='shipping-estimates-city']")
	public WebElement city;

	@FindBy(xpath = "//*[@id='shipping-estimates-form']/checkout-country-region-dropdowns/form-group[1]/div/div[1]/select")
	public WebElement country;

	@FindBy(xpath = "//*[@id='shipping-estimates-form']/checkout-country-region-dropdowns/form-group[2]/div/div[1]/select")
	public WebElement region;

	@FindBy(xpath = "//*[@id='shipping-estimates-submit']")
	public WebElement getEstimateBtn;

	@FindBy(xpath = "//*[@id='header']/div[4]/a[1]")
	public WebElement loginLink;

	@FindBy(xpath = "//*[@id='login-username']")
	public WebElement userName;

	@FindBy(xpath = "//*[@id='login-password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id='login-button']")
	public WebElement loginBtn;

	@FindBy(xpath = "//*[@class='fa fa-search-plus']")
	public WebElement enlargeAmStaff;

	@FindBy(xpath = "//*[@class='lb-next']")
	public List<WebElement> sliders;

	@FindBy(xpath = "//*[@class='lb-close']")
	public WebElement closeImage;

	@FindBy(xpath = "//*[@id='searchApp']/div[10]/div[2]/div[2]/div[4]/div[2]/div[2]/a/img")
	public WebElement amStaffTBX002Boxing;

	@FindBy(xpath = "//span[text()='Product Information']")
	public WebElement productInformationBtn;

	@FindBy(xpath = "//*[@id='tab_product_information']/div/h3")
	public WebElement verifyProductInformationText;

	@FindBy(xpath = "//span[text()='Ratings & Reviews']")
	public WebElement ratingAndReviewBtn;

	@FindBy(xpath = "//*[@id='tab_ratings_and_reviews']/div[1]/h3")
	public WebElement verifyRatingAndReviewHeaderText;

	@FindBy(xpath = "//*[@id='searchApp']/div[6]/select")
	public WebElement displayDropDown;

	@FindBy(xpath = "//*[@id='searchApp']/div[7]/select")
	public WebElement sortPriceDropDown;

	@FindBy(xpath = "//*[@id='searchApp']/div[10]/div[2]/div[2]/div[52]/div[2]/div[2]/a/img")
	public WebElement expensiveProduct;

	@FindBy(xpath = "//*[@id='content']/div/div[8]/div")
	public WebElement verifyOutOfStockText;

	@FindBy(xpath = "//*[@class='at-icon at-icon-addthis']")
	public WebElement plusIconBtn;

	@FindBy(xpath = "//*[@class='at-expanded-menu-button-label']")
	public WebElement facebookIcon;

	@FindBy(xpath = "//*[@id='homelink']")
	public WebElement verifyFacebookHeaderText;
}
