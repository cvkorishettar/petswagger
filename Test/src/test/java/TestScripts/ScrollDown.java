package TestScripts;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class ScrollDown extends Basictestcap{
 public static void main(String[] args) throws MalformedURLException {
	 AndroidDriver<AndroidElement> driver=capabilities("Emulator");
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
//	    TouchActions touch = new TouchActions(driver);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	 driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();
//	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click();
// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"WebView\").instance(0))"));
	 TouchActions touch = new TouchActions(driver);
//	 driver.findElementByClassName("android.widget.EditText").clear();
//	 touch.click(driver.findElementByClassName("android.widget.EditText"))
//	 textField.sendKeys("Test");
	 
	 
//	  AndroidElement linkClick = driver.findElement(By.xpath("//android.widget.TextView[@text='i am a link']"));
//	  touch.click(linkClick).perform();
	  driver.findElementByLinkText("i am a link").click();
	 String text = driver.findElement(By.xpath("//android.widget.TextView[@text='I am some other page content']")).getText();
	 Assert.assertEquals("I am some other page content", text);
}
}
