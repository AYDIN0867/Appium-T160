package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class kiwiPage {

    public kiwiPage(){

        PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);}

@FindBy(xpath = "(//*[@class='android.widget.Button'])[4]")
    public WebElement misafirButonu;



    }

