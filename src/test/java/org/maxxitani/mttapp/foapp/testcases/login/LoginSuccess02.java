package org.maxxitani.mttapp.foapp.testcases.login;

import io.appium.java_client.AppiumBy;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

public class LoginSuccess02 extends MainConfig {
    @Test(dataProvider = "getData")
    public void successLoginFO(String email) throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.permissionLoc();
        loginPage.loginbutton();
        loginPage.account();
        loginPage.permissionCam();
        loginPage.profile();

        Thread.sleep(3000);

        String emailElementXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[13]";

        String validatedEmail = driver.findElement(AppiumBy.xpath(emailElementXPath)).getText();

        if (!validatedEmail.equals(email)) {
            System.out.println("Email tidak sesuai: " + email);
        }

        AssertJUnit.assertEquals(validatedEmail, email);

        tearDown();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = getjsonData("C:\\Automation\\src\\test\\java\\org\\maxxitani\\mttapp\\testcases\\testData\\LoginFO002.json");

        Object[][] testData = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            testData[i][0] = data.get(i).get("emails");
        }

        return testData;
    }
}
