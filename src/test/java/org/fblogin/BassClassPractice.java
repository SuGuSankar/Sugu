package org.fblogin;




import org.openqa.selenium.WebElement;

public class BassClassPractice extends POMClass {
	
	

	public static void main(String[] args)  {
		
		driverSetup();
		
		browserLaunch("https://www.facebook.com/");
		
		POMClass pomClass = new POMClass();
		
		WebElement userName2 = pomClass.getUserName();
	
		sendKeys("sugumar", userName2);
		
		refresh();
		
		sendKeys("raghu", userName2);
	}
}
