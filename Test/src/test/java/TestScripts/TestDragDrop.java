package TestScripts;



import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;
import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class TestDragDrop extends Basictestcap{
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver=capabilities("Real");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
	AndroidElement source = driver.findElementsByClassName("android.view.View").get(0);
//	AndroidElement source = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']");
//	AndroidElement Destination = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_2']");
	AndroidElement Destination = driver.findElementsByClassName("android.view.View").get(1);
	TouchActions touch = new TouchActions(driver);
//	 touch.dragAndDrop(first, second);
	touch.longPress((WebElement) longPressOptions())
	touch.longPress((WebElement) longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveToElement((WebElement) element(Destination)).release().perform();
//	String act = driver.findElement(By.xpath("//android.widget.TextView[@text='Dropped!']")).getText();
//	assertEquals(act,"Dropped!");
	touch.longPress((WebElement)element(source)).moveToElement(Destination).release().perform();
//	touch.dragAndDropBy(source, 10, 0);
	}	
  
}
