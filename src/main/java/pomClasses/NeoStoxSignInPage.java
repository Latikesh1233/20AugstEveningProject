package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
	@FindBy(id= "MainContent_signinsignup_txt_mobilenumber") private WebElement MobileNmField;
	
	@FindBy(xpath = "(//a[text()='Sign In'])[2]") private WebElement SignIN;
	
	
	public NeoStoxSignInPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}

	public void EnterMoNum()
	{
		MobileNmField.sendKeys("8788751422");
	}
	
	public void ClicedOnSignIN()
	{
		SignIN.click();
	}
}
