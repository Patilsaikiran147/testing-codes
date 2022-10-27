package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgEx {
	public static WebDriver driver;
	@Test(description="Verifying login functionality",priority=2)
	public void Login1()
	{
		driver.findElement(By.name("username")).sendKeys("tulasidevi");
		driver.findElement(By.id("password")).sendKeys("tulasidevi");
		driver.findElement(By.name("login")).click();
	}
	@Test(description="Verifying login functionality",priority=1)
	public void Login2()
	{
		driver.findElement(By.name("username")).sendKeys("anushagorala");
		driver.findElement(By.id("password")).sendKeys("Anusha@123");
		driver.findElement(By.name("login")).click();
	}
	
	@BeforeSuite
	public void OpenBrowser()
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
    @BeforeMethod
    public void Launchapp()
    {
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
     }
    @AfterMethod
    public void Logout()
    {
    	driver.findElement(By.linkText("Logout")).click();
    }
    @AfterSuite
    public void CloseBrowser() {
    	driver.close();
    	}
}
