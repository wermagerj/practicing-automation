import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void sampleTest() {
        // This is just an example. You'll need to modify these locators based on your app
        
        // Example of finding element by ID
        // WebElement element = driver.findElement(AppiumBy.id("your_element_id"));
        
        // Example of finding element by xpath
        // WebElement button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Click Me']"));
        // button.click();
        
        // Example of finding element by accessibility ID
        // WebElement element = driver.findElement(AppiumBy.accessibilityId("your_accessibility_id"));
        
        // Example assertion
        // Assert.assertTrue(element.isDisplayed(), "Element should be visible");
    }
} 