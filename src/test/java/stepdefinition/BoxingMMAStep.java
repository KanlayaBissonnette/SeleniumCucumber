package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import Utilities.CommonMethods;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BoxingMMAStep extends CommonMethods {

	@Given("User navigate to Home Page")
	public void user_navigate_to_home_page() {
		Driver.getDriver();
	}

	@When("User clicks on Boxing & MMA")
	public void user_clicks_on_boxing_mma1() {
		wait(2);
		boxing.boxingAndMMALink.click();

	}

	@When("User scroll down and clicks on MMA Stands & Bags")
	public void user_scroll_down_and_clicks_on_mma_stands_bags() {
		wait(2);
		boxing.mMAStndsAndBagsLink.click();

	}

	@When("User clicks Short by Description")
	public void user_clicks_short_by_description() {
		wait(2);
		Select select = new Select(boxing.shortByDescriptionLink);
		select.selectByIndex(1);
		boxing.shortByDescriptionLink.click();

	}

	@When("User clicks on first item")
	public void user_clicks_on_first_item() {
		wait(2);
		for (int i = 0; i < boxing.firstItemListLink.size(); i++) {
			System.out.println(boxing.firstItemListLink.get(i).getText());
			boxing.firstItemListLink.get(i).click();
			break;
		}
	}

	@Then("User verify if header of the item match the description of the item")
	public void user_verify_if_header_of_the_item_match_the_description_of_the_item() {
		verifyHeader(boxing.verifyFirstMMAText, ConfigReader.getInput("FirstMMA"));
	}

	@When("User Clicks on Boxing & MMA")
	public void user_clicks_on_boxing_mma() {
		wait(2);
		boxing.boxingAndMMALink.click();

	}

	@When("User Clicks in MMA Accessories")
	public void user_clicks_in_mma_accessories() {
		wait(2);
		boxing.mMAAccessoriesLink.click();
	}

	@When("User Clicks all ten items shown below are clickable")
	public void user_clicks_all_ten_items_shown_below_are_clickable() {
		wait(4);
		for (int i = 0; i < boxing.allTenItemsList.size(); i++) {
			boxing.allTenItemsList.get(i).click();
			System.out.println(boxing.verifyProductHeaderText.getText());
			driver.navigate().back();

		}
	}

	@When("User Clicks add to cart AmStaff Fitness 12oz Boxing Gloves")
	public void user_clicks_add_to_cart_am_staff_fitness_12oz_boxing_gloves() {
		wait(2);
		boxing.addAmStaffFitness12ozBtn.click();
	}

	@When("User Clicks Add to cart {int} int Hand Wraps Blue")
	public void user_clicks_add_to_cart_int_hand_wraps_blue(Integer int1) {
		wait(2);
		boxing.add108HandWrapsBlueBtn.click();
	}

	@Then("Verified if the prices of AmStaff Fitness 12oz Boxing Gloves in left shopping cart are equal than on the product side")
	public void verified_if_the_prices_of_am_staff_fitness_12oz_boxing_gloves_in_left_shopping_cart_are_equal_than_on_the_product_side() {
		verifyHeader(boxing.verifyPriceAmStaffText, ConfigReader.getInput("PriceAmStaff"));
	}

	@Then("Verified if the prices of {int} int Hand Wraps Blue in left shopping cart are equal than on the product side")
	public void verified_if_the_prices_of_int_hand_wraps_blue_in_left_shopping_cart_are_equal_than_on_the_product_side(
			Integer int1) {
		verifyHeader(boxing.verifyPriceHandWrapsBlueText, ConfigReader.getInput("PriceHandWrapsBlue"));
	}

	@Then("User Clicks Checkout")
	public void user_clicks_checkout() {
		wait(2);
		boxing.checkOutBtn.click();
	}

	@Then("User can see checkout page and fill an estimate of Shipping details")
	public void user_can_see_checkout_page_and_fill_an_estimate_of_shipping_details() {
		sendText(boxing.postalCode, ConfigReader.getInput("PostalCode"));
		sendText(boxing.city, ConfigReader.getInput("City"));
		boxing.country.click();
		Select country = new Select(boxing.country);
		country.selectByIndex(2);
		boxing.region.click();
		Select region = new Select(boxing.region);
		region.selectByVisibleText(ConfigReader.getInput("Region"));
		boxing.region.click();
	}

	@Then("User Clicks get estimate")
	public void user_clicks_get_estimate() {
		wait(2);
		boxing.getEstimateBtn.click();
	}

	@When("Clicks in login Button")
	public void clicks_in_login_button() {
		wait(2);
		boxing.loginLink.click();
	}

	@When("User enters valid {string}")
	public void user_enters_valid(String email) {
		wait(2);
		sendText(boxing.userName, email);
	}

	@When("User puts valid {string}")
	public void user_puts_valid(String password) {
		wait(2);
		sendText(boxing.password, password);

	}

	@When("User clicks in Login")
	public void user_clicks_in_login() {
		wait(2);
		boxing.loginBtn.click();
	}

	@When("Clicks in login Botton")
	public void clicks_in_login_botton() {
		wait(2);
		boxing.boxingAndMMALink.click();
	}

	@When("User clicks in AmStaff TBX002 Boxing Stand")
	public void user_clicks_in_am_staff_tbx002_boxing_stand() {
		wait(2);
		boxing.amStaffTBX002Boxing.click();
	}

	@When("User clicks on product information")
	public void user_clicks_on_product_information() {
		wait(2);
		boxing.productInformationBtn.click();
	}

	@Then("Verified if you can see product information")
	public void verified_if_you_can_see_product_information() {
		Assert.assertTrue(boxing.verifyProductInformationText.isDisplayed());
	}

	@Then("User click on write a review in Ratings & Reviews")
	public void user_click_on_write_a_review_in_ratings_reviews() {
		wait(2);
		boxing.ratingAndReviewBtn.click();
	}

	@Then("Verify Ratings & Reviews header text")
	public void verify_ratings_reviews_header_text() {
		Assert.assertTrue(boxing.verifyRatingAndReviewHeaderText.isDisplayed());

	}

	@When("User Clicks on Boxing & MMA tab")
	public void user_clicks_on_boxing_mma_tab() {
		boxing.boxingAndMMALink.click();
	}

	@When("User clicks in Display and select {int}")
	public void user_clicks_in_display_and_select(Integer int1) {
		wait(2);
		Select displayDrop = new Select(boxing.displayDropDown);
		displayDrop.selectByIndex(3);
	}

	@When("User clicks on Sort By and select by price")
	public void user_clicks_on_sort_by_and_select_by_price() {
		wait(2);
		Select sortPrice = new Select(boxing.sortPriceDropDown);
		sortPrice.selectByIndex(1);
	}

	@When("User choose the most expensive product")
	public void user_choose_the_most_expensive_product() {
		wait(2);
		boxing.expensiveProduct.click();
	}

	@Then("Verified if the product is available or out of stock")
	public void verified_if_the_product_is_available_or_out_of_stock() {
		Assert.assertTrue(boxing.verifyOutOfStockText.isDisplayed());

	}

	@Then("User clicks in the + icon")
	public void user_clicks_in_the_icon() {
		wait(3);
		boxing.plusIconBtn.click();
	}

	@Then("User clicks on facebook icon")
	public void user_clicks_on_facebook_icon() {
		wait(3);
		boxing.facebookIcon.click();
	}

	@Then("Verified header text if user can see facebook login page")
	public void verified_header_text_if_user_can_see_facebook_login_page() {
		wait(3);
		switchToSecondWindow();
		verifyHeader(boxing.verifyFacebookHeaderText, ConfigReader.getInput("FB"));

	}

}
