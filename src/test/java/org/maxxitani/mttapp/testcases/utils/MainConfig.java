package org.maxxitani.mttapp.testcases.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;

import org.maxxitani.mttapp.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MainConfig extends AppiumUtils {
	
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, IOException, InterruptedException 
	{
		//Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\org\\maxxiagri\\maiapp\\resources\\data.properties");
		//prop.load(fis);
		//String ipAddress = prop.getProperty("ipAddress");
		//String port = prop.getProperty("port");
		
		//service = startAppiumServer(ipAddress,Integer.parseInt(port));
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\bimo8\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("http://127.0.0.1").usingPort(4723).build();
		service.start(); //need to fix
		Thread.sleep(21000);
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("samsung SM-X205");
		options.setApp("C:\\Users\\bimo8\\eclipse-workspace\\maiapp\\src\\test\\java\\resources\\salesapp.apk");
		
		
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), null);
		driver = new AndroidDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
