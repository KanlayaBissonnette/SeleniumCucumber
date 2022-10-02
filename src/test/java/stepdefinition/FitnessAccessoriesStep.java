package stepdefinition;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FitnessAccessoriesStep extends CommonMethods {
	
	@When("User is in Homepage")
	public void user_is_in_homepage() {
		System.out.println("Homepage");
	}

	@When("User click in Fitness Accesories Page")
	public void user_click_in_fitness_accesories_page() {
		click(hp.menuBar.get(3));
			
	}

	@Then("User clicks on products and verified headers of selected products")
	public void user_clicks_on_products_and_verified_headers_of_selected_products() {
	  
		for (int i = 0; i < fitAcc.FitnessAccList.size(); i++) {
			fitAcc.FitnessAccList.get(i).click();
            wait(2);
            String expected = fitAcc.ExerciseHeader.getText();
            System.out.println(expected);
            driver.navigate().back();
		}

	}

	@When("User add to cart the first available item on Aerobic Training")
	public void user_add_to_cart_the_first_available_item_on_aerobic_training() {
	    click(fitAcc.FitnessAccList.get(3));
	    click(fitAcc.sortByPrice);
	    wait(2);
	    click(fitAcc.addToCartFirstItem);
	}

	@Then("User Verified the product with a shipping estimate")
	public void user_verified_the_product_with_a_shipping_estimate() {
	    click(fitAcc.CheckoutBtn);
	    wait(2);
	    verifyHeader(fitAcc.ProductDetails.get(3), ConfigReader.getInput("speedJump"));
	    verifyHeader(fitAcc.ProductDetails.get(5), ConfigReader.getInput("priceSpeedJump"));
	    verifyHeader(fitAcc.ProductDetails.get(6), ConfigReader.getInput("totalPriceSpeedJump"));
	    wait(2);
	    fitAcc.shippingInfo.get(0).sendKeys(ConfigReader.getInput("zipVictor"));
	    fitAcc.shippingInfo.get(1).sendKeys(ConfigReader.getInput("cityVictor"));
	    click(fitAcc.country);
	    click(fitAcc.region);
	    click(fitAcc.getEstimateBtn);
	    getTextFromList(fitAcc.ShippingEstimates);
	        
	}
	
	@When("User Add to Click the First item in sort by price")
	public void user_add_to_click_the_first_item_in_sort_by_price() {
		click(fitAcc.sortByPrice);
		wait(3);
		click(fitAcc.FitnessAccProducts.get(0));
		click(fitAcc.addToCartproduct);
	}

	@Then("User verified the product name and details")
	public void user_verified_the_product_name_and_details() {
		String firstproduct = fitAcc.productHeader.getText();
		click(fitAcc.CheckoutBtn);
		verifyHeader(fitAcc.ProductDetails.get(3), firstproduct);
	    verifyHeader(fitAcc.ProductDetails.get(5), ConfigReader.getInput("priceSpeedJump"));
	    verifyHeader(fitAcc.ProductDetails.get(6), ConfigReader.getInput("totalPriceSpeedJump"));
		
	}

	@When("User Sort by price products on Recovery & Wellness")
	public void user_sort_by_price_products_on_recovery_wellness() {
		click(fitAcc.FitnessAccList.get(0));
		click(fitAcc.sortByPrice);
		wait(3);
		
	}

	@When("User Check out the most expensive item on second page of products")
	public void user_check_out_the_most_expensive_item_on_second_page_of_products() {
		click(fitAcc.secondPage);
		wait(2);
		click(fitAcc.FitnessAccProducts.get(9));
		wait(2);
		String mostExpensiveProduct = fitAcc.productHeader.getText();
		click(fitAcc.addToCartproduct);
		wait(2);
		click(fitAcc.CheckoutBtn);
		verifyHeader(fitAcc.ProductDetails.get(3), mostExpensiveProduct);
		click(fitAcc.CheckoutBtnInShopping);
	}

	@Then("User fills billing and verify information on his order")
	public void user_fills_billing_and_verify_information_on_his_order() {
		checkout.billingInformation.get(0).sendKeys(ConfigReader.getInput("companyName"));
		checkout.billingInformation.get(1).sendKeys(ConfigReader.getInput("FN"));
		checkout.billingInformation.get(2).sendKeys(ConfigReader.getInput("LN"));
		checkout.billingInformation.get(3).sendKeys(ConfigReader.getInput("addressTC"));
		checkout.billingInformation.get(7).sendKeys(ConfigReader.getInput("cityTC"));
		checkout.billingInformation.get(8).sendKeys(ConfigReader.getInput("postalTC"));
		checkout.billingInformation.get(9).sendKeys(ConfigReader.getInput("phone"));
		checkout.billingInformation.get(12).sendKeys(ConfigReader.getInput("email"));
		click(checkout.Billingcountry.get(1));
		wait(2);
		click(checkout.BillingState.get(46));
		wait(2);
		click(checkout.shippingMethod.get(0));
		wait(2);
		getTextFromList(checkout.ReviewOrder);
		
	}


}
