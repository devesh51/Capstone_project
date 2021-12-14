package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.BaseClass;

public class CheckoutAndOrderViewPage {
	
	WebDriver driver = BaseClass.driver;
	
//	==================== WebElements ===================
	
	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	
	@FindBy(tagName = "button")
	WebElement login;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	@FindBy(xpath="//tr/td[contains(text(),'iPhone x')]/following-sibling::td/a")
	WebElement product_addto_cart;
	
	@FindBy(xpath="//tr/td[contains(text(),'10000')]")
	WebElement product_price;
	
	@FindBy(linkText="Checkout Now")
	WebElement cart_to_checkout;
	
	@FindBy(linkText="Pay via secure Payment Gateway")
	WebElement proceed_to_payement;

	
	@FindBy(linkText="Click to complete checkout")
	WebElement complete_checkout;
	
	@FindBy(linkText="Order History")
	WebElement order_history;
	
//	==================== init Elements in Class constructor ==========
	public CheckoutAndOrderViewPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	
	public String CheckoutAndOrder(String UsernameVal , String Password) {
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		home.click();
		product_addto_cart.click();
		cart_to_checkout.click();
		proceed_to_payement.click();
		complete_checkout.click();
		order_history.click();
		return product_price.getText();
		
	}
}
