package test;

import Actions.elementJson;
import task.userSelectVisibleText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class prueba {
    @Test
    public void testSelecion() throws Exception {
        WebDriver driver ;
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","C:\\driverActualizado\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("test-type");
        options.addArguments("disable-extensions");
        options.addArguments("--start-maximized");

        caps.setCapability("chrome.binary","C:\\driverActualizado\\chromedriver.exe");
        caps.setVersion("93.0");
        caps.setCapability(ChromeOptions.CAPABILITY,options);
        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"),caps);
        //---------------------------------------------------------------------------
        elementJson.nameDel_json("spotifai.json");

        driver.get("https://www.spotify.com/do/signup/");
        Thread.sleep(3000);

        userSelectVisibleText.como(driver,"selector","Enero");
        Thread.sleep(3000);
        driver.quit();

    }


}
