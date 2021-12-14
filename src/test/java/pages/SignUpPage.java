package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import test.BaseClass;

public class SignUpPage {
	
	WebDriver driver = BaseClass.driver;
	
//	==================== WebElements ===================
	
	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(linkText="Not a member? Signup")
	WebElement navigate_to_signup;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(name="pwd2")
	WebElement cnfm_password;
	
	@FindBy(name="fname")
	WebElement fname;
	
	@FindBy(name="lname")
	WebElement lname;
	
	@FindBy(name="age")
	WebElement age;
	
	@FindBy(name="address")
	WebElement address;
	
	
	@FindBy(tagName = "button")
	WebElement signup;
	
//	==================== init Elements in Class constructor ==========
	public SignUpPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
//	================ class Methods =====================
	@Parameters({"UserName","Password","Fname","Lname","Age","Address"})
	public void SignUp(
			String UsernameVal ,
			String Password ,
			String Fname , 
			String Lname ,
			String Age ,
			String Address
			) {
		navigate_to_login.click();
		navigate_to_signup.click();
		username.sendKeys(UsernameVal);
		System.out.println(UsernameVal);
		password.sendKeys(Password);
		cnfm_password.sendKeys(Password);
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		age.sendKeys(Age);
		address.sendKeys(Address);
		signup.click();
		
	}
}
