package stepdefinition;

import org.junit.Assert;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StrengthEquipmentStep extends CommonMethods {
	
	@When("Hover on Strength Equipment tab")
	public void hover_on_strength_equipment_tab() {
	    hover(hp.strengthEquipmentTab);
	}

	@When("Click on ‘Squat \\/ Power Racks’")
	public void click_on_squat_power_racks() {
	    hp.powerRacks.click();
	}

	@When("Click on ‘Smith Machines’ from sub category")
	public void click_on_smith_machines_from_sub_category() {
		wait(2);
	    eq.smithMachine.click();
	}

	@When("Click add cart on Altas AL3058 All-in-One Trainer")
	public void click_add_cart_on_altas_al3058_all_in_one_trainer() {
		wait(1);
	    eq.cmal3058.click();
	}

	@When("Click ‘checkout’")
	public void click_checkout() {
	   eq.checkoutBtn.click();
	}

	@Then("Verify product detail such as product number \\/ product name \\/ Qty \\/ price \\/ total")
	public void verify_product_detail_such_as_product_number_product_name_qty_price_total() {
		wait(2);
		verifyHeader(cart.productNum, ConfigReader.getInput("productNum"));
		verifyHeader(cart.productName3058, ConfigReader.getInput("productName"));
	    Assert.assertTrue(cart.productQty.getAttribute("value").equals(ConfigReader.getInput("productQty")));
	    verifyHeader(cart.productPrice, ConfigReader.getInput("productPrice"));
	    verifyHeader(cart.productPriceTotal, ConfigReader.getInput("productTotalPrice"));
	}

	@Then("Verify update button \\/ clear button \\/ checkout button are display and enable")
	public void verify_update_button_clear_button_checkout_button_are_display_and_enable() {
		Assert.assertTrue(cart.updateBtn.isDisplayed());
		Assert.assertTrue(cart.updateBtn.isEnabled());
		Assert.assertTrue(cart.clearBtn.isDisplayed());
		Assert.assertTrue(cart.clearBtn.isDisplayed());
		Assert.assertTrue(cart.checkoutBtn.isDisplayed());
		Assert.assertTrue(cart.checkoutBtn.isDisplayed());  
	}

	@Then("Click ‘checkout’ button")
	public void click_checkout_button() {
	    cart.checkoutBtn.click();
	}

	@Then("User can see payment method")
	public void user_can_see_payment_method() {
		wait(3);
	    verifyHeader(checkout.paymentMtd, ConfigReader.getInput("paymentMtdTxt"));
	}

	@Then("Fill random info in ‘billing info’ all requirement box")
	public void fill_random_info_in_billing_info_all_requirement_box() {
	    checkout.fillBillingForm();
	}

	@Then("Select free shipping on radio button")
	public void select_free_shipping_on_radio_button() {
	    checkout.freeShippingRadioBtn.click();
	}

	@Then("Select PayPal radio button")
	public void select_pay_pal_radio_button() {
	    checkout.paypalRadio.click();
	}

	@Then("Click ‘I have read and agree to the Terms and Conditions’ box")
	public void click_i_have_read_and_agree_to_the_terms_and_conditions_box() {
	    checkout.agreeBox.click();
	}

	@Then("Click place order")
	public void click_place_order() {
	    checkout.placeOrderBtn.click();	
	    wait(3);
	}

	@Then("Verify that user is navigated to Paypal website")
	public void verify_that_user_is_navigated_to_paypal_website() {
		verifyHeader(paypal.paypalTxt, ConfigReader.getInput("paypal"));
	}

	@When("Input {string} to QTY box of item3058 and SD360 and click add to cart")
	public void input_to_qty_box_of_item3058_and_SD360_and_click_add_to_cart(String num) {
		scrollByPixel(250);
		numberInput(eq.qtyBox3058, num);
		numberInput(eq.qtyBox360, num);
		eq.cmal3058.click();
	}

	@When("Shopping cart should be displayed qty only {string}")
	public void shopping_cart_should_be_displayed_qty_only(String actualNum) {
		scrollByPixel(-300);
	    verifyHeader(eq.cartQtyTxt, actualNum);
	}

	@When("click add to cart of SD360")
	public void click_add_to_cart_of_SD360() {
		eq.SD360AddToCart.click();
	}

	@Then("Warning icon should pops-up")
	public void warning_icon_should_pops_up() {
	    Assert.assertTrue(eq.warningImg.isDisplayed());
	}

	@Then("Hover warning pops-up")
	public void hover_warning_pops_up() {
	    hover(eq.warningImg);
	}

	@Then("User should see warning message")
	public void user_should_see_warning_message() {
		System.out.println("from web is = "+eq.warningImg.getAttribute("data-original-title"));
		System.out.println(ConfigReader.getInput("warningMsg"));
		Assert.assertEquals(eq.warningImg.getAttribute("data-original-title"), ConfigReader.getInput("warningMsg"));
	}

	
}
	
	
