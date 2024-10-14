package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegPage;
import com.qa.opencart.pages.ResultsPage;


public class BaseTest {
	DriverFactory dr;
	WebDriver driver;
	protected LoginPage loginPage;
	protected AccountsPage accountsPage;
	protected ResultsPage resultsPage;
	protected SoftAssert softassert;
	protected ProductInfoPage productInfoPage;
	protected Properties prop;
	protected RegPage regPage;

	@Parameters({"browser" , "browserversion", "testname"})
	@BeforeTest
	public void setup(@Optional("chrome") String browserName, @Optional String browserversion, @Optional String testName) {
		dr = new DriverFactory();
		prop=dr.initProp();
		if(browserName!=null) {
			prop.setProperty("browser", browserName);
			prop.setProperty("browserversion", browserversion);
			prop.setProperty("testname", testName);
		}
		
		driver = dr.initDriver(prop);
		loginPage = new LoginPage(driver);
		productInfoPage=new ProductInfoPage(driver);
		softassert=new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
