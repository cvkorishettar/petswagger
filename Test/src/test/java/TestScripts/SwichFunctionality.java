package TestScripts;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwichFunctionality extends Basictestcap{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("Emulator");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='9. Switch']")).click(); 
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='android:id/widget_frame'])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='android:id/widget_frame'])[2]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id='android:id/widget_frame'])[3]")).click();
	}

}
