package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import pages.AllCurrencyPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

public class AllCurrencyTest {

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AllCurrencyPage page=new AllCurrencyPage();

    @Test
    public void AllCurrencyTest() throws InterruptedException, IOException {
        // all currency uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));    //package degerini bundle dir
        // uygulamanin acildigi dogrulanir
        Assert.assertTrue(page.acilisSayfasiYazisi.isDisplayed());
        // cevirmek istedigimiz para birimi Türk Lirasi olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(607,403,400);
        Thread.sleep(2000);
        ReusableMethods.scrollWithUiScrollableAndClick("Turkish Lira");
        Thread.sleep(2000);
        // cevirilecek tutar tuslanir
        page.birTusu.click();
        page.UcSifirTusu.click();
        // cevirelecek olan para birimi Bangladesh para birimi olarak secilir
ReusableMethods.koordinatTiklamaMethodu(357,554,500);
Thread.sleep(2000);
ReusableMethods.scrollWithUiScrollableAndClick("BDT");
Thread.sleep(2000);
// cevrilen tutar screenShot olarak kaydedilir
ReusableMethods.getScreenshot("TestSonucu");
File screenshot=driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot.jpg"));

        // Ardindan Türk lirasinin Bangladesh parasi karsiligi olan degeri kaydedilir
      String cevrilenmiktar=  page.sonuc.getText();
      driver.sendSMS("44","cevrilen para mikatri karsiligi"+cevrilenmiktar);





    }







    // kullaniciya sms olarak bildirilir






}
