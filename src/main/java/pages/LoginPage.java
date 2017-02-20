package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
 
	WebDriver driver;
	
	public LoginPage( WebDriver ldriver)
	{
	this.driver=ldriver;
		
	}
	@FindBy(xpath=".//*[@id='email']")WebElement UserID;
	@FindBy(xpath=".//*[@id='pass']")WebElement password;
	@FindBy(xpath=".//*[@id='loginbutton']")WebElement logIn;
	
	By FindFriends =By.xpath(".//*[@id='findFriendsNav']");
	
	
	public void loginApplication(String user,String pass)
	{
    UserID.sendKeys(user);
	password.sendKeys(pass);
	logIn.click();
	}
	
	public void verifySignOutLink()
	{
		
		WebDriverWait  wait =new WebDriverWait(driver,20);
	WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(FindFriends));
	String test=ele.getText();
	Assert.assertEquals(test,"FindFriends");

	}
}
