package org.commonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class CommonFunctionalities {

	
	public static WebDriver driver = null;
	public static Properties properties = null;
	

	public static void Config() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Jasan cross\\eclipse-workspace\\BankingDomain\\src\\test\\resources\\config.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		properties = new Properties();
		properties.load(fileInputStream);
	}
	
	
	@BeforeSuite
	public static void LaunchBrowser() throws IOException {
			Config();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = properties.getProperty("url");
			driver.get(url);
		
		driver.manage().window().maximize();
		

	}
	
@AfterSuite

public void teardown() {
	// TODO Auto-generated method stub

}

}









