package TestScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class IconScreen extends Basictestcap {
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	 AndroidDriver<AndroidElement> driver=capabilities("Emulator");
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Grid']")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@text='1. Icon Grid']")).click();
//	 driver.findElementsByClassName("android.widget.TextView").get(1);   
	 driver.findElementsByClassName("android.widget.ImageView").get(12).click();
	 Thread.sleep(4000);
}
}
