package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoHomePage 

{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement SignInTab;
	
	
	public NeostoHomePage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	public void ClickedONSignInTab()
	{
		SignInTab.click();
	}

}
