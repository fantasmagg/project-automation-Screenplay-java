package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectIndex {


    public static  void byIndex(WebDriver driver, String elementoNameJSon, int index) throws Exception {
        SelectBase sl = new SelectBase();
        Select opt = (Select)  sl.selects(driver,elementoNameJSon);
        opt.selectByIndex(index);


    }

}
