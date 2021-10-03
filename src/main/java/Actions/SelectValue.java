package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue {


    public static   void byValue(WebDriver driver, String elementoNameJSon, String value) throws Exception {
        SelectBase sl = new SelectBase();
        Select opt = (Select)  sl.selects(driver,elementoNameJSon);
        opt.selectByValue(value);


    }

}
