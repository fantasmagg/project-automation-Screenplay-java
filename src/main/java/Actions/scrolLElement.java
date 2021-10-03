package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class scrolLElement {

    public static void element(WebDriver driver ,String element) throws Exception {
        By seleniumElement = elementJson.elementos(element);
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();",driver.findElement(seleniumElement));

    }



}
