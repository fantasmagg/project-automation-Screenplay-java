package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class isElementDisplayed {
    public static boolean isDisplayed= Boolean.parseBoolean(null);
    public static boolean displayeds(WebDriver driver,String element) throws Exception {
        try{
            By seleniumElement = elementJson.elementos(element);
            //aqui un log
            WebDriverWait wait = new WebDriverWait(driver,10);
            isDisplayed= wait.until(ExpectedConditions.presenceOfElementLocated(seleniumElement)).isDisplayed();

        } catch (NoSuchElementException | TimeoutException e) {
           isDisplayed= false;

           //aqui va un log
        }
        //aqui va un log
        return isDisplayed;


    }
}
