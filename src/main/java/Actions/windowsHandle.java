package Actions;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class windowsHandle {
    public static Map<String,String>HandLeMyWindows = new HashMap<>();
    public static void another(WebDriver driver , String namePage){


        if(HandLeMyWindows.containsKey(namePage)){
            driver.switchTo().window(HandLeMyWindows.get(namePage));
        }else {
            for(String  windowsPage:driver.getWindowHandles()){

                HandLeMyWindows.put(namePage,windowsPage);
                driver.switchTo().window(HandLeMyWindows.get(namePage));

            }

        }


    }

}
