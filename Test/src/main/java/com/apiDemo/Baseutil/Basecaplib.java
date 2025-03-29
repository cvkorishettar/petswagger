package com.apiDemo.Baseutil;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Basecaplib {
	 public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
//	    String sDirPath=System.getProperty("user.dir");
//	    File fs = new File(sDirPath+"/src/test/resources/testapp.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
			
	if(device.equals("Real")) {
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "99A6D6XWE6V4YTWS"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	}else if(device.equals("Emulator")){		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "emulator-5554");
		cap.setCapability(AndroidMobileCapabilityType.AVD_LAUNCH_TIMEOUT, 5);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
//			io.appium.android.apis/io.appium.android.apis.ApiDemos
	}else
		System.out.println("No device Found");	
//		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); 
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap); 
		return driver;
	 }
}
