package package1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		        driver.get("https://mahantesh-hadimani.blogspot.com/2019/09/how-to-check-element-in-enabled-or-not.html");
		        
		        List<WebElement> text = driver.findElements(By.tagName("b"));
		        for (WebElement webElement : text) {
					System.out.println(webElement.getText());
				}
		        	
}}
