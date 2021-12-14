package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CheckoutAndOrderViewPage;

public class CheckoutAndOrderTest extends BaseClass {
	
	@Parameters({"UserName","Password"})
	@Test
	public void DoCheckoutAndOrder(String UsernameVal, String Password) {
		test = report.startTest("Checkout Order Test");
		CheckoutAndOrderViewPage checkout_and_order = new CheckoutAndOrderViewPage();
		String actual_price = checkout_and_order.CheckoutAndOrder(UsernameVal,Password);
		System.out.println(actual_price);
		Assert.assertEquals(actual_price, "10000.00");
		test.log(LogStatus.PASS, "Checkout successful", "Checkout amount was "+actual_price);
		report.endTest(test);
	}
}
