package TestScriptsViews;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.apiDemo.Baseutil.Basecaplib;
import com.apiDemo.Pages.annimationPage;
import com.apiDemo.Pages.home_Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01Animation extends Basecaplib{
	home_Page hp;
	annimationPage am;
	AndroidDriver<AndroidElement> driver ;
	@Test
	public void runBuil() throws MalformedURLException {
		ThreedAnimation();
		Interpolators();
	}
	
  public void ThreedAnimation() throws MalformedURLException {
	 driver = capabilities("Emulator");
	   hp = new home_Page(driver, 2);
	   hp.clickOnViews();
	   am = new annimationPage(driver, 2);
	   am.clickOn3DAnimations();
	   Assert.assertTrue(true);
  }
	
	public void Interpolators() throws MalformedURLException {
		driver = capabilities("Emulator");
		hp = new home_Page(driver, 2);
		hp.clickOnViews();
		am = new annimationPage(driver, 2);
		am.clickOnInterpoltorsAnimations();
	  }
}
