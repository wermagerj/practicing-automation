import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
            .setDeviceName("Android Device")  // This will work with any connected Android device
            .setAutomationName("UiAutomator2")
            .setAutoGrantPermissions(true);
        
        // Add your app package and activity here
        // options.setAppPackage("com.example.app");
        // options.setAppActivity("com.example.app.MainActivity");

        driver = new AndroidDriver(
            new URL("http://127.0.0.1:4723"), 
            options
        );
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
} 