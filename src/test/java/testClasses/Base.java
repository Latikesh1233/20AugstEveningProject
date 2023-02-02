package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static void main(String[] args) {
	
	    WebDriver driver;
	
	//public void LaunchingAppl()
	//{
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLatikesh\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://neostox.com/");
	//}
	}

}
