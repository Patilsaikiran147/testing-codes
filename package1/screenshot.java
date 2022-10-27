package package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // object of Actions class to scroll up and down
	      Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      //identify element on scroll down
	      Thread.sleep(2000);
	      WebElement l = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div[1]/a"));
	      String strn = l.getText();
	      System.out.println("Text obtained by scrolling down is :"+strn);
	      Thread.sleep(2000);
	      at.sendKeys(Keys.PAGE_UP).build().perform();
	      //identify element on scroll up
	      WebElement m = driver.findElement(By.tagName("h4"));
	      String s = m.getText();
	      System.out.println("Text obtained by scrolling up is :"+s);
	      driver.quit();
	   }
	}


