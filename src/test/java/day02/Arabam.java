package day02;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Arabam {
    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUpArabam() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4-T160");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");//ios için "XCUITest" kullanılır
      //  caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Hp\\IdeaProjects\\Appium-T160\\Apps\\arabam-com-5-4-1.apk");
      caps.setCapability("appPackage","com.dogan.arabam");
      caps.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);


    }

    @Test
    public  void test1() throws InterruptedException {
        //uygulamanın basarili bir sekilde yuklendigi dogrulanir
      Assert.assertTrue(driver.isAppInstalled("com.dogan.arabam"));
        //uygulamanın basarili bir sekilde ACILDIGINI dogrular

Assert.assertTrue(driver.findElementById("com.dogan.arabam:id/ivArabamLogo").isDisplayed());

//alt menüdeki ilan ara butonu tıklanır
Thread.sleep(2000);
driver.findElementByXPath("//*[@text='İlan Ara']").click();

//kategori olarak otomobil secilir //
Thread.sleep(2000);
driver.findElementByXPath("//*[@text='Otomobil']").click();

Thread.sleep(3000);
TouchAction action=new TouchAction<>(driver);
            action.press(PointOption.point(500,1800))
                 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(80)))
                .moveTo(PointOption.point(500,400))
                    .release().perform();
        Thread.sleep(3500);
        driver.findElementByXPath("//*[@text='Volkswagen']").click();

//arac markasi olarak passat secilir
        Thread.sleep(3000);
        driver.findElementByXPath("//*[@text='Passat']").click();

        Thread.sleep(3000);
        driver.findElementByXPath("//*[@text='1.4 TSi BlueMotion']").click();

        Thread.sleep(3000);
        driver.findElementByXPath("//*[@text='Comfortline']").click();

        Thread.sleep(3000);
        action.press(PointOption.point(400,315)).release().perform();

        Thread.sleep(3000);
        driver.findElementByXPath("//*[@text='Fiyat - Ucuzdan Pahalıya']").click();



        //gelen en ucuz arabanın 100 binden yüsek oldugu dogrulanir

        String enucuzFiyatActual=driver.findElementByXPath("(//*[@resource-id='com.dogan.arabam:id/tvPrice'])[1]").getText();
        enucuzFiyatActual=enucuzFiyatActual.replaceAll("\\D","");
        //(//*[@resource-id='com.dogan.arabam:id/tvPrice'])[1]
        int beklenenFiyatExpected=100000;

        Assert.assertTrue(Integer.parseInt(enucuzFiyatActual)>beklenenFiyatExpected);

    }



}