package task;

import Actions.CheckTextElementEqualTo;
import Actions.elementJson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class check_h2_of_page {

    public static void assertEqualS(WebDriver driver, String element, String textActual) throws Exception {

        By seleniumElement = elementJson.elementos(element);
        String textDos= driver.findElement(seleniumElement).getText();
        CheckTextElementEqualTo.elementPresent(driver,textDos,textActual);

    }

}
