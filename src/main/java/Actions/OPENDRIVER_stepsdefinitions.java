package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OPENDRIVER_stepsdefinitions {
    public static WebDriver driver;
    private static Logger log = Logger.getLogger(OPENDRIVER_stepsdefinitions.class);

    public static WebDriver createNewWebDriver(String browser){



        if ("chrome".equalsIgnoreCase(browser)){
            log.info("Open browser with chrome");
            System.setProperty("webdriver.chrome.driver","C:\\driverActualizado\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if ("firefox".equalsIgnoreCase(browser)){
            log.info("Open browser with firefox");
            System.setProperty("webdriver.chrome.driver","C:\\driverActualizado\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            log.error("the driver is null");
            return null;
        }
        driver.manage().window().maximize();

        return driver;

    }

}
