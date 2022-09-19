package org.testCases;

import org.commonFunctions.CommonFunctionalities;
import org.openqa.selenium.support.PageFactory;
import org.pageObjects.HomePage_PageObjects;
import org.testng.annotations.Test;

public class Test_SignIn extends CommonFunctionalities{

	
	@Test
	public void VerifySignIn() throws InterruptedException {
		// TODO Auto-generated method stub
		
		PageFactory.initElements(driver, HomePage_PageObjects.class);
		HomePage_PageObjects.SignIn.click();
		Thread.sleep(2000);
		HomePage_PageObjects.CustomerID.sendKeys(properties.getProperty("username"));
		HomePage_PageObjects.Password.sendKeys(properties.getProperty("password"));
		HomePage_PageObjects.CustomerSignin.click();
		
	}
	
	
	
	
}
