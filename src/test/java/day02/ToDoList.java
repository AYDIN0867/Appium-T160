package day02;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDolistPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ToDoList {

AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();
ToDolistPage page=new ToDolistPage();
@Test
public void test() throws InterruptedException {

    // uygulamanin basarili bir sekilde yuklendigi dogrulanir
    Assert.assertTrue(driver.isAppInstalled("todolist.scheduleplanner.dailyplanner.todo.reminders"));

// uygulaminin basarili bir sekilde acildigi dogrulanir

    Assert.assertTrue(page.yazi.isDisplayed());
    //Assert.assertTrue(driver.findElementByXPath("//*[@text='Welcome to To-do List']").isDisplayed());
// Ileri(continue))butonlarina tiklanir ve pop-up lar kapatilir
    page.Continueyazi.click();
    Thread.sleep(1000);
    page.Continueyazi.click();
    Thread.sleep(1000);
    page.xButonu.click();
    Thread.sleep(1000);
    page.IkinciXButonu.click();





// görev ekleme adimina gecilir

page.GorevEklemeButonu.click();

// görev adi girilir
Thread.sleep(1500);
    page.GorevYazmaBox.sendKeys("Kitap Oku");
// görev kaydedilir
    Thread.sleep(1000);
    page.GorevKaydetmeBox.click();

    TouchAction action=new TouchAction<>(driver);
    Thread.sleep(2500);

    for (int i = 0; i < 3; i++) {
       // ReusableMethods.koordinatTiklamaMethodu(800,1200,300);asagidaki action objesi ile yzılan method da aynısını yapar
        action.press(PointOption.point(800,1200)).release().perform();
    }



// görev silinir

    page.KaydedilmisGore.click();
    Thread.sleep(1000);
    page.ucNokta.click();
    Thread.sleep(1000);
    page.deleteGorev.click();
    page.deleteConfirmGorev.click();
// Görev olusturma sayfasina geri dönüldügü dogrulanir

    Assert.assertTrue(page.GorevEklemeButonu.isDisplayed());




}





}
