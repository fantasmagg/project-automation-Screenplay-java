package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class SelectBase {

    elementJson vv = new elementJson();


    public ISelect selects(WebDriver driver, String elementoNameJSon ) throws Exception {
        By seleniumSelect =  elementJson.elementos(elementoNameJSon);
        Select opt = new Select(driver.findElement(seleniumSelect));
         return opt;
    }

}
