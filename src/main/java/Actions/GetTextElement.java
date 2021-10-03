package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextElement {
    public static String ElementText = "";
    public static String text(WebDriver driver, String element) throws Exception {
        By seleniumElement = elementJson.elementos(element);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(seleniumElement));
        ElementText = driver.findElement(seleniumElement).getText();
        return ElementText;
    }
}
