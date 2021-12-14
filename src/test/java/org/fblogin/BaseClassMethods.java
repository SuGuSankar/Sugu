package org.fblogin;

import java.awt.AWTException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClassMethods extends BassClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		driverSetup();

		browserLaunch("https://adactinhotelapp.com/index.php");

		WebElement userName = locatorsPath("id", "username");

		sendKeys("SuguMarS", userName);

		WebElement pass = locatorsPath("id", "password");

		sendKeys("Sugu2627Mar", pass);

		WebElement click = locatorsPath("name", "login");

		clickButton(click);

		WebElement locatoins = locatorsPath("name", "location");

		Select s = selectOption(locatoins);

		s.selectByIndex(1);

		WebElement hotels = locatorsPath("id", "hotels");

		Select s1 = selectOption(hotels);

		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement room = locatorsPath("id", "room_type");
		
		Select sRoom = selectOption(room);
		
		sRoom.selectByVisibleText("Deluxe");
		
		WebElement roomCount = locatorsPath("id", "room_nos");
		
		Select sRoomCount = selectOption(roomCount);
		
		sRoomCount.selectByValue("3");
		
		WebElement todayDate = locatorsPath("id", "datepick_in");
		todayDate.clear();
		sendKeys("08/12/2021", todayDate);
		
		WebElement outDate = locatorsPath("id", "datepick_out");
		outDate.clear();
		sendKeys("20/12/2021", outDate);
	
		WebElement adultRoom = locatorsPath("id", "adult_room");
		Select sAdultRoom = selectOption(adultRoom);
		sAdultRoom.selectByValue("2");
		
		WebElement childRoom = locatorsPath("id", "child_room");
		Select sChildRoom = selectOption(childRoom);
		sChildRoom.selectByValue("1");
		
		WebElement submitButton = locatorsPath("id", "Submit");
		submitButton.click();
  
		WebElement cancelButton = locatorsPath("id", "cancel");
		cancelButton.click();
		
		Thread.sleep(5000);
		
		close();
	}

}
