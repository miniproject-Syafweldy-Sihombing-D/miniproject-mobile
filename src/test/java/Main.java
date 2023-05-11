import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("/Users/LENOVO/Downloads/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            WebElement buttonLogin = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            buttonLogin.click();
            WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            emailField.click();
            emailField.sendKeys("weldy12345@gmail.com");
            WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            passwordField.click();
            passwordField.sendKeys("12345asd");
            WebElement loginButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            loginButton.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}
