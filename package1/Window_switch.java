package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_switch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();		
                		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
        		
        String MainWindow=driver.getWindowHandle();		
        		
			
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("saikiran@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 Thread.sleep(2000);
		
                        driver.close();		
            }		
        }		
       
            driver.switchTo().window(MainWindow);				
    }
}
