package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateApage {

	WebDriver driver;
	public CreateApage(WebDriver ldriver){
	
		this.driver =ldriver;
}
	@FindBy(id="reg_pages_msg") WebElement creatPage;
	//@FindBy(xpath=".//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a") WebElement signup;

public void CreataPage()
{
	creatPage.click();
	//signup.click();
	
}

}