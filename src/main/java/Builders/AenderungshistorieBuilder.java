package Builders;

import Helpers.ExcelReader;
import LaTexBuilders.LongTableBuilder;

import java.io.File;
import java.util.List;
import java.util.Map;

public class AenderungshistorieBuilder {

    private static File PATH_AENDERUNGSHISTORIE_DATA = new File("Ressourcen/_Testdaten/Datenbank_Version_Historie.xlsx");

    public static List<String> makeAenderungshistorie (List<String> list) {

        list.add("\\chapter{Änderungshistorie}");
        list.add("\\label{sec:Änderungshistorie}");
        list.add("Bei einer Änderung der Verfahrensdokumentation wird die abgelöste Version unter ihrer eindeutigen Versionsnummer mit Angabe des Gültigkeitszeitraums bis zum Ablauf der Aufbewahrungsfrist archiviert.\\\\");
        list.add("Folgende Verfahrensdokumentationen liegen bereits vor:");
        list.add("");

        // Header Änderungshistorie
        String[] captions_aenderungshistorie = {"Datum", "Version", "Export durch", "Kommentar zur Änderung"};
        list = LongTableBuilder.startLongTable(list, captions_aenderungshistorie);
        //list.add("\\begin{longtable}{|l|l|l|p{9,3cm}|}");
        //list.add("");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Datum}} & \\multicolumn{1}{l|}{\\textbf{Version}} & ");
        //list.add("\\multicolumn{1}{l|}{\\textbf{Export durch}} & \\multicolumn{1}{l|}{\\textbf{Kommentar zur Änderung}} \\\\ \\hline ");
        //list.add("\\endfirsthead");
        //list.add("");
        //list.add("\\multicolumn{4}{l}");
        //list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Datum}} & \\multicolumn{1}{l|}{\\textbf{Version}} & \\multicolumn{1}{c|}{\\textbf{Export durch}} & \\multicolumn{1}{l|}{\\textbf{Kommentar zur Änderung}} \\\\ \\hline ");
        //list.add("\\endhead");
        //list.add("");
        //list.add("\\endfoot");
        //list.add("");
        //list.add("\\hline ");
        //list.add("\\endlastfoot");
        //list.add("");
        //list.add("");
        //list.add("");

        Map<Integer, List<String>> data;
        data = ExcelReader.readExcel(PATH_AENDERUNGSHISTORIE_DATA);

        for(int i=1;i<data.size();i++){
            System.out.println("Schreibe Änderungshistorie. Durchlauf " + i);

            list.add(data.get(i).get(0) + " & " +
                    data.get(i).get(1) + " & " +
                    data.get(i).get(2) + " & " +
                    data.get(i).get(3) + " \\\\ \\hline");
            //list.add("XXX & XXX & XXX & XXX  \\\\ \\hline");


        }
        list.add("");
        list = LongTableBuilder.endLongTable(list);


        return list;

    }

}
