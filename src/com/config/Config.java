package com.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {

	public static RemoteWebDriver driver=null;

	
	@Parameters("browser-name")
	@BeforeMethod //before every test case it will open  a browser
	public void setUp(@Optional String browserName) throws Exception   {
		if(browserName==null) {
			
			browserName="Chrome";
		}
		// open specified browser
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("Launching chrome");
		}
		else if(browserName.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("Launching Edge");
			}
	}
	//@AfterMethod
	//public void tearDown() throws Exception{
	//	driver.close();
	//}
}
