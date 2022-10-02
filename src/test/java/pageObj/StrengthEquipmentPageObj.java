package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class StrengthEquipmentPageObj extends CommonMethods {

	public StrengthEquipmentPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@alt='Smith Machines']")
	public WebElement smithMachine;

	@FindBy(xpath = "//button[@value='Add to cart'][@data-part-num='CMAL3058']")
	public WebElement cmal3058;

	@FindBy(xpath = "//button[@class='btn btn-default'][contains(text(), 'Checkout')]")
	public WebElement checkoutBtn;

	@FindBy(xpath = "//*[@id='qty_TO_CMAL3058']")
	public WebElement qtyBox3058;

	@FindBy(xpath = "//*[@id='qty_TO_PR360']")
	public WebElement qtyBox360;

	@FindBy(xpath = "//button[@value='Add to cart'][@data-part-num='PR360']")
	public WebElement SD360AddToCart;

	@FindBy(xpath = "//div[@class='cart_qty']")
	public WebElement cartQtyTxt;

	@FindBy(xpath = "//img[@class='added-error zs-tooltip']")
	public WebElement warningImg;

	@FindBy(xpath = "//div[@class='title'][contains(text(), 'Shopping Cart')]")
	public WebElement shoppingCart;
}
