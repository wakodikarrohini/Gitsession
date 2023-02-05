package com.Listener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.config.Config;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Mylistner implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		

		AShot ashot=new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		BufferedImage image= ashot.takeScreenshot(Config.driver).getImage();
		try {
			ImageIO.write(image, "JPG", new File("failed1.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


}

