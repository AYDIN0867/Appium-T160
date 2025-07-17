package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Kiwi {

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    KiwiPage kiwiPage=new KiwiPage();



    @Test
    public void kiwiTest() throws InterruptedException {
        // uygulamanin yuklendigi dogrulanir

        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));

        //uygulamanın başarıyla açıldıgı dogrulanır

        Assert.assertTrue(kiwiPage.misafirButonu.isDisplayed());
        Thread.sleep(2000);

        //misafir olarak devam et e tiklanir

        kiwiPage.misafirButonu.click();
        Thread.sleep(2000);

        //ardindan gelecek 3 adımda da yesil butona basılarak devam edilir

        for (int i = 0; i < 3; i++) {

            kiwiPage.yesilcontinueButonu.click();
        }

        //x=540,y=2040,500(bekleme süresi)

        //for (int i = 0; i < 3; i++) {

          //  ReusableMethods.koordinatTiklamaMethodu(540,2040,500);


       // }
//trip type one way secilir

       kiwiPage.returnButonu.click();
        Thread.sleep(2000);


    }




}
