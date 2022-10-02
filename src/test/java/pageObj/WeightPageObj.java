package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class WeightPageObj extends CommonMethods {

	public WeightPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='browse_header']")
	public WebElement weightHeader;

	@FindBy(xpath = "//*[@id='header']/div[1]/a/img")
	public WebElement homePageHeader;

	@FindBy(xpath = "//*[@class='back-link']")
	public WebElement backBtn;

	@FindBy(xpath = " //*[@id='main-menu-navigation-menu-collapse']/ng-include//li[6]//li/div/div")
	public List<WebElement> threeCategories;

	@FindBy(xpath = "//*[@class='browse_header']/h1")
	public WebElement dumbbellsHeader;

	@FindBy(xpath = "//*[@id='searchApp']/div[7]/select")
	public WebElement sortby;

	@FindBy(xpath = "//*[@id='searchApp']/div[7]/select/option")
	public List<WebElement> sortbyList;

	@FindBy(xpath = "//*[@id='searchApp']/div[10]/div[2]/div[2]/div/div[5]/div/form/div/span[2]/span[2]/span[1]")
	public List<WebElement> priceList;

	@FindBy(xpath = "//*[@class='add_to_cart btn btn-default']")
	public List<WebElement> priceAddCart;

	@FindBy(xpath = "//*[@class='widget product_short_description']/a")
	public List<WebElement> itemList;

	@FindBy(xpath = "//*[@id='content']/div/div[7]/div/form/div/button")
	public WebElement addToCart;

	@FindBy(xpath = "//*[@class='added-success zs-tooltip']")
	public WebElement checkIcon;

	@FindBy(xpath = "//*[@class='widget_content']")
	public WebElement shoppingCart;

	@FindBy(xpath = "//*[@id='sidebar_cart_preview']/div[1]")
	public WebElement shoppingHeader;

	@FindBy(xpath = "//*[@id='product_detail_tabs']/li[1]/span")
	public WebElement productInfo;

	@FindBy(xpath = "//*[@id='tab_product_information']/div/h3")
	public WebElement productInfoheader;

	@FindBy(xpath = "//*[@id='product_detail_tabs']/li[2]/span")
	public WebElement ratingReview;

	@FindBy(xpath = "//*[@id='tab_ratings_and_reviews']/div[1]/h3")
	public WebElement rateReviewHeader;

	public void clickHomePage() {
		click(homePageHeader);
	}

	public void clickBackBtn() {
		click(backBtn);
	}

	public void clickSortby() {
		click(sortby);
	}

	public void verifyShoppingCart() {
		String text = shoppingCart.getText();
		System.out.println(text);
	}

}
