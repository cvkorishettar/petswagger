package com.apiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class home_Page {
	public AndroidDriver<AndroidElement> driver;
	public long ETO = 15;

	public home_Page(AndroidDriver<AndroidElement> driver, long ETO) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.ETO = ETO;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	private AndroidElement viewOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Access'ibility']")
	private AndroidElement AccebilityOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Accessibility']")
	private AndroidElement AccessibilityOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Animationews']")
	private AndroidElement AnimationewsOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App']")
	private AndroidElement appOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Content']")
	private AndroidElement contentOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OS']")
	private AndroidElement osOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
	private AndroidElement preferenceOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Media']")
	private AndroidElement mediaOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NFC']")
	private AndroidElement NFCOption;  	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Graphics']")
	private AndroidElement graphicsOption;
	
	public void clickOnViews() {
		viewOption.click();
	}
	
}
