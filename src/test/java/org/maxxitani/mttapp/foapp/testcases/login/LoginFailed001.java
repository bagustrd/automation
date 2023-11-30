package org.maxxitani.mttapp.foapp.testcases.login;

import io.appium.java_client.AppiumBy;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

public class LoginFailed001 extends MainConfig {

    @Test(dataProvider = "getData")
    public void validateAccountNotRegisteredO(String expectedErrorMessage) throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.permissionLocation();
        loginPage.loginbutton();
        loginPage.accountFailed();

        String failedElementXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]";

        WebElement validatedAccountNotRegisterd = driver.findElement(AppiumBy.xpath(failedElementXPath));

        AssertJUnit.assertTrue("Error message should be displayed", validatedAccountNotRegisterd.isDisplayed());
        AssertJUnit.assertEquals("Error message should match", expectedErrorMessage, validatedAccountNotRegisterd.getText());


        tearDown();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = getjsonData("C:\\Automation\\src\\test\\java\\org\\maxxitani\\mttapp\\testcases\\testData\\LoginFailed.json");

        Object[][] testData = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            testData[i][0] = data.get(i).get("errorMessage");
        }

        return testData;
    }

}

