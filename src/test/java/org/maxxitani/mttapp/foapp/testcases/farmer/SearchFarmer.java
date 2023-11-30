package org.maxxitani.mttapp.foapp.testcases.farmer;

import io.appium.java_client.AppiumBy;
import org.maxxitani.mttapp.foapp.PageObjects.android.FarmerPage;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class SearchFarmer extends MainConfig {

    @Test(dataProvider = "getData")
    public void successSearhFarmerName(HashMap <String,String>input) throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        FarmerPage farmerPage = new FarmerPage(driver);

        //Login to the App
        loginPage.permissionLocation();
        loginPage.loginbutton();
        loginPage.account();
        loginPage.permissionCamera();

        // Navigate to the farmer page
        farmerPage.buttonFarmer();

        // Validate Farmer Name
        farmerPage.buttonSearchFarmer();
        farmerPage.fieldSearch();
        farmerPage.fillinFieldSearch(input.get("NameFarmer"));
        farmerPage.tapEnterSearch();

        //Add wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        String farmerNameXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(farmerNameXPath)));
        String validatedFarmerName = driver.findElement(AppiumBy.xpath(farmerNameXPath)).getText();

        // Assert with a meaningful message
        AssertJUnit.assertEquals("Actual and expected names do not match", "Paul Smith", validatedFarmerName);

        // If the assertion passes, print a success message
        System.out.println("Nama petani ditemukan!");

        tearDown();

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = getjsonData("C:\\Automation\\src\\test\\java\\org\\maxxitani\\mttapp\\testcases\\testData\\DataPetani001.json");
        return new Object[][] { {data.get(0)}};
    }

}
