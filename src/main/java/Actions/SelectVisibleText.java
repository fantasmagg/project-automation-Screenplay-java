package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectVisibleText {


    public static void Visibletexto(WebDriver driver, String elementoNameJSon, String texto) throws Exception {
        SelectBase sl = new SelectBase();
        Select opt = (Select)  sl.selects(driver,elementoNameJSon);
        opt.selectByVisibleText(texto);


    }

}
