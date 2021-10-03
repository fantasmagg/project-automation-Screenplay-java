package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptAlert {
    /**esto es para las alertas el los sitios web**/
    private static Logger log = Logger.getLogger(AcceptAlert.class);
    public static void alert(WebDriver driver , String want){
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String elementText= alert.getText();
            log.info("text of alert "+elementText);
            if(want.equalsIgnoreCase("accpet")){
                alert.accept();

                log.info("accpet alert");
            }
            else {
                alert.dismiss();
                log.info("dismiss alert");
            }
        }catch(Throwable e){

            log.error("Error came while waiting for the alert popup."+e.getMessage());
        }

    }


}
