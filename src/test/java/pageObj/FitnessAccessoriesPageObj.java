package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class FitnessAccessoriesPageObj extends CommonMethods {

	public FitnessAccessoriesPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"main-menu-navigation-menu-collapse\"]/ng-include/ul/li[4]/a")
	public WebElement fitnessNAcces;

	@FindBy(xpath = "//*[@id='product_code_image_id']")
	public List<WebElement> FitnessAccList;

	@FindBy(xpath = "//*[@class = 'widget browse_sub_categories']/div[1]")
	public WebElement clickfirst;

	@FindBy(xpath = "//*[@class='browse_header']")
	public WebElement ExerciseHeader;

	@FindBy(xpath = "//*[contains(@label,'Price (Asc)')]")
	public WebElement sortByPrice;

	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[10]/div[2]/div[2]/div[2]/div[5]/div/form/div/button")
	public WebElement addToCartFirstItem;

	@FindBy(xpath = "//*[@id='content']/div/div[8]/div/form/div/button")
	public WebElement addToCartproduct;

	@FindBy(xpath = "//*[@class='btn btn-default' and contains(text(),'Checkout')]")
	public WebElement CheckoutBtn;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/tbody/tr/td")
	public List<WebElement> ProductDetails;

	@FindBy(xpath = "//*[@class='row']/div/form/form-group/div/div/input")
	public List<WebElement> shippingInfo;

	@FindBy(xpath = "//*[contains(@label,'United States')]")
	public WebElement country;

	@FindBy(xpath = "//*[contains(@label,\"Virginia\")][1]")
	public WebElement region;

	@FindBy(xpath = "//*[@id='shipping-estimates-submit']")
	public WebElement getEstimateBtn;

	@FindBy(xpath = "//*[@id=\"shipping-estimates-rates\"]/div/table/tbody/tr")
	public List<WebElement> ShippingEstimates;

	@FindBy(xpath = "//*[@class='widget product_image']")
	public List<WebElement> FitnessAccProducts;

	@FindBy(xpath = "//*[@class= 'widget product_short_description']/h1")
	public WebElement productHeader;

	@FindBy(xpath = "//*[@id=\"searchApp\"]/ul/li[4]/a")
	public WebElement secondPage;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/div/button[4]")
	public WebElement CheckoutBtnInShopping;

}
