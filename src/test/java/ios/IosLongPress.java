package ios;

import android.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class IosLongPress extends IosBaseTest {
    @Test

    public void iosLongPress(){
        driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
         WebElement ele =  driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='Increment'])[3]"));
            driver.executeScript("mobile: touchAndHold", ImmutableMap.of(
            "elementId",((RemoteWebElement)ele).getId(),"duration",2000));

    }
}
