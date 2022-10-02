package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CardioStep extends CommonMethods {

	
	@Given("User navigate to Fitnessavenue website")
	public void user_navigate_to_fitnessavenue_website() {
		getDriver();
	}
//1
	@When("User click to Cardio button")
	public void user_click_to_cardio_button() {
		click(hp.cardioBtn);
	}

	@When("User scroll down to click at display box")
	public void user_scroll_down_to_click_at_display_box() {
		click(cardio.display);
		wait(3);
	}
	@When("User click {string} of display")
	public void user_click_of_display(String display) {
		selectObj(cardio.displayOption, display);
		wait(5);
	}
	@Then("User verify all elements name")
	public void user_verify_all_elements_name() {
		getTextFromList(cardio.itemNameList);
		int itemNameListSize = cardio.itemNameList.size();
		System.out.println(itemNameListSize);
		
	}

	
	
	
	
	
	
	
	
//	@When("^User scroll down to click at display")
//	public void user_scroll_down_to_click_at_display() throws InterruptedException {
//		click(cardio.display);
//		Thread.sleep(3000);
//	}

//	@When("^User click (.+) number of display$")
//	public void user_click_number_of_display(String display) {
//		selectObj(cardio.displayOption, display);
//		wait(3);
//	}

//	@Then("User verify all elements name  that contain display {int}")
//	public void user_verify_all_elements_name_that_contain_display(String display) {
//		getTextFromList(cardio.itemNameList);
//		int itemNameListSize = cardio.itemNameList.size();
//		System.out.println(itemNameListSize);
//		
//	}
//2
	@When("User hover to Cardio button")
	public void user_hover_to_cardio_button() {
		for (int i = 0; i < hp.menuBar.size(); i++) {
			if (hp.menuBar.get(i).getText().contains(ConfigReader.getInput("cardio"))) {
				hover(hp.menuBar.get(i));
			}
		
		}
	}

	@When("User click each items displayed and verify each display headers")
	public void user_click_each_items_displayed() {
		for (int i = 0; i < cardio.cardioHoverList.size(); i++) {
			String actual = cardio.cardioHoverList.get(i).getText();
			cardio.cardioHoverList.get(i).click();
			wait(2);
			String expected = cardio.headerText.getText();
			Assert.assertTrue(actual.contains(expected));
			driver.navigate().back();
			hover(hp.cardioBtn);

		}
	}

	@Then("User click bikes display")
	public void user_click_bikes_display() {
		click(cardio.bikesTab);
	}

	@Then("User click Air Bikes")
	public void user_click_air_bikes() {
		click(cardio.airBikes);
		wait(2);
	}

	@Then("User go to SortBy and click Short Description")
	public void user_go_to_sort_by_and_click_short_description() {
		click(cardio.sortBy);
		selectObj(cardio.sortByOption, "Short Description (Asc)");
	}

	@Then("User click first product")
	public void user_click_first_product() {
		click(cardio.firstProduct);
		wait(3);
	}

	@Then("User verify ONLY Feature for this product")
	public void user_verify_only_feature_for_this_product() {
		click(cardio.productInfoTab);
		wait(5);
		verifyHeader(cardio.productFeatureHeadText, ConfigReader.getInput("Features"));
		verifyHeader(cardio.featureDetails1, ConfigReader.getInput("RevMeter"));
		verifyHeader(cardio.featureDetails2, ConfigReader.getInput("Consolelayout"));
		verifyHeader(cardio.featureDetails3, ConfigReader.getInput("Shrouding"));
		verifyHeader(cardio.featureDetails4, ConfigReader.getInput("Integrated"));
		verifyHeader(cardio.featureDetails5, ConfigReader.getInput("Convenient"));
		verifyHeader(cardio.featureDetails6, ConfigReader.getInput("Updated"));
		verifyHeader(cardio.featureDetails7, ConfigReader.getInput("Foot"));
	}
//3
	@When("User scroll down to click sort by")
	public void user_scroll_down_to_click_sort_by() {
		click(cardio.sortBy);
	}

	@When("User click on Price\\(ASC)")
	public void user_click_on_price_asc() {
		selectObj(cardio.sortByOption, "Price (Asc)");
	}

	@When("User click to change currency to USD on top of the right conner")
	public void user_click_to_change_currency_to_usd_on_top_of_the_right_conner() {
		click(cardio.usdCurrencyTab);
	}

	@When("User click on first product")
	public void user_click_on_first_product() {
		click(cardio.firstProduct);
	}

	@When("User add product to cart")
	public void user_add_product_to_cart() {
		click(cardio.addToCartBtn);
		wait(2);
		String beforeUpdateCart = cart.sideBarTable.getText();
		verifyHeader(cart.sideBarTable, beforeUpdateCart);
	}

	@When("User click item button")
	public void user_click_item_button() {
		click(cardio.cartPreviewBtn);
		wait(2);
	}

	@Then("User verify product number, product name and item price")
	public void user_verify_product_number_product_name_and_item_price() {
		String cartItem = cart.itemTable.getText();
		verifyHeader(cart.itemTable, cartItem);
	}

	@Then("User click quantity box")
	public void user_click_quantity_box() {
		click(cart.quantityBox);
	}

	@Then("User enter number {string} in quantity box")
	public void user_enter_number_in_quantity_box(String quantity) {
		cart.quantityBox.sendKeys(Keys.ARROW_RIGHT);
		cart.quantityBox.sendKeys(Keys.BACK_SPACE);
		cart.quantityBox.sendKeys(quantity);
	}

	@Then("User click Update Button and click cardio button")
	public void user_click_update_button_and_click_cardio_button() {
		click(cart.updateBtn);
		wait(3);
		selectObj(hp.menuBar, ConfigReader.getInput("cardio"));
	}

	@Then("User Verify shopping cart on the left side of website")
	public void user_verify_shopping_cart_on_the_left_side_of_website() {
		String AfteUpdateCart = cart.sideBarTable.getText();
		verifyHeader(cart.sideBarTable, AfteUpdateCart);
		
	}

//4
	@When("User click Rowers button")
	public void user_click_rowers_button() {
		cardio.cardioHoverList.get(3).click();
	}

	@When("User click first element")
	public void user_click_first_element() {
		wait(2);
		cardio.rowersImgtxt.get(0).click();
	}

	@When("User click all slides and User verify slides are clickable")
	public void user_click_all_slides_and_user_verify_slides_are_clickable() {
		for (int i = 0; i < cardio.imgList.size(); i++) {	
			String small = cardio.imgList.get(i).getAttribute("src").toString().substring(0, cardio.imgList.get(i).getAttribute("src").indexOf("_"));
			System.out.println(small);
			
			//shorter code to split string
//			String small2 = cardio.imgList.get(i).getAttribute("src").toString().split("_") [0];
//			System.out.println(small2);	
			
			cardio.imgList.get(i).click();
			
			String large = cardio.largerImg.getAttribute("src").toString().substring(0, cardio.largerImg.getAttribute("src").indexOf("_"));
			System.out.println(large);
			
			if(small.equals(large)) {
				System.out.println("same pictures appear after click");
			}
		}

	}
	@When("User scroll down and click product information")
	public void user_scroll_down_and_click_product_information() {
		wait(2);
		cardio.productInfoTab.click();
	}

	@Then("User verify product information")
	public void user_verify_product_information() {
		verifyHeader(cart.productInfoHeaderText, ConfigReader.getInput("ProductInformation"));
		verifyHeader(cart.productInfoDetails, ConfigReader.getInput("Model"));
	}
}
