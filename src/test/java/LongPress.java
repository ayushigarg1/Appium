import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPress extends BaseTest {
    @Test

    public void selectName(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement peopleName = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        longPressAction(peopleName);
        String sampleMenuText= driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Sample menu']")).getText();
        Assert.assertEquals(sampleMenuText,"Sample menu");


    }
}
