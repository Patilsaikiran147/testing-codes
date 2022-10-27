package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderex {
	@Test(dataProvider="Login")
	public void Login(String un,String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is successful", true);
		driver.close();
		
		
	}
	@DataProvider(name="Login")
	public Object[][] logindata()
	{
		Object data[][]= {{"tulasidevi","tulasidevi"},{"anushagorala","Anusha@123"},{"saikiran147","Ojas123!"}};
				return data;
	}

}
