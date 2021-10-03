package test;

import Actions.elementJson;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import task.initializationDriver;
import task.userSelectVisibleText;

public class testngs_with_parameter {
    public static WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    public void beforeClass(String browser,String app) throws Exception {
        driver= initializationDriver.intancia(browser);
        driver.get(app);
        elementJson.nameDel_json("spotifai.json");
    }
    @Test
    public void prueba() throws Exception {
        userSelectVisibleText.como(driver,"selector","Enero");
        Thread.sleep(3000);
    }

    @AfterClass
    public void afterClass(){
        driver.close();

    }



}
