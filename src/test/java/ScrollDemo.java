
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest {
    Boolean scrollMore;

    @Test

    public void scrollDemoTest(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        // prior knowledge of scroll
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));

        do {
            //don't know where to scroll
            scrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction",
                    "down", "percent", 3.0));
        }
        while (scrollMore);
    }
}
