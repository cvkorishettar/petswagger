package TestScripts;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class FetchTostMessage extends Basictestcap{
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	AndroidDriver<AndroidElement> driver = capabilities("Emulator");
	driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Alarm']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Alarm Controller']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@text='ONE SHOT ALARM']")).click();
	String Toast1 = driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
	System.out.println(Toast1);
	Assert.assertEquals("One-shot alarm will go off in 30 seconds based on the real time clock. Try changing the current time before then!", Toast1);
	Thread.sleep(5);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Start Repeating Alarm']")).click();
	String Toast2 = driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
	System.out.println(Toast2);
	Assert.assertEquals("Repeating alarm will go off in 15 seconds and every 15 seconds after based on the elapsed realtime clock", Toast2);
	Thread.sleep(5);
	driver.findElement(By.xpath("//android.widget.Button[@text='STOP REPEATING ALARM']")).click();
	String Toast3 = driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
	System.out.println(Toast3);  
	Assert.assertEquals("Repeating alarm has been unscheduled", Toast3);
}
}
