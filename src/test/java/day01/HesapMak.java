package day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HesapMak {
    AndroidDriver<AndroidElement>driver;
    //kulanic gerekli kurulumlari yapar
@Test
public void hesapMak() throws MalformedURLException {


    DesiredCapabilities caps=new DesiredCapabilities();

    caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4-T160");
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
    //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");//ios için "XCUITest" kullanılır
    caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\Hp\\IdeaProjects\\Appium-T160\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
    //caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\Hp\\IdeaProjects\\Appium-T160\\Apps\\Apk Bilgisi_2.3.4_apkcombo.com.apk");
    driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);

    //uygulamanın yuklendigini dogrular(isInstalled)

    Assert.assertTrue(driver.isAppInstalled("com.google.android.calculator"));

    //uygulamanın acıldıgını dogrular

    Assert.assertTrue(driver.findElementById("com.google.android.calculator:id/clr").isDisplayed());

    //400 ün 3 katının 1200 oldugunu dogrulayın
    driver.findElementByAccessibilityId("4").click();
    driver.findElementByAccessibilityId("0").click();
    driver.findElementByAccessibilityId("0").click();
    driver.findElementByAccessibilityId("multiply").click();
    driver.findElementByAccessibilityId("3").click();
    String islemSonucu=driver.findElementById("com.google.android.calculator:id/result_preview").getText();
    int beklenenSonuc=1200;

    Assert.assertEquals(beklenenSonuc,Integer.parseInt(islemSonucu));

}


}
