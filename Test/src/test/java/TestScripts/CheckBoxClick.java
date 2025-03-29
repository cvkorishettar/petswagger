package TestScripts;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CheckBoxClick extends Basictestcap {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("Emulator");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Preferences from XML']")).click(); 
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		AndroidElement disCheckBox = driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[3]"));
//		System.out.println("Before selection of 2nd check box"+disCheckBox.isEnabled());
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[2]")).click();
//		System.out.println("After selection of 2nd check box"+disCheckBox.isEnabled());
		driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[3]")).click();
	}

}
