package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseClass;

public class AddToCartPage {
	
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
	
	@FindBy(xpath="//tr/td[contains(text(),'iPhone x')]")
	WebElement product;

	
	@FindBy(xpath="//tr/td[contains(text(),'iPhone x')]/following-sibling::td/a")
	WebElement product_addto_cart;
	
//	==================== init Elements in Class constructor ==========
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	
	
	public String AddToCart(String UsernameVal , String Password) {
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		home.click();
		product_addto_cart.click();
		return product.getText();
	}
}

