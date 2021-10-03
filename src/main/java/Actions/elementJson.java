package Actions;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class elementJson {
    // ruta de los obeject
    public static String PagesFilePath ="src/main/java/Object/";
    public static String FileName = "";
    private static Logger log = Logger.getLogger(elementJson.class);
    /***DOM pages/json***/
    public static String GetFieldBy = "";
    public static String ValueToFind ="";


    /***this is metodo is en read the file in pages ***/
    public static Object readJson() throws Exception {

        FileReader reader = new FileReader(PagesFilePath+FileName);
        try{
            if (reader != null){
                JSONParser jsonParser = new JSONParser();
                return  jsonParser.parse(reader);

            }else {
                return null;
            }

        }catch (FileNotFoundException | NullPointerException e){
            log.info("ReadEntity No existe el archivo "+ FileName);
            throw new IllegalStateException("ReadEntity No existe el archivo "+ FileName,e);
        }

    }

    public static JSONObject ReadEntity(String element) throws Exception {
        JSONObject Entity = null;

        JSONObject jsonObject = (JSONObject) readJson();
        Entity = (JSONObject) jsonObject.get(element);

        return Entity;

    }

    public static By elementos(String element) throws Exception {

        By result = null;
        JSONObject Entity = ReadEntity(element);

        GetFieldBy = (String) Entity.get("GetFieldBy");
        ValueToFind =(String) Entity.get("ValueToFind");

        if ("className".equalsIgnoreCase(GetFieldBy)){
            result = By.className(ValueToFind);
        }else if ("cssSelector".equalsIgnoreCase(GetFieldBy)){
            result = By.cssSelector(ValueToFind);

        }else if ("id".equalsIgnoreCase(GetFieldBy)){
            result = By.id(ValueToFind);
        }else if ("linkText".equalsIgnoreCase(GetFieldBy)){
            result = By.linkText(ValueToFind);

        }else if("name".equalsIgnoreCase(GetFieldBy)){
            result = By.name(ValueToFind);
        }else if ("link".equalsIgnoreCase(GetFieldBy)){

            result = By.partialLinkText(ValueToFind);
        }else if ("tagName".equalsIgnoreCase(GetFieldBy)){
            result = By.tagName(ValueToFind);

        }else if ("xpath".equalsIgnoreCase(GetFieldBy)){
            result = By.xpath(ValueToFind);
        }
        return result;
    }
    public static void nameDel_json(String name) throws Exception {
        FileName = name;
        readJson();
        log.info("reading file json");

    }
}
