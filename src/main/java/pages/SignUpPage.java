package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
 WebDriver driver;
 
 public SignUpPage( WebDriver ldriver)
	{
	this.driver=ldriver;
		
	}
	@FindBy(name="firstname")WebElement firstName;
	@FindBy(name="lastname")WebElement lastName;
	@FindBy(name="reg_email__") WebElement emailAddress;
	/*@FindBy(xpath=".//*[@id='u_0_9']") WebElement reEnterEmailAdress;
    @FindBy(xpath=".//*[@id='u_0_c']") WebElement newPassword;
   // @FindBy(xpath=".//*[@id='birthday-help']")WebElement helpforBirthdat;
	//@FindBy(xpath=".//*[@id='u_0_o']")WebElement male;*/
	
	@FindBy(name="websubmit") WebElement createAccount;
	
	
	
	public void SignUpApplication()
	{
 firstName.sendKeys("niaz");
 lastName.sendKeys("robel");
 emailAddress.sendKeys("mdrobelqa@gmail.com");
 /*reEnterEmailAdress.sendKeys("mdrobelqa@gmail.com");
 newPassword.sendKeys("jobit001");
// helpforBirthdat.click();
// male.click();
*/ createAccount.click();
 
	
	}
}