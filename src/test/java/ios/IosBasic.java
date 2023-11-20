package ios;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IosBasic extends IosBaseTest {

    @Test

    public void testApp() {

        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
        String verifyPopUpTitle = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='A Short Title Is Best']")).getText();
        Assert.assertEquals(verifyPopUpTitle, "A Short Title Is Best");
        driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("Ayushi Test");
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Confirm / Cancel'")).click();
        String verifyMsg= driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
        Assert.assertEquals(verifyMsg,"A message should be a short, complete sentence.");
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Confirm'")).click();

    }

}
