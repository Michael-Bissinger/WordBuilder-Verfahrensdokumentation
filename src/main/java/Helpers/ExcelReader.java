package Helpers;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static Map<Integer, List<String>> readExcel (File fileLocation) {

        // Aus Excel-Datei Einträge holen
        // https://www.baeldung.com/java-microsoft-excel

        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(fileLocation.getPath()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (
                Row row : sheet) {
            data.put(i, new ArrayList<>());
            for (Cell cell : row) {

                //data.get(i).add(" Halllo ");
                //data.get(i).add(" ");

                switch (cell.getCellType()) {
                    case STRING:
                        data.get(i).add(cell.getRichStringCellValue().getString());
                        break;

                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            data.get(i).add(cell.getDateCellValue() + "");
                        } else {
                            data.get(i).add(cell.getNumericCellValue() + "");
                        }break;

                    case BOOLEAN:
                        data.get(i).add(cell.getBooleanCellValue() + "");
                        break;
                    case FORMULA:
                        data.get(i).add(cell.getCellFormula() + "");
                        break;
                    default:
                        data.get(i).add(" ");
                }
            }
            i++;
        }

        return data;

    }

    public static String findTermInData (Map<Integer, List<String>> data, String searched_term) {

        String requested_input = new String();

        for(int i=1;i<data.size();i++){
            System.out.println("Lese Daten aus Excel-Liste aus. Gesuchtes Item: {" + searched_term + "} Durchlauf Nr. " + i);
            System.out.println("Inhalt: {" + data.get(i).get(0) + "}");

            if (data.get(i).get(0).equals(searched_term)) {
                System.out.println("Gefunden: {" + searched_term + "} Ergebnis: {" + data.get(i).get(1) + "}");
                requested_input = data.get(i).get(1);
                break;

            }
            else
            {
                System.out.println("Keine Übereinstimmung");}
        }

        return requested_input;
    }

}
