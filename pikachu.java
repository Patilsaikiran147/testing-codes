import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pikachu {


public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://frontdesk.corp.ojas-it.com");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("Ojas1525");
driver.findElement(By.name("btn_login")).click();
driver.findElement(By.linkText("Add Candidate")).click();
driver.findElement(By.id("validate_email")).sendKeys("saikiranpatil22@gmail.com");
driver.findElement(By.id("email_verify")).click();
driver.switchTo().alert().accept();
driver.findElement(By.name("mobile")).sendKeys("9550933671");
//Thread.sleep(1000);
//driver.switchTo().alert().accept();
//driver.findElement(By.id("otp")).sendKeys("9966");
//Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='validate_otp']")).click();	
driver.findElement(By.xpath("//input[@name='candidate_name']")).sendKeys("ojassboy");

Select techn=new Select(driver.findElement(By.name("technology")));
techn.selectByVisibleText("AUTOMATION TESTING");
Select exp=new Select(driver.findElement(By.name("experience")));
exp.selectByIndex(7);
Select floor=new Select(driver.findElement(By.id("floor")));
floor.selectByIndex(2);
Select scheduled=new Select(driver.findElement(By.name("schdule_name")));
scheduled.selectByIndex(5);
Select vehicle=new Select(driver.findElement(By.id("vehical")));
vehicle.selectByIndex(1);
driver.findElement(By.id("vehical_number")).sendKeys("41674521468");
driver.findElement(By.id("location")).sendKeys("hyderabad");
Select idtype=new Select(driver.findElement(By.id("id_type")));
idtype.selectByIndex(1);
driver.findElement(By.name("id_number")).sendKeys("215478965478");
driver.findElement(By.name("save_candidate")).click();
driver.findElement(By.linkText("Add Visitor")).click();
driver.findElement(By.name("email")).sendKeys("sai@gmail.com");
driver.findElement(By.id("email_verify")).click();
driver.switchTo().alert().accept();
driver.findElement(By.id("otpmobile")).sendKeys("9550933671");
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.findElement(By.id("otp")).sendKeys("9966");
driver.findElement(By.name("validate_otp")).click();
driver.findElement(By.name("visitor_name")).sendKeys("vicky");
driver.findElement(By.name("visitor_location")).sendKeys("hyderabad");
driver.findElement(By.id("purpose")).sendKeys("joining");
Select dept=new Select(driver.findElement(By.id("department")));
dept.selectByIndex(2);
Thread.sleep(2000);
Select meet=new Select(driver.findElement(By.name("meeting_person")));
meet.selectByIndex(2);
Select floor1=new Select(driver.findElement(By.id("floor")));
floor1.selectByIndex(2);
Select laptop=new Select(driver.findElement(By.name("laptop_make")));
laptop.selectByIndex(1);
Select vehicle1=new Select(driver.findElement(By.id("vehical")));
vehicle1.selectByIndex(1);
driver.findElement(By.name("vehical_number")).sendKeys("2145698765");
Thread.sleep(2000);
Select proof=new Select(driver.findElement(By.id("id_type")));
proof.selectByIndex(2);
driver.findElement(By.id("id_number")).sendKeys("365487168942");
driver.findElement(By.name("save_visitor")).click();
driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Add Vendor")).click();
driver.findElement(By.name("email")).sendKeys("phaniraj@gmail.com");
driver.findElement(By.id("email_verify")).click();
driver.switchTo().alert().accept();
driver.findElement(By.id("otpmobile")).sendKeys("8897614732");
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.findElement(By.id("otp")).sendKeys("9966");
driver.findElement(By.name("validate_otp")).click();
Select vendor=new Select(driver.findElement(By.name("selectvendortype")));
vendor.selectByIndex(2);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='vendor_name']")).sendKeys("praveen");
driver.findElement(By.id("delivery_date")).sendKeys("21/03/2022");
driver.findElement(By.name("dc_no")).sendKeys("3658749257");
driver.findElement(By.name("invoice_number")).sendKeys("1234566328745");
Select dept1=new Select(driver.findElement(By.name("department")));
dept1.selectByIndex(2);
Select receiver=new Select(driver.findElement(By.name("receiver")));
receiver.selectByIndex(0);
Select purchase=new Select(driver.findElement(By.name("pc_from")));
purchase.selectByIndex(1);
Select Vehicle2=new Select(driver.findElement(By.id("vehical_type")));
Vehicle2.selectByIndex(1);
Select proof2=new Select(driver.findElement(By.id("id_type")));
proof2.selectByIndex(2);
Select tab=new Select(driver.findElement(By.name("new_laptop_make")));
tab.selectByIndex(1);
driver.findElement(By.name("save_new_vendor")).click();
Select userlist=new Select(driver.findElement(By.linkText("User List")));
userlist.selectByIndex(0);
}




	}


