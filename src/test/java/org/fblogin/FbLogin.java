package org.fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.get("https://adactinhotelapp.com/");
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("hotelbooking@gmail.com");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("12234245");
	
	driver.findElement(By.id("login")).click();
	
	driver.close();
	
	
}
}


