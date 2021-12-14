package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	public String expectedUrl = "http://localhost:8080/Section7LEP2/dashboard";
	
	@Test
	@Parameters({"UserName","Password","AssertPositiveURL"})
	public void PositiveLogin(String correctUser, String correctPass , String actualUrl) {
		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		Assert.assertEquals(actualUrl, "http://localhost:8080/Section7LEP2/dashboard");
		test.log(LogStatus.PASS, "Login successful", "Login test run Successfully ");
		report.endTest(test);
	}
	
	@Test
	@Parameters({"UserName","WrongPassword" , "AssertNegativeURL"})
	public void NegativeLogin(String correctUser, String wrongPassword , String actualUrl ) {
		test = report.startTest("Negative Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,wrongPassword);
		
		Assert.assertEquals(actualUrl, "http://localhost:8080/Section7LEP2/loginaction");
		test.log(LogStatus.PASS, "Login unsuccessful", "Negative Login test run Successfully ");
		report.endTest(test);
	}
	
}
