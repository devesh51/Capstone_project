package test;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class BaseClass {
	public static WebDriver driver;
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void ReportSetup() throws IOException {
		report = new ExtentReports("ExtentReport.html");
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/Section7LEP2/home");
//		managing window size 
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public  void teardown(){

		driver.close();
		driver.quit();

	}
	
	@AfterTest
	public void ReportTeardown() throws IOException {
		report.flush();
		report.close();
	}
	
	
}

