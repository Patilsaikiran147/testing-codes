package HelpersPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods
{
	public static WebDriver driver;
	public static void Launchapp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
		public static void CloseBrowser() 
		{
			driver.close();
		}

}

