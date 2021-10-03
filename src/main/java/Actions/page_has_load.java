package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page_has_load {

    public static void load(WebDriver driver){
        int EXPLICIT_TIMEDUT = 10;
        String GetActual= driver.getCurrentUrl();
        //aqui va un log.info con la url
        new WebDriverWait(driver,EXPLICIT_TIMEDUT).until(
           WebDriver ->((JavascriptExecutor)WebDriver).executeScript("return document.readyState").equals("complete")
        );
    }
}
