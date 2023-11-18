package org.maxxitani.mttapp.foapp.testcases.area;

import org.maxxitani.mttapp.foapp.PageObjects.android.AreaPage;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class areaList extends MainConfig {

    @Test(dataProvider = "getData")
    public void validateListData(String expectedData) throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        AreaPage areaPage = new AreaPage(driver);

        // Login to the app
        loginPage.permissionLoc();
        loginPage.loginbutton();
        loginPage.account();
        loginPage.permissionCam();

        // Navigate to the farmer page
        areaPage.buttonArea();

        List<WebElement> listElements = areaPage.listArea();

        if (listElements != null && listElements.size() > 0) {
            System.out.println("List size: " + listElements.size());

            boolean foundExpectedData = false;
            for (WebElement listElement : listElements) {
                String listText = listElement.getText();
                System.out.println("List Text: " + listText);
                if (listText.contains(expectedData)) {
                    foundExpectedData = true;
                    break;
                }
            }

            System.out.println("Found expected data: " + foundExpectedData);

            Assert.assertTrue(foundExpectedData, "Expected data not found in the list.");
        } else {
            System.out.println("List is null or empty. Please check the implementation of farmerPage.listFarmer().");
        }

        scrollToLoadMore();

        Thread.sleep(3000);
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        String expectedData = "DKH-1-52451-0004";
        return new Object[][]{
                {expectedData}
        };
    }

    private void scrollToLoadMore() {

    }
}




