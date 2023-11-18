package org.maxxitani.mttapp.foapp.testcases.farmer;

import org.maxxitani.mttapp.foapp.PageObjects.android.FarmerPage;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class farmerList extends MainConfig {

    @Test(dataProvider = "getData")
    public void validateListData(String expectedData) throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        FarmerPage farmerPage = new FarmerPage(driver);

        // Login to the app
        loginPage.permissionLoc();
        loginPage.loginbutton();
        loginPage.account();
        loginPage.permissionCam();

        // Navigate to the farmer page
        farmerPage.buttonFarmer();

        List<WebElement> listElements = farmerPage.listFarmer();

        if (listElements != null && listElements.size() > 0) {
            System.out.println("List size: " + listElements.size());

            boolean foundExpectedData = false;
            for (WebElement listElement : listElements) {
                String listText = listElement.getAttribute("text");
                System.out.println("List Text: " + listText);

                if (listText != null && listText.contains(expectedData)) {
                    foundExpectedData = true;
                    break;
                }
            }

            System.out.println("Found expected data: " + foundExpectedData);

            // Print the expected data for debugging
            System.out.println("Expected Data: " + expectedData);

            Assert.assertTrue(foundExpectedData, "Expected data not found in the list.");
        } else {
            System.out.println("List is null or empty. Please check the implementation of farmerPage.listArea().");
        }

        scrollToLoadMore();

        Thread.sleep(3000);
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        String expectedData = "Bowi";
        return new Object[][]{
                {expectedData}
        };
    }

    private void scrollToLoadMore() {
        // Implement scrolling logic here
    }
}
