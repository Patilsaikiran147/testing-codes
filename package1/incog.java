package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incog {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, op);
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.amazon.com/");
		

	}

}
