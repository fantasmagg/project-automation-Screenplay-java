package Actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkPartialTextElementNotPresent extends GetTextElement{

    public static void elementNotPresent(WebDriver driver, String element, String text) throws Exception {

        By seleniumElement = elementJson.elementos(element);
       String getText  = driver.findElement(seleniumElement).getText();
        boolean isFound = getText.contains(text);
        Assert.assertFalse("Text is not present in element : "+element+"current text is :"+getText,isFound);

    }

}
