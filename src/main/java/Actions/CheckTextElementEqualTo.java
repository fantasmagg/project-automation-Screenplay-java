package Actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckTextElementEqualTo{

    public static void elementPresent(WebDriver driver, String textodos, String text) throws Exception {
        Assert.assertEquals("not equals",textodos,text);
    }

}
