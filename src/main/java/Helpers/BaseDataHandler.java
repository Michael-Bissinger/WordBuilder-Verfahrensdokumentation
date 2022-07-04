package Helpers;

import java.io.File;
import java.util.List;
import java.util.Map;

public class BaseDataHandler {

    private static File PATH_BASEDATA = new File("Ressourcen/_Testdaten/Datenbank_Testdaten.xlsx");

    //private static String UNTERNEHMENSNAME = "HWS Lutz"; // Name des Unternehmens


    public static String getData (String searched_term) {

        String requested_user_input = new String();

        System.out.println("Lese Daten aus Datenbank aus. Gesuchtes Item: " + searched_term);
        Map<Integer, List<String>> data;
        data = ExcelReader.readExcel(PATH_BASEDATA);

        for(int i=1;i<data.size();i++){
            System.out.println("Lese Daten aus Datenbank-Export aus. Gesuchtes Item: {" + searched_term + "} Durchlauf Nr. " + i);
            System.out.println("Inhalt: {" + data.get(i).get(0) + "}");

            if (data.get(i).get(0).equals(searched_term)) {
                System.out.println("Gefunden: {" + searched_term + "} Ergebnis: {" + data.get(i).get(1) + "}");
                requested_user_input = data.get(i).get(1);
                break;

            }
            else
            {
                System.out.println("Keine Übereinstimmung");}
        }

        return requested_user_input;
    }

}
