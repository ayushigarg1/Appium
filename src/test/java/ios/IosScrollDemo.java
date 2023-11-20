package ios;


import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class IosScrollDemo extends IosBaseTest {

    @Test

    public void iosScrollDemoTest() throws InterruptedException {

       WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
       Map<String,Object> params = new HashMap<>();
       params.put("direction", "down");
       params.put("element", ((RemoteWebElement)ele).getId());
       //scroll to element
        driver.executeScript("mobile:scroll",params);
        driver.findElement(AppiumBy.accessibilityId("Web View")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();

        //click on picker view
        driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
        driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("70");
        driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("210");
        driver.findElement(AppiumBy.accessibilityId("Blue color component value")).sendKeys("130");
        String picker1= driver.findElement(AppiumBy.accessibilityId("Red color component value")).getText();
        Assert.assertEquals(picker1, "70");
        String picker2 =  driver.findElement(AppiumBy.accessibilityId("Green color component value")).getText();
        Assert.assertEquals(picker2,"210");
        String picker3 = driver.findElement(AppiumBy.accessibilityId("Blue color component value")).getText();
        Assert.assertEquals(picker3,"130");
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();



    }
}
