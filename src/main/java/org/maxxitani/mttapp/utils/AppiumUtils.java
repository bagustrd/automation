package org.maxxitani.mttapp.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.AppiumDriver;

public abstract class AppiumUtils {
	
	public List<HashMap<String, String>> getjsonData(String jsonFilePath) throws IOException {
		
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
			
		});
		
		return data;
	}
		
	public abstract void waitForElementToAppear(WebElement ele,AppiumDriver driver);
	
	
	
	public void getScreenshot(String testCaseName, AppiumDriver driver)
	{
		//File source = driver.getScreenshotAs(OutputType.FILE);
		//String destinationFile = testCaseName + ".png";
		//FileUtils.copyFile(null, null);
	}
}
