package TestScripts;

import java.time.Duration;

import org.apache.bcel.generic.Select;

import HelpersPackage.ReusableMethods;
import PageObjects.LoginpageObjects;
import PageObjects.SearchHotelpageObjects;
import PageObjects.SelectHotelPageObjects;

public class SearchaHotel extends ReusableMethods
{

	public static void main(String[] args) 
	{
		
		LoginpageObjects login=new LoginpageObjects();
		SearchHotelpageObjects search=new SearchHotelpageObjects();
		SelectHotelPageObjects SelectHotel=new SelectHotelPageObjects();
		Launchapp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(login.UsernameTextBox).sendKeys("tulasidevi");
		driver.findElement(login.PwdTextBox).sendKeys("tulasidevi");
		driver.findElement(login.loginButton).click();
//		Select location=new Select(driver.findElement(search.LocationListBox));
//		location.selectByIndex(3);
//		Select noofrooms=new Select(driver.findElement(search.noofroomsListBox));
//		noofrooms.selectByIndex(2);
//		driver.findElement(search.CheckIndateTextBox).clear();
//		driver.findElement(search.CheckIndateTextBox).sendKeys("14/06/2021");
//		driver.findElement(search.CheckOutDateTextBox).clear();
//		driver.findElement(search.CheckOutDateTextBox).sendKeys("16/06/2021");
//		Select adult=new Select(driver.findElement(search.AdultsperroomListBox));
//		adult.selectByIndex(2);
//		driver.findElement(search.SearchButton).click();
//		driver.findElement(SelectHotel.LogutLink).click();
//		CloseBrowser();

	}

}
