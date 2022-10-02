package pageObj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.CommonMethods;

public class eBikesPageObj extends CommonMethods {

	public eBikesPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='searchApp']//span[@class='cart-not-visible']")
	private List<WebElement> outOfStockList;

	@FindBy(xpath = "//*/div[@data-bind='foreach: items']//div[@class='widget product_preview search']")
	private List<WebElement> productList;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div[2]/div[2]/div/div[3]/a")
	private List<WebElement> productListTxt;

	@FindBy(xpath = "//*[@class='widget product_preview search']//button")
	private List<WebElement> productListBtn;

	public List<WebElement> getProductBtnList() {
		return productListBtn;
	}

	public List<WebElement> getProductList() {
		return productList;
	}

	public List<WebElement> getProductListTxt() {
		return productListTxt;
	}

	public int getProductListSize() {
		return productList.size();
	}

	public int getoutOfStockSize() {
		return outOfStockList.size();
	}

	public int getProductBtnSize() {
		return productListBtn.size();
	}
}
