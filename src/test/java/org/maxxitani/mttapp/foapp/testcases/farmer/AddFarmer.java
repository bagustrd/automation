package org.maxxitani.mttapp.foapp.testcases.farmer;

import org.maxxitani.mttapp.foapp.PageObjects.android.FarmerPage;
import org.maxxitani.mttapp.foapp.PageObjects.android.LoginPage;
import org.maxxitani.mttapp.testcases.utils.MainConfig;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AddFarmer extends MainConfig {

    @Test
    public void successCreateNewFarmer() throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        FarmerPage farmerPage = new FarmerPage(driver);

        // Login to the app
        loginPage.permissionLocation();
        loginPage.loginbutton();
        loginPage.account();
        loginPage.permissionCamera();

        // Navigate to the farmer page
        farmerPage.buttonFarmer();
        farmerPage.addFarmer();
        farmerPage.selectMitra();
        farmerPage.mitra();

        // Generate random data
        String randomName = farmerPage.generateRandomName();
        String randomPhoneNumber = farmerPage.generateRandomPhoneNumber();
        String randomAlamat = farmerPage.generateRandomAlamat();
        String randomNoKTP = farmerPage.generateRandomNoKTP();

        // Input the random data
        farmerPage.inputnamefarmer(randomName);
        farmerPage.inputPhoneNumber(randomPhoneNumber);

        // Scroll down after the gender section
        farmerPage.selectGender();
        farmerPage.scrollDown();


        farmerPage.selectprov();
        farmerPage.prov();
        farmerPage.selectKota();
        farmerPage.kota();
        farmerPage.selectKec();
        farmerPage.kec();
        farmerPage.selectKel();
        farmerPage.kel();

        // Input the random address
        farmerPage.inputAlamat(randomAlamat);
        farmerPage.tapNextButton();
        //Add wait
        Thread.sleep(2000);

        farmerPage.scrollUp();
        farmerPage.UploadKTP();
        farmerPage.KTPviaCam();
        farmerPage.permissCam();
        farmerPage.TakeKTP();
        farmerPage.inputNoKTP(randomNoKTP);
        farmerPage.InputRandomBirthDate();
        farmerPage.scrollDown();
        farmerPage.uploadSwafooto();
        farmerPage.SwafotoViaCam();
        farmerPage.takeSwafoto();
        farmerPage.boxAggrement();
        farmerPage.buttonNext();

        //Add wait
        Thread.sleep(2000);
        farmerPage.tapNextButton();
        farmerPage.submitButton();
        farmerPage.submitComfirm();

        boolean isSuccess = farmerPage.isSuccessMessageDisplayed();

        if (isSuccess) {
            System.out.println("Pesan keberhasilan muncul!");
        } else {
            System.out.println("Pesan keberhasilan tidak muncul.");
        }


    }
}
