package ios;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosBaseTest {

    public IOSDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        //start server
        service = new AppiumServiceBuilder().withAppiumJS(new File("//Users//ayushi//.nvm//versions//node//v21.1.0//lib//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 15 Pro");
        //install app
        options.setApp("//Users//ayushi//Library//Developer//Xcode//DerivedData//UIKitCatalog-ckfsyclcqmwritashjxvtutjjjzq//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
        options.setPlatformVersion("17.0");
        options.setWdaLaunchTimeout(Duration.ofSeconds(50));
        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    }

}
