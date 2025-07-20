package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllCurrencyPage {

    public AllCurrencyPage(){

        PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
    }


    @FindBy(id="com.smartwho.SmartAllCurrencyConverter:id/toolbar")
    public WebElement acilisSayfasiYazisi;

    @FindBy(id="com.smartwho.SmartAllCurrencyConverter:id/b1")
    public WebElement birTusu;

    @FindBy(id="com.smartwho.SmartAllCurrencyConverter:id/b000")
    public WebElement UcSifirTusu;

    @FindBy(id="com.smartwho.SmartAllCurrencyConverter:id/EditTextCurrencyB")
    public WebElement sonuc;







}
