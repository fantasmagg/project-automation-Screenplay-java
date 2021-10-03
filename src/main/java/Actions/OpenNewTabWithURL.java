package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OpenNewTabWithURL {

    public static void other (WebDriver driver,String url){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.open('%s','_blank');",url);

    }

}
