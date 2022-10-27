package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgEx4
{
	@Test(invocationCount=1)
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("tulasidevi");
		driver.findElement(By.id("password")).sendKeys("tulasidevi");
		driver.findElement(By.className("login_button")).click();
		Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed(),"Login failed");
		System.out.println("Login Successfull");
		driver.close();
		
		
	}

}
