package stepdefinition;

import org.junit.Assert;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterStep extends CommonMethods {
	
	@When("User clicks on Store Locator at the bottom of the page")
	public void user_clicks_on_store_locator_at_the_bottom_of_the_page() {
	    hp.storeLocatorBtn.click();
	}

	@Then("User can see all store locations")
	public void user_can_see_all_store_locations() {
		verifyHeader(contact.BarrieLocation, ConfigReader.getInput("Barrie"));
		verifyHeader(contact.LondonLocation, ConfigReader.getInput("London"));
		verifyHeader(contact.MontrealLocation, ConfigReader.getInput("Montreal"));
		verifyHeader(contact.TorontoLocation, ConfigReader.getInput("Toronto"));
	}

	@When("click on Track Your Order")
	public void click_on_track_your_order() {
	    hp.trackYourOrderBtn.click();
	}
	@Then("User can view Order Number box, Shipping Postal Code box, Shipping Email box and Check Status button")
	public void user_can_view_order_number_box_shipping_postal_code_box_shipping_email_box_and_check_status_button() {
	    verifyHeader(shipment.orderNumberTxt, ConfigReader.getInput("orderNum"));
	    verifyHeader(shipment.shippingPostalCode, ConfigReader.getInput("shipPostCode"));
	    verifyHeader(shipment.shippingEmail, ConfigReader.getInput("shipEmail"));
	}
	
	@When("click on instagram icon")
	public void click_on_instagram_icon() {
	    hp.instagramBtn.click();
	}
	
	@Then("should navigate to Fitness Avenue Instagram page")
	public void should_navigate_to_fitness_avenue_instagram_page() {
		switchToSecondWindow();
		if (Driver.getDriver().getCurrentUrl().equals(ConfigReader.getInput("instaUrl"))){
				Assert.assertTrue(ig.instaG.isDisplayed());
			}else if(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getInput("instaURLAcct"))){
				Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getInput("instaURLAcct")));
				Assert.assertTrue(ig.instaImage.isDisplayed());
			}
	}
}
