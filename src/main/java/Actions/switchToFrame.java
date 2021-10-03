package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class switchToFrame {

    public static void  frame(WebDriver driver ,String frame) throws Exception {

        By SeleniumElement = elementJson.elementos(frame);
        driver.switchTo().frame(driver.findElement(SeleniumElement));

    }

}
