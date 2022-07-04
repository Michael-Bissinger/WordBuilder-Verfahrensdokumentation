package Helpers;

import java.io.File;
import java.util.List;
import java.util.Map;

public class BaseDataHandler {

    private static File PATH_BASEDATA = new File("Ressourcen/_Testdaten/Datenbank_Testdaten.xlsx");

    //private static String UNTERNEHMENSNAME = "HWS Lutz"; // Name des Unternehmens


    public static String getData (String searched_term) {

        String user_input = new String();

        System.out.println("Lese Daten aus Datenbank aus");
        Map<Integer, List<String>> data;
        data = ExcelReader.readExcel(PATH_BASEDATA);




        return user_input;
    }

}
