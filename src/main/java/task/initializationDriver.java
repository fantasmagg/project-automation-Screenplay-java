package task;

import Actions.OPENDRIVER_stepsdefinitions;
import org.openqa.selenium.WebDriver;

public class initializationDriver {
    public static WebDriver intancia(String browser){
        WebDriver driver;
        driver= OPENDRIVER_stepsdefinitions.createNewWebDriver(browser);
        return  driver;
    }
}
