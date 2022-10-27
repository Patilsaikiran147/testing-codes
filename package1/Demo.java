package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		  
		  driver.manage().window().maximize();
	
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('username').value='moulali';");
		  js.executeScript("document.getElementById('password').value='moulal12345';");
	
		  

	}

}
