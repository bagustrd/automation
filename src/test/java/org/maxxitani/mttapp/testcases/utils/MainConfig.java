package org.maxxitani.mttapp.testcases.utils;

import org.maxxitani.mttapp.utils.AppiumUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainConfig extends AppiumUtils {
	
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws IOException
	{
		File appiumJS = new File("C:\\Users\\bagus\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");

		if (!appiumJS.exists()) {
			throw new IOException("C:\\Users\\bagus\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		}

		service = new AppiumServiceBuilder()
				.withAppiumJS(appiumJS)
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.build();

		try {
			service.start();
			Thread.sleep(21000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "samsung SM-X205");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", "C:\\Automation\\src\\test\\java\\resources\\app.apk");
		capabilities.setCapability("automationName", "UIAutomator2");

		driver = new AndroidDriver(service.getUrl(), capabilities);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}
	@Override
	public void waitForElementToAppear(WebElement ele, AppiumDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
