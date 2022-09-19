package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PageObjects {

	
	@FindBy(id = "btnSignIn")
	public static WebElement SignIn;
	
	
	@FindBy(id="fakeusername")
	public static WebElement CustomerID;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(id="signin")
	public static WebElement CustomerSignin;
	
}
