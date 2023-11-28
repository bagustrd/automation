package org.maxxitani.mttapp.foapp.PageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	AndroidDriver driver;

	public LoginPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permissionLocation;


	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Button")
	private WebElement loginButton;


	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private WebElement account;


	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permissionCamera;

	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profile;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[13]")
	private WebElement email;

	public void permissionLocation()
	{
		permissionLocation.click();
	}

	public void loginbutton()
	{
		loginButton.click();
	}

	public void account()
	{
		account.click();
	}

	public void permissionCamera()
	{
		permissionCamera.click();
	}

	public void profile()
	{
		profile.click();
	}
	public void email()
	{
		email.getText();

	}


}


