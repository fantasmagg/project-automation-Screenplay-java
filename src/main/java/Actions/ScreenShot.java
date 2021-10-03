package Actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class ScreenShot {
    public static void screen(WebDriver driver ,String testCaptura ,String browser) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmm");
        String screenShotName = testCaptura+"_"+browser+"_"+dateFormat.format(GregorianCalendar.getInstance().getTime())+"";
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("C:\\project-automation-Screenplay-java\\src\\test\\resources\\Data\\screenshots\\"+browser+"\\"+screenShotName+".png"));
    }
}
