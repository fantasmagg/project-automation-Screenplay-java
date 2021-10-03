package Actions;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;

public class screenshoAllure {

    public byte[] attachScreenShot(WebDriver driver , String testCaptura){
        byte[] screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(testCaptura,new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

        return screenshot;
    }


}
