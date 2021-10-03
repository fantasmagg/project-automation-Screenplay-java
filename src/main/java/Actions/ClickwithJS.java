package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClickwithJS {
    private static Logger log = Logger.getLogger(ClickwithJS.class);
    public static void js(WebDriver driver , String element)throws Exception{
        By seleniumElement = elementJson.elementos(element);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",driver.findElement(seleniumElement));
        log.info("click with js");

    }

}
