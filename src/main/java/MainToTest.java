import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MainToTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");


//if you want to run mobile native app then use the below way of giving apk file or ipa file to run the mobile app

        desiredCapabilities.setCapability("app","C:\\Users\\vijayarupha\\Downloads\\Calculator_v7.8 (271241277)_apkpure.com.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

//        iOS capabilities

        /*desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        desiredCapabilities.setCapability("platformName", "iOS");
        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);*/


//if you want to open browser and run the mobile-browser testing then find the prop of browser and find other  properties from emulator and proceed further

        Thread.sleep(5000);
        driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/search_container_all_apps")).click();
        driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/search_container_all_apps")).sendKeys("calculator");

        driver.quit();
    }
}
