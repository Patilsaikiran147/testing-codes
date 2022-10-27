package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frams {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[1]/a/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
        Thread.sleep(5000);
		

	}

}
