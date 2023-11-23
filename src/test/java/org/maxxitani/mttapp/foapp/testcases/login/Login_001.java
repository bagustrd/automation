package org.maxxitani.mttapp.foapp.testcases.login;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.maxxitani.mttapp.foapp.PageObjects.android.*;
import org.maxxitani.mttapp.testcases.utils.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.maxxitani.mttapp.foapp.testcases.login.*;

public class Login_001 extends MainConfig {
	
	
	
	@Test(dataProvider="getData")
	public void successLoginRH(HashMap <String,String>input) throws MalformedURLException, InterruptedException 
	{
		
		LoginPage loginPage = new LoginPage(driver);
		//loginPage.setuserName(input.get("user"));
		//loginPage.setPassword(input.get("password"));
		loginPage.loginbutton();
		loginPage.profile();
		
		
		Thread.sleep(3000);
		String validate_login = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[4]")).getText();
		String Validate_role = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[5]")).getText();
		
		AssertJUnit.assertEquals(validate_login, "RH test 001");
		AssertJUnit.assertEquals(Validate_role, "Regional Head - 10700-00006");
		
		tearDown();
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getjsonData(System.getProperty("user.dir")+"\\src\\test\\java\\org\\maxxiagri\\maiapp\\testcases\\testData\\LoginRH001.json");
		return new Object[][] { {data.get(0)}};
	}
	
}
  