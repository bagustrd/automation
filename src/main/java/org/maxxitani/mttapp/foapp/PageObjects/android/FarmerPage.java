package org.maxxitani.mttapp.foapp.PageObjects.android;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class FarmerPage {
    AndroidDriver driver;

    public FarmerPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup")
    private WebElement buttonFarmer;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView\n")
    private WebElement listFarmer;

    //Create New Farmer
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private WebElement addFarmer;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    private WebElement selectMitra;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement mitra;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")
    private WebElement inputnamefarmer;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")
    private WebElement inputPhoneNumber;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")
    private WebElement selectGender;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    private WebElement selectprov;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView")
    private WebElement prov;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
    private WebElement selectKota;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
    private WebElement kota;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    private WebElement selectKec;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView")
    private WebElement kec;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
    private WebElement selectKel;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
    private WebElement kel;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")
    private WebElement inputAlamat;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    private WebElement next1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement UploadKTP;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement KTPviaCam;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement permissCam;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
    private WebElement takeKTP;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.EditText")
    private WebElement inputNoKTP;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement uploadSwafoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement SwafotoViaCam;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
    private WebElement takeSwafoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement boxAggrement;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    private WebElement nextPreview;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
    private WebElement saveButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private  WebElement submitcomfirm;

    public void buttonFarmer() {
        buttonFarmer.click();
    }

    public List<WebElement> listFarmer() {
        listFarmer.getText();
        return null;
    }

    public void addFarmer() {
        addFarmer.click();
    }

    public void selectMitra() {
        selectMitra.click();
    }

    public void mitra() {
        mitra.click();
    }

    public void inputnamefarmer(String name) {
        inputnamefarmer.sendKeys(name);
    }

    public void inputPhoneNumber(String phoneNumber) {
        inputPhoneNumber.sendKeys(phoneNumber);
    }

    public void selectGender() {
        selectGender.click();
    }


    public void selectprov() {
        selectprov.click();
    }

    public void prov() {
        prov.click();
    }

    public void selectKota() {
        selectKota.click();
    }

    public void kota() {
        kota.click();
    }

    public void selectKec() {
        selectKec.click();
    }

    public void kec() {
        kec.click();
    }

    public void selectKel() {
        selectKel.click();
    }

    public void kel() {
        kel.click();
    }

    public void inputAlamat(String address) {
        inputAlamat.sendKeys(address);
    }

    public void next1() {
        next1.click();
    }

    public void UploadKTP(){
        UploadKTP.click();
    }

    public void KTPviaCam(){
        KTPviaCam.click();
    }

    public void permissCam() {
        permissCam.click();
    }

    public void TakeKTP() {
        takeKTP.click();
    }

    public void inputNoKTP(String NoKTP) {
        inputNoKTP.sendKeys(NoKTP);
    }

    public void uploadSwafooto(){
        uploadSwafoto.click();
    }

    public void SwafotoViaCam(){
        SwafotoViaCam.click();
    }

    public void takeSwafoto(){
        takeSwafoto.click();
    }

    public void boxAggrement() {
        boxAggrement.click();
    }

    public void nextPreview(){
        nextPreview.click();
    }

    public void saveFarmer() {
        saveButton.click();
    }

    public void submitcomfirm() {
        submitcomfirm.click();
    }

    public List<WebElement> findListElements() {
        return driver.findElements(By.xpath("//android.widget.ScrollView/android.view.ViewGroup//android.widget.TextView"));
    }


    public void loopThroughAndPrintTextFromListElements() {
        List<WebElement> listElements = findListElements();

        for (WebElement element : listElements) {
            String text = element.getText();
            System.out.println("Text: " + text);
        }
    }

    public String generateRandomName() {
        String[] firstNames = {"John", "Jane", "Bob", "Alice", "Michael", "Paul"};
        String[] lastNames = {"Smith", "Johnson", "Doe", "Brown", "Williams", "Logan"};

        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        String generatedName = firstName + " " + lastName;

        System.out.println("Generated Farmer Name: " + generatedName);
        searchAndValidateFarmer(generatedName);

        return generatedName;
    }


    public String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();

        phoneNumber.append(String.format("%03d", random.nextInt(1000)));
        phoneNumber.append(String.format("%03d", random.nextInt(1000)));
        phoneNumber.append(String.format("%04d", random.nextInt(10000)));

        return phoneNumber.toString();
    }

    public String generateRandomAlamat() {
        String[] streets = {"Jalan Raya", "Jalan Baru", "Jalan Utama", "Jalan Indah", "Jalan Jalan", "Jalan Baru Jadian", "Jalan Buntu"};

        Random random = new Random();
        String street = streets[random.nextInt(streets.length)];

        return street;
    }

    public String generateRandomNoKTP() {
        Random random = new Random();
        StringBuilder NoKTP = new StringBuilder();

        NoKTP.append(String.format("%05d", random.nextInt(1000)));
        NoKTP.append(String.format("%05d", random.nextInt(1000)));
        NoKTP.append(String.format("%06d", random.nextInt(10000)));

        return NoKTP.toString();
    }

    public void InputRandomBirthDate() {
        WebElement birthdateField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup/android.widget.EditText"));
        birthdateField.click();

        scrollToElement("month", driver.findElement(By.id("com.maxxitani.fieldofficer.staging:id/month")));
        scrollToElement("date", driver.findElement(By.id("com.maxxitani.fieldofficer.staging:id/date")));
        scrollToElement("year", driver.findElement(By.id("com.maxxitani.fieldofficer.staging:id/year")));

        WebElement saveButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView"));
        saveButton.click();

        (new TouchAction(driver))
                .press(PointOption.point(1030, 962))
                .moveTo(PointOption.point(1046, 339))
                .release()
                .perform();
    }

    private void scrollToElement(String elementType, WebElement element) {
        int startX = getRandomCoordinate(500, 1000);
        int startY = getRandomCoordinate(500, 1000);
        int endX = getRandomCoordinate(500, 1000);
        int endY = getRandomCoordinate(500, 1000);

        if (elementType.equals("month") || elementType.equals("date") || elementType.equals("year")) {
            TouchAction<?> action = new TouchAction<>(driver);
            action.press(PointOption.point(startX, startY))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }
    }

    private int getRandomCoordinate(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    public void scrollDown() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.8);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void scrollUp() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.2);
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.8);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void searchAndValidateFarmer(String farmerName) {
        // Perform a search using the provided farmer name
        WebElement searchFarmer = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.EditText"));
        searchFarmer.click();

        // Click the search button
        WebElement searchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
        searchField.sendKeys(farmerName);

        // Wait for search results or validate directly
        WebElement searchResult = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]"));
        String displayedName = searchResult.getText();

        if (displayedName.equals(farmerName)) {
            System.out.println("Farmer successfully registered and found in search results.");
        } else {
            System.out.println("Farmer registration validation failed.");
        }

        // Optionally, you can clear the search field after validation
        searchField.clear();
    }


}