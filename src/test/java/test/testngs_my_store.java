package test;

import Actions.ReasdExcelFile;
import Actions.WriteExcelFile;
import Actions.elementJson;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import task.check_h2_of_page;
import task.initializationDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class testngs_my_store {
    public static WebDriver driver;
    private WriteExcelFile writeFile;
    private ReasdExcelFile readFile;
    //private Logger log =Logger.getLogger(testngs_my_store.class);
    @BeforeClass
    public void setup() throws Exception {
//        driver= initializationDriver.intancia("chrome");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        readFile= new ReasdExcelFile();

        elementJson.nameDel_json("myStore.json");
    }
    @Test(priority = 0)
    public void Aweb_title_check() throws Exception {
        String title = driver.getTitle();
        String titleWeb="My Store";
        Assert.assertEquals(titleWeb,title,"no equals ");

    }
    @Test(priority = 1)
    public void Bclick_signIn () throws Exception {

        By seleniumElement = elementJson.elementos("signin");
        driver.findElement(seleniumElement).click();

    }
    @Test(priority = 2)
    public void Cassert_section_signIn () throws Exception {

        check_h2_of_page.assertEqualS(driver,"Already_registered","ALREADY REGISTERED?");

    }
    @Test(priority = 3)
    public void DsignIn() throws Exception {
        String filepath ="C:\\execl\\prueba.xlsx";

        String emailText = readFile.getCellValue(filepath,"Hoja1",0,0);
        //readFile.readExcel(filepath,"Hoja1");
        double passwordhText = readFile.getCellValueInt(filepath,"Hoja1",0,1);
        int pass = (int) passwordhText;
        String cadenaPass = String.valueOf(pass);
        By seleniumElement = elementJson.elementos("entity_Email_address_sigIn");
        driver.findElement(seleniumElement).sendKeys(emailText);
        System.out.println(cadenaPass);
         seleniumElement = elementJson.elementos("emailPassword");
        driver.findElement(seleniumElement).sendKeys(cadenaPass);
        seleniumElement = elementJson.elementos("butSignIn");
        driver.findElement(seleniumElement).click();
    }
    @Test(priority = 4)
    public void EassertMyAccount () throws Exception {
        check_h2_of_page.assertEqualS(driver,"assertMyAccount","MY ACCOUNT");
        Thread.sleep(2000);
    }

    @AfterClass
    public void afterClass() throws InterruptedException {

        driver.close();

    }

}
