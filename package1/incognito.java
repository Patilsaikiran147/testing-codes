package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incognito {
	public static void main(String[] args) {
	
		ChromeOptions o= new ChromeOptions();
    
   o.addArguments("--incognito");
    
   WebDriver driver = new ChromeDriver(o);
   
   driver.get("https://www.tutorialspoint.com/index.htm ");

}
}