package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class page {
	WebDriver driver;
    @BeforeMethod
    public void setup() {
      //  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe") ;
        //WebDriver driver=new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://frontdesk.corp.ojas-it.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
    
    }
    @Test
    public void login() {
        Login_factory login=PageFactory.initElements(driver, Login_factory.class);
        login.verifylogin("Admin", "1234");
        
    }
    @Test
    public void maintainance() throws Exception  {
        AddVendorPage vendor=PageFactory.initElements(driver, AddVendorPage.class);
        vendor.verifyaddvendor("sanjukta@gmail.com", "998866", "1234567890","9966", "amazon", "sanjukta", "lenovo", "dell",  "good");
    }
    @AfterMethod
    public void teardown() throws Exception {
        LogoutPage logout=PageFactory.initElements(driver, LogoutPage.class);
        logout.verifylogout();
        
        
        
        
    }

}
