package StepDefinitions;
import Actions.ReasdExcelFile;
import Actions.WriteExcelFile;
import Actions.elementJson;
import Actions.readPropertis;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import task.check_h2_of_page;
import task.initializationDriver;
import task.userSelectVisibleText;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import test.testngs_my_store;

import java.io.IOException;


public class StepsDefinitions {
    private testngs_my_store pu;
    // value default
    private WriteExcelFile writeFile;
    private ReasdExcelFile readFile= new ReasdExcelFile();

    //------------
    WebDriver driver;
    @Given("open web My store")
    public void openThisWeb() throws IOException {

        String url = readPropertis.readProperties("MainAppUrlBase") ;
        String browser = readPropertis.readProperties("browser") ;
        driver= initializationDriver.intancia(browser);
        driver.get(url);
    }

    @And("seleciona (.*)")
    public void seleciona(String mes) throws Exception {

        userSelectVisibleText.como(driver,"selector","Enero");

    }

    @Then("read objet (.*)")
    public void leerObjet(String objet) throws Exception {
        elementJson.nameDel_json(objet);
    }


    @When("check title (.*)")
    public void checkTitle(String titleWeb) {
        String title = driver.getTitle();
        Assert.assertEquals(titleWeb,title,"no equals ");

    }
    @And("quit driver")
    public void quitDriver() {
        driver.quit();
    }

    @And("click on element (.*)")
    public void clickOnElement( String element) throws Exception {
        By seleniumElement = elementJson.elementos(element);
        driver.findElement(seleniumElement).click();

    }

    @When("element to write (.*)")
    public void elementOfEmailAndTexto(String elemet) throws Exception {
        String filepath ="C:\\execl\\prueba.xlsx";

        String emailText = readFile.getCellValue(filepath,"Hoja1",0,0);
        //readFile.readExcel(filepath,"Hoja1");
        By seleniumElement = elementJson.elementos(elemet);
        driver.findElement(seleniumElement).sendKeys(emailText);

    }

    @And("element write password (.*)")
    public void elementWritePassword(String element) throws Exception {
        String filepath ="C:\\execl\\prueba.xlsx";
        double passwordhText = readFile.getCellValueInt(filepath,"Hoja1",0,1);
        int pass = (int) passwordhText;
        String cadenaPass = String.valueOf(pass);
       By seleniumElement = elementJson.elementos(element);
        driver.findElement(seleniumElement).sendKeys(cadenaPass);

    }

    @Then("assert my title of profile title (.*)")
    public void assertMyTitleOfProfile(String textActual) throws Exception {
        check_h2_of_page.assertEqualS(driver,"assertMyAccount",textActual);
    }
}
