package Utilities;

import pageObj.BalanceBallPageObj;
import pageObj.BikePageObj;
import pageObj.BoxingMMAPageObj;
import pageObj.CardioPageObj;
import pageObj.CartPageObj;
import pageObj.CheckoutPageObj;
import pageObj.ContactUsPageObj;
import pageObj.FitnessAccessoriesPageObj;
import pageObj.HomepageObj;
import pageObj.InstagramPageObj;
import pageObj.LoginPageObj;
import pageObj.PaypalPageObj;
import pageObj.RegistrationPageObj;
import pageObj.ShipmentTrackingPageObj;
import pageObj.StrengthEquipmentPageObj;
import pageObj.WeightPageObj;
import pageObj.eBikesPageObj;

public class PageInitialized extends Driver {

	protected static BalanceBallPageObj bB;
	protected static BoxingMMAPageObj boxing;
	protected static CardioPageObj cardio;
	protected static CartPageObj cart;
	protected static CheckoutPageObj checkout;
	protected static ContactUsPageObj contact;
	protected static eBikesPageObj eBike;
	protected static FitnessAccessoriesPageObj fitAcc;
	protected static HomepageObj hp;
	protected static InstagramPageObj ig;
	protected static LoginPageObj login;
	protected static ShipmentTrackingPageObj shipment;
	protected static WeightPageObj weight;
	protected static BikePageObj bike;
	protected static RegistrationPageObj reg;
	protected static StrengthEquipmentPageObj eq;
	protected static PaypalPageObj paypal;

	public static void init() {
		bB = new BalanceBallPageObj();
		boxing = new BoxingMMAPageObj();
		cardio = new CardioPageObj();
		cart = new CartPageObj();
		checkout = new CheckoutPageObj();
		contact = new ContactUsPageObj();
		eBike = new eBikesPageObj();
		fitAcc = new FitnessAccessoriesPageObj();
		hp = new HomepageObj();
		ig = new InstagramPageObj();
		login = new LoginPageObj();
		shipment = new ShipmentTrackingPageObj();
		weight = new WeightPageObj();
		bike = new BikePageObj();
		reg = new RegistrationPageObj();
		eq = new StrengthEquipmentPageObj();
		paypal = new PaypalPageObj();

	}

}
