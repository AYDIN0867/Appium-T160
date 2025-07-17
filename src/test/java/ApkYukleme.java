import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkYukleme {
    AndroidDriver<AndroidElement> driver;

    @Test
    public void apkYukleme() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4-T160");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");//ios için "XCUITest" kullanılır
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Hp\\IdeaProjects\\Appium-T160\\Apps\\arabam-com-5-4-1.apk");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);


    }






}
