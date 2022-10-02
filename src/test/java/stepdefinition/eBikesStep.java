package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eBikesStep extends CommonMethods {

	@Given("User navigate to Homepage")
	public void user_navigate_to_homepage() {
		getDriver();

	}

	@When("User Click on <eBike> menu bar")
	public void user_click_on_e_bike_menu_bar() {
		wait(2);
		selectObj(hp.menuBar, ConfigReader.getInput("menuSelect"));
	}

	@Then("User should navigate to eBike Page")
	public void user_should_navigate_to_e_bike_page() {

		System.out.println(getTitle());
		Assert.assertTrue(getTitle().contains(ConfigReader.getInput("eBikeTitleExp")));

	}

	@Then("User should see all available product to purchase")
	public void user_should_see_all_available_product_to_purchase() {
		wait(2);
		for (WebElement list : eBike.getProductList()) {
			Assert.assertTrue(list.isDisplayed());
		}

	}

	@Then("Get all eBikes that are available to purchase")
	public void get_all_e_bikes_that_are_available_to_purchase() {
		wait(2);
		int AllProduct = eBike.getProductListSize();
		int Oos = eBike.getoutOfStockSize();
		int available = getAvailable(AllProduct, Oos);

		Assert.assertTrue(available <= AllProduct);

	}

	@Then("VERIFY that they are Clickable")
	public void verify_that_they_are_clickable() {
		wait(2);
		for (int i = 0; i <= eBike.getProductListSize() - 1; i++) {
			if (eBike.getProductBtnList().get(i).getAttribute("style")
					.contains(ConfigReader.getInput("attributeDNone"))) {
				Assert.assertTrue(eBike.getProductList().get(i).isEnabled());
				Assert.assertTrue(eBike.getProductList().get(i).isDisplayed());
			} else {
				Assert.assertTrue(eBike.getProductBtnList().get(i).isEnabled());
				Assert.assertTrue(eBike.getProductBtnList().get(i).isDisplayed());
			}
		}

	}

	@Then("^Click on any <Cosmopolitan>$")
	public void click_on_any_product() {
		wait(3);
		selectObj(eBike.getProductListTxt(), "Cosmopolitan");

	}

	@Then("Click on Add To Cart button")
	public void click_on_add_to_cart_button() {
		wait(2);
		bike.clcikAddCartBtn();
	}

	@Then("Click checkout button")
	public void click_checkout_button() {
		bike.clickCheckOutBtn();
	}

	@Then("Verify item in cart is the same item that was selected")
	public void verify_item_in_cart_is_the_same_item_that_was_selected() {
		wait(2);
		Assert.assertTrue(cart.getPdName().contains(ConfigReader.getInput("pDNameExp")));
	}

	@Then("Click Clear button")
	public void click_clear_button() {
		wait(2);
		click(cart.clearBtn);

	}

	@Then("Click Ok on popUp alert")
	public void click_ok_on_pop_up_alert() {
		wait(2);
		acceptAlert();

	}

	@Then("Verify that there are no items in cart")
	public void verify_that_there_are_no_items_in_cart() {
		wait(2);
		Assert.assertTrue(cart.getCartInfo().contains("no items"));
	}
}
