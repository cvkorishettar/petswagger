package TestScripts;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DeviceBrowser extends Basictestcap {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities("Emulator");
		driver.get("https://www.google.com/");
		
		
	}

}
