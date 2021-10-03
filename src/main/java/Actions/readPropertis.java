package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readPropertis {
    private static String browser;
    private static Properties prop = new Properties();
    private static InputStream in = readPropertis.class.getResourceAsStream("../test.properties");
    private static Logger log = Logger.getLogger(readPropertis.class);
    public readPropertis(){


    }
    public static void rea() throws IOException {
        WebDriver driver;

        log.info("************************************************************************************************");
        log.info("[ POM Configuration ] - Read the basic properties configuration from: ../test.properties");
        browser = prop.getProperty("browser");


    }
    public static String readProperties(String property) throws IOException {
        prop.load(in);
        return prop.getProperty(property);

    }


}
