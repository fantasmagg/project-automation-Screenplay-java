package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForElementPresent {
    public static int EXPLICIT_TIMEDUT =15;
    public static void waitsPresent (WebDriver driver, String element)throws Exception{
        By seleniumElement = elementJson.elementos(element);
        WebDriverWait wait = new WebDriverWait(driver,EXPLICIT_TIMEDUT);
        wait.until(ExpectedConditions.presenceOfElementLocated(seleniumElement));
    }

}
