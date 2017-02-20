package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	
	}
	
	@FindBy(xpath=".//*[@id='u_0_6']") WebElement ForgottenAccountLink;
	@FindBy(id="loginbutton") WebElement loginlink;
	
	
	

	public void clickOnForgottenLink()
	{
		ForgottenAccountLink.click();
		
	
	}
	public void clickOnLoginLink()
	{
     loginlink.click();
     }


	public String getApplicationTitle(){
		return driver.getTitle();
		
}
}