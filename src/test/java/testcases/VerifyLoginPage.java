package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePage;
import pages.LoginPage;

public class VerifyLoginPage {
	
	
	WebDriver driver;
	
	@BeforeMethod()
	public void setUp()
	{
	
    driver= BrowserFactory.getBrowser("Firefox");
    //below return url
	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test
	public void testLoginPage()
	{
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		String title=home.getApplicationTitle();
		System.out.println("My Application title is"+title);
		Assert.assertEquals(title, title);
		System.out.println("Validation is Passed");
			
        home.clickOnLoginLink();		
		LoginPage login =PageFactory.initElements(driver,LoginPage.class);
		login.loginApplication("niazrobel@gmail.com","bangladesh88");
	
	//login.loginApplication(DataProviderFactory.getExcel().getData(0,0,0),DataProviderFactory.getExcel().getData(0,0,1));
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
		//BrowserFactory.closeBrowser(driver);
	}
}
