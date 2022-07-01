package Builders;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlossarBuilder {

    public static List<String> makeGlossar (List<String> list) {

        list.add("\\chapter{Glossar}");
        list.add("");
        list.add("\\begin{longtable}{|p{5cm}|p{10cm}|}");
        list.add("");
        list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Begriff}} & \\multicolumn{1}{l|}{\\textbf{Definition/Erläuterung}} \\\\ \\hline");
        list.add("\\endfirsthead");
        list.add("");
        list.add("\\multicolumn{2}{c}");
        list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        list.add("\\hline \\multicolumn{1}{|c|}{\\textbf{Begriff}} & \\multicolumn{1}{c|}{\\textbf{Definition/Erläuterung}} \\\\ \\hline");
        list.add("\\endhead");
        list.add("");
        list.add("\\endfoot");
        list.add("");
        list.add("\\hline");
        list.add("\\endlastfoot");
        list.add("");

        //TODO: Aus Excel-Datei Einträge holen
        // https://www.baeldung.com/java-microsoft-excel

        FileInputStream file = new FileInputStream(new File(fileLocation));
        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (Row row : sheet) {
            data.put(i, new ArrayList<>());
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING: ... break;
                    case NUMERIC: ... break;
                    case BOOLEAN: ... break;
                    case FORMULA: ... break;
                    default: data.get(new Integer(i)).add(" ");
                }
            }
            i++;
        }



        list.add("XXX & XXX  \\\\ \\hline");
        list.add("");
        list.add("XXX & XXX  \\\\ \\hline");
        list.add("");
        list.add("\\end{longtable}");
        list.add("");
        list.add("");

        return list;

    }
}

