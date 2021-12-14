package org.fblogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass extends BassClass {

	public POMClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private  WebElement userName;
	
	@FindBy(id="pass")
	private  WebElement passWorld;
	
	
	
	public   WebElement getUserName() {
		return userName;
	}
	public   WebElement getPassWorld() {
		return passWorld;
	}
	
	
}
