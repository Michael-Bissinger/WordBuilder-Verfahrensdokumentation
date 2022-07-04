package Builders;

import Helpers.ExcelReader;

import java.io.File;
import java.util.List;
import java.util.Map;

public class GlossarBuilder {

    private static File PATH_GLOASSAR_FILE = new File("Ressourcen/Glossar/Glossar_data.xlsx");

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

        // Aus Excel-Datei Einträge holen
        // https://www.baeldung.com/java-microsoft-excel

        //File glossar_sheet_path= new File("Ressourcen/Glossar/Glossar_data.xlsx");
        Map<Integer, List<String>> data;
        data = ExcelReader.readExcel(PATH_GLOASSAR_FILE);

        System.out.println("Das ist das Ergebnis der Excel: " + data);

        System.out.println("Größe data: " + data.size());


        for(int i=1;i<data.size();i++){
            System.out.print("Glossar wird geschrieben. Durchlauf Nr. " + i);
            System.out.println("Inhalt: " + data.get(i).get(0));

            list.add(data.get(i).get(0) + " & " + data.get(i).get(1) + "  \\\\ \\hline");
            list.add("");

        }






        //list.add("XXX & XXX  \\\\ \\hline");
        //list.add("");
        //list.add("XXX & XXX  \\\\ \\hline");
        //list.add("");
        list.add("\\end{longtable}");
        list.add("");
        list.add("");

        return list;

    }
}

