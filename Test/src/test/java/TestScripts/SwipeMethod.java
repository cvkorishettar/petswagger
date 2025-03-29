package TestScripts;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeMethod extends Basictestcap{
  public static void main(String[] args) throws InterruptedException, MalformedURLException {
	AndroidDriver<AndroidElement> driver=capabilities("Emulator");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	driver.findElementsByClassName("android.widget.TextView").get(2).click();
	driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	driver.findElement(By.xpath("//*[@content-desc='45']")).click();
	Thread.sleep(5000);
}
}
