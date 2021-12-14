package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import pages.AddToCartPage;

public class AddToCartTest extends BaseClass {
	
	@Parameters({"UserName","Password"})
	@Test
	public void DoAddToCart(String UserNameVal,String Password) {
		test = report.startTest("Add to cart Test");
		AddToCartPage adct = new AddToCartPage();
		String product = adct.AddToCart(UserNameVal , Password);
		Assert.assertEquals(product, "iPhone x");
		test.log(LogStatus.PASS, "Add to cart test successful", "successfully added the product "+product);
		report.endTest(test);
	}
	
	
}