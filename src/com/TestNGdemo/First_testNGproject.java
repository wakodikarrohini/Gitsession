package com.TestNGdemo;

import org.testng.annotations.Test;

import com.Listener.Mylistner;
import com.config.Config;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Mylistner.class)
public class First_testNGproject  extends Config{
	//static RemoteWebDriver driver;

	/*@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}*/

	@Test
	public  static void m1() {
		//WebDriverManager.chromedriver().setup();
		//RemoteWebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://ijmeet.com/register");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("rohini");
		AssertJUnit.assertEquals("hi", "hello");
	}

	//@AfterMethod
	//public static void Teardown() {
	//	driver.close();
		
	//}
	
  /* @Test
	public static void m2() {

		driver.get("https://testingshastra.com/");
	}
   

   @AfterMethod
	public static void Teardown() {
	   driver.close();
		
	}*/

}
