package com.apiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class annimationPage {
	public AndroidDriver<AndroidElement> driver;
	public long ETO = 15;

	public annimationPage(AndroidDriver<AndroidElement> driver, long ETO) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.ETO = ETO;
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Animation']")
	private AndroidElement animationOption;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='3D Transition']")
	private AndroidElement threeDAnimation;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lyon']")
	private AndroidElement lyon;  	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interpolators']")
	private AndroidElement interpolators;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='io.appium.android.apis:id/spinner']")
	private AndroidElement dropDownAnimation;
	
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Anticipate']")
	private AndroidElement anticipate;
	
	public void clickOn3DAnimations() {
		animationOption.click();
		threeDAnimation.click();
		lyon.click();
	}
	public void clickOnInterpoltorsAnimations() {
		animationOption.click();
		interpolators.click();
		dropDownAnimation.click();
		anticipate.click();
	}

}
