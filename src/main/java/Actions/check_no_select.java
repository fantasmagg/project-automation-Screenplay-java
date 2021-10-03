package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class check_no_select {

    public static void check(WebDriver driver,String elemento) throws Exception {
        By  seleniumElement = elementJson.elementos(elemento);
        boolean isCheck = driver.findElement(seleniumElement).isSelected();
        if(isCheck){
            driver.findElement(seleniumElement).click();
        }
    }


}
