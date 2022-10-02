package stepdefinition;

import org.junit.Assert;
import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeightStep extends CommonMethods {

	boolean result;

	@Given("User naviagte to browser")
	public void user_naviagte_to_browser() {
		getDriver();

	}

	@When("User click Weight tab")
	public void user_click_weight_tabs() {
		wait(2);
		hp.clickWeightTab();

	}

	@Then("User verify Weight Header Text is displayed")
	public void user_verify_weight_header_text_is_displayed() {
		wait(2);
		verifyHeader(weight.weightHeader, ConfigReader.getInput("Weights"));

	}

	@Then("User click home button")
	public void user_click_home_button() {
		wait(2);
		weight.clickHomePage();

	}

	@Then("User verify if navigte back to homepage")
	public void user_verify_if_navigte_back_to_homepage() {
		result = hp.validateURL(ConfigReader.getInput("WebsiteURL"));
		Assert.assertTrue(result);
	}

	@Then("User click Weight tab2")
	public void user_clicks_weight_tab() {
		wait(2);
		hp.clickWeightTab();
	}

	@Then("User click back button")
	public void user_click_back_button() {
		wait(2);
		weight.clickBackBtn();

	}

	@Then("User verify back button")
	public void user_verify_back_button() {
		getTitle();
		Assert.assertTrue(driver.getCurrentUrl(), true);
		System.out.println(driver.getCurrentUrl());
	}

	@Then("User click  Weight tab")
	public void user_click_weight_tab() {
		wait(2);
		hp.clickWeightTab();

	}

	@Then("User verify three categories under weight tab is clickable")
	public void user_verify_three_categories_under_weight_tab_is_clickable() {

		for (int i = 0; i < weight.threeCategories.size(); i++) {
			weight.threeCategories.get(i).click();
			System.out.println("Categories : " + weight.threeCategories.get(i).getText());
			getDriver().navigate().back();
		}
	}

	@When("User hover to weight tab")
	public void user_hover_to_weight_tab() {
		wait(2);
		for (int i = 0; i < hp.menuBar.size(); i++) {
			if (hp.menuBar.get(i).getText().contains(ConfigReader.getInput("Weights"))) {
				hover(hp.menuBar.get(i));
			}
		}
	}

	@Then("User verify categories under weight tab")
	public void user_verify_categories_under_weight_tab() {
		getTextFromList(weight.threeCategories);

	}

	@Then("User click on Dumbbells tab")
	public void user_click_on_dumbbells_tab1() {
		wait(2);
		weight.threeCategories.get(0).click();
	}

	@Then("User verify Dumbells text appeared")
	public void user_verify_dumbells_text_appeared() {
		wait(2);
		verifyHeader(weight.dumbbellsHeader, ConfigReader.getInput("Dumbbells"));
	}

	@When("User click on dumbbells tab")
	public void user_click_on_dumbbells_tab() {

		wait(2);
		hover(hp.menuBar.get(5));
		weight.threeCategories.get(0).click();
		wait(2);
		Assert.assertTrue(weight.dumbbellsHeader.isDisplayed());
		Assert.assertTrue(weight.dumbbellsHeader.getText().contains(ConfigReader.getInput("Dumbbells")));
	}

	@When("User click on sort by box click price\\(Asc)")
	public void user_click_on_sort_by_box_click_price_asc() {

		wait(2);
		weight.clickSortby();
		wait(2);
		selectDropDown(weight.sortby, ConfigReader.getInput("PriceAsc"));

	}

	@Then("User verify product  prices")
	public void user_verify_product_prices() {
		wait(2);
		double priceFirstIndex = getPriceAsInt(weight.priceList.get(0));
		double priceSecIndex = Double
				.parseDouble(weight.priceList.get(1).getText().substring(1, weight.priceList.size() - 6));

		System.out.println("First : " + priceFirstIndex);
		System.out.println("Second: " + priceSecIndex);

		Assert.assertFalse(priceFirstIndex < priceSecIndex);
	}

	@Then("User click on any item")
	public void user_click_on_any_item() {
		wait(2);
		weight.itemList.get(2).click();
		Assert.assertTrue(driver.getCurrentUrl(), true);

	}

	@Then("User click description button")
	public void user_click_description_button() {

		wait(2);
		weight.productInfo.click();
		verifyHeader(weight.productInfoheader, ConfigReader.getInput("productInfo"));

	}

	@Then("User verify product description")
	public void user_verify_product_description() {

		wait(2);
		verifyHeader(weight.productInfoheader, ConfigReader.getInput("productInfo"));

	}

	@Then("User click review button")
	public void user_click_review_button() {

		wait(2);
		weight.ratingReview.click();

	}

	@Then("User verify product review")
	public void user_verify_product_review() {

		wait(2);
		verifyHeader(weight.rateReviewHeader, ConfigReader.getInput("ratingReview"));

	}

	@When("User click dumbbells tab")
	public void user_click_dumbbells_tab() {
		wait(2);
		weight.threeCategories.get(0).click();
		wait(2);
		weight.clickSortby();
		wait(2);
		selectDropDown(weight.sortby, ConfigReader.getInput("PriceAsc"));

	}

	@When("User click lowest price item")
	public void user_click_lowest_price_item() {
		wait(2);
		weight.itemList.get(0).click();

	}

	@When("User click add to cart")
	public void user_click_add_to_cart() {
		wait(2);
		weight.addToCart.click();
	}

	@When("User verify can clickable to shopping cart")
	public void user_verify_can_clickable_to_shopping_cart() {
		wait(2);
		Assert.assertTrue(weight.checkIcon.isDisplayed());

	}

	@Then("User verify shopping cart")
	public void user_verify_shopping_cart() {
		wait(2);
		weight.verifyShoppingCart();
		Assert.assertTrue(weight.shoppingHeader.isDisplayed());

	}

}
