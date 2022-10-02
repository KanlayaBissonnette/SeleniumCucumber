package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommonMethods;

public class CartPageObj extends CommonMethods {

	public CartPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/thead/tr/th[3]")
	public WebElement productNumHeaderText;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/tbody/tr/td[3]")
	public WebElement productNumber;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/thead/tr/th[4]")
	public WebElement productNameHeaderText;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/thead/tr/th[6]")
	public WebElement itemPriceHeaderText;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/tbody/tr/td[6]")
	public WebElement itemPrice;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/tbody/tr/td[5]/input")
	public WebElement quantityBox;

	@FindBy(xpath = "//*[@id=\"shopping_cart_form\"]/table/tbody/tr")
	public WebElement itemTable;

	@FindBy(xpath = "//*[@id=\"scroll_section\"]/table/tbody/tr")
	public WebElement sideBarTable;

	@FindBy(xpath = "//*[@id='tab_product_information']/div/h3")
	public WebElement productInfoHeaderText;

	@FindBy(xpath = "//*[@id=\"tab_product_information\"]/span/span")
	public WebElement productInfoDetails;

	@FindBy(xpath = "//td[@title='Product #']/div")
	public WebElement productNum;

	@FindBy(xpath = "//a[@title='Altas AL-3058 All-in-One Trainer'][contains(text(), 'Altas AL-3058 All-in-One Trainer')]")
	public WebElement productName3058;

	@FindBy(xpath = "//input[@class='qty']")
	public WebElement productQty;

	@FindBy(xpath = "//td[@title='Item Price']")
	public WebElement productPrice;

	@FindBy(xpath = "//td[@title='Total']")
	public WebElement productPriceTotal;

	@FindBy(id = "update-cart")
	public WebElement updateBtn;

	@FindBy(xpath = "//button[@class='btn btn-default'][contains(text(), 'Clear')]")
	public WebElement clearBtn;

	@FindBy(xpath = "//button[@class='btn btn-default'][@type='submit'][contains(text(), 'Checkout')]")
	public WebElement checkoutBtn;

	@FindBy(xpath = "//*[@id='shopping_cart_form']/table/tbody/tr/td[4]/div/div[1]/div/div/a")
	private WebElement PdName;

	@FindBy(xpath = "//*/div[@class='widget shopping_cart']/div")
	private WebElement cartinfo;

	public String getPdName() {
		return PdName.getText();
	}

	public String getCartInfo() {
		return cartinfo.getText();
	}

}
