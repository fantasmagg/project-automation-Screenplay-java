package task;

import Actions.SelectVisibleText;
import org.openqa.selenium.WebDriver;

public class userSelectVisibleText {

    public static void como(WebDriver driver,String elementoNameJSon , String texto) throws Exception {
        SelectVisibleText.Visibletexto(driver,elementoNameJSon,texto);

    }

}
