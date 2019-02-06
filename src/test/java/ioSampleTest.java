import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ioSampleTest {

    public AppiumDriver<AndroidElement> driver;


    @Test
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        File appDir = new File("src/apk");
        File app = new File(appDir, "ApiDemos-deb.apk");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_API_25");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        caps.setCapability(MobileCapabilityType.NO_RESET,"true");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
    }

}
