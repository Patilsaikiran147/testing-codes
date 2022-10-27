package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2");
		System.out.println(driver.getTitle());
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("tuuuulaaa");
		String x = un.getAttribute("value");
		System.out.println("my nickname is:"+x);

	}

}
