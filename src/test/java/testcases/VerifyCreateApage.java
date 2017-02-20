package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.CreateApage;
import pages.HomePage;
import pages.SignUpPage;

public class VerifyCreateApage {
	
	
	static WebDriver driver;
	
	@BeforeMethod()
	public void setUp()
	{
	
    driver= BrowserFactory.getBrowser("Firefox");
    //below return url
	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test
	public void createTestPage()
	{
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		String title=home.getApplicationTitle();
		System.out.println("My Application title is"+title);
		
		Assert.assertEquals(title, title);
		System.out.println("Validation is Passed");
	CreateApage login =PageFactory.initElements(driver, CreateApage.class);
		            login.CreataPage();
	}
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
		//BrowserFactory.closeBrowser(driver);
	}
}
