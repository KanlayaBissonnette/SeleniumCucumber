package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class CardioPageObj extends CommonMethods {

	public CardioPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

//	@FindBy(xpath = "//*[@class = 'search-limit']/select")
//	public WebElement display;
	
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[6]/select")
	public WebElement display;
	

	@FindBy(xpath = "//*[@class = 'search-limit']/select/option")
	public List<WebElement> displayOption;

//	@FindBy(xpath = "//*[@class = 'search-sort-by']/select") 
//	public WebElement sortBy;
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[7]/select") 
	public WebElement sortBy;

//	@FindBy(xpath = "//*[@class = 'search-sort-by']/select/option")
//	public List<WebElement> sortByOption;
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[7]/select/option")
	public List<WebElement> sortByOption;

	
	@FindBy(xpath = "//*[@id='searchApp']/div[10]/div[2]/div[2]/div/div/a")
	public List<WebElement> itemNameList;

	@FindBy(xpath = "//*[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[2]/ul/li/div/div/div/div/h3/a")
	public List<WebElement> cardioHoverList;
	
	
	@FindBy(xpath = "//*[@class = 'browse_header']/h1")
	public WebElement headerText;

	@FindBy(xpath = "//*[@id='main-menu-navigation-menu-collapse']/ng-include/ul/li[2]/ul/li/div/div[2]/div/div/h3/a")
	public WebElement bikesTab;

	@FindBy(xpath = "//*[@class = 'widget product_category '][1]")
	public WebElement airBikes;

	@FindBy(xpath = "//*[@class = 'widget product_preview search'][1]/div[3]/a")
	public WebElement firstProduct;

	@FindBy(xpath = "//*[@id='product_detail_tabs']/li[1]/span")
	public WebElement productInfoTab;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[2]")
	public WebElement productFeatureHeadText;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[3]")
	public WebElement featureDetails1;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[4]")
	public WebElement featureDetails2;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[5]")
	public WebElement featureDetails3;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[6]")
	public WebElement featureDetails4;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[7]")
	public WebElement featureDetails5;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[8]")
	public WebElement featureDetails6;

	@FindBy(xpath = "//*[@id = 'tab_product_information']/b/p[9]")
	public WebElement featureDetails7;

	@FindBy(xpath = "//*[@class = 'currency_list']/div[1]/a")
	public WebElement cadCurrencyTab;

	@FindBy(xpath = "//*[@class = 'currency_list']/div[2]/a")
	public WebElement usdCurrencyTab;

	@FindBy(xpath = "//*[@id='content']/div/div[6]/div/form/div/button")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//span[@id = 'cart_preview_quantity']")
	public WebElement cartPreviewBtn;

	@FindBy(xpath = "//*[@class= 'widget product_preview search'][1]/div[2]")
	public WebElement firstProductImg;

	@FindBy(xpath = "//*[@id='carousel']/li/img")
	public List<WebElement> imgList;

	@FindBy(xpath = "//*[@id='content']/div/div[2]/div[2]/div/img")
	public WebElement imgDisplayed;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div/img[@src]")
	public WebElement largerImg;
	
	
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[8]/div[2]/div[2]/div/div[3]/a")
	public List<WebElement> ellipProductList;

	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[9]/div[2]/div[2]/div/div[3]/a")
	public List<WebElement> rowersProductList;

	@FindBy(xpath = "//*[@class = 'widget product_list grid']/div[2]/div[2]/div/div[2]")
	public List<WebElement> rowersImgList;

	@FindBy(xpath = "//*[@id='searchApp']/div[9]/div[2]/div[2]/div/div/a")
	public List<WebElement> rowersImgtxt;

}
