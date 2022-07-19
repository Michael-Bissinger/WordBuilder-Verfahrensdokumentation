package LaTexBuilders;

import java.util.List;

public class LongTableBuilder {

    public static List<String> startLongTable (List<String> list, String[] headers) {


        System.out.println("Start longtable with " + headers.length + " columns.");

        // ----------- HEADER ---------------

        StringBuilder head_longtable = new StringBuilder("|");
        for (int i = 0; i < headers.length; i++) {
            head_longtable.append("l|");
        }

        list.add("\\begin{longtable} {" + head_longtable.toString() + "}");
        //list.add("\\begin{longtable} {|l|p{4,3cm}|}");
        list.add("");

        // ----------- COLUMNS -----------------

        StringBuilder columns_longtable = new StringBuilder("");
        for (int i = 0; i < headers.length; i++) {
            columns_longtable.append("\\multicolumn{1}{|l|}{\\textbf{" + headers[i] + "}} ");

            if (i!=(headers.length-1)) {
                columns_longtable.append("& ");
            }

        }

        list.add("\\hline " + columns_longtable.toString() + " \\\\ \\hline ");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}}  \\\\ \\hline ");
        list.add("\\endfirsthead");
        list.add("");
        list.add("\\multicolumn{" + headers.length + "}{c}");
        //list.add("\\multicolumn{2}{c}");
        list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        list.add("\\hline " + columns_longtable.toString() +" \\\\ \\hline ");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}} \\\\ \\hline ");
        list.add("\\endhead");
        list.add("");
        list.add("\\endfoot");
        list.add("");
        list.add("\\hline ");
        list.add("\\endlastfoot");
        list.add("");

        return list;


    }

    public static List<String> startLongTable_test (List<String> list, String[] headers) {

        System.out.println("Start longtable with " + headers.length + " columns.");

        // ----------- HEADER ---------------

        StringBuilder head_longtable = new StringBuilder("|");
        for (int i = 0; i < headers.length; i++) {
            head_longtable.append("l|");
        }

        list.add("\\begin{longtable} {" + head_longtable.toString() + "}");
        //list.add("\\begin{longtable} {|l|p{4,3cm}|}");
        list.add("");

        // ----------- COLUMNS -----------------

        StringBuilder columns_longtable = new StringBuilder("");
        for (int i = 0; i < headers.length; i++) {
            columns_longtable.append("\\multicolumn{1}{|l|}{\\textbf{" + headers[i] + "}} ");

            if (i!=(headers.length-1)) {
                columns_longtable.append("& ");
            }

        }

        list.add("\\hline " + columns_longtable.toString() + " \\\\ \\hline ");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}}  \\\\ \\hline ");
        list.add("\\endfirsthead");
        list.add("");
        list.add("\\multicolumn{" + headers.length + "}{c}");
        //list.add("\\multicolumn{2}{c}");
        list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        list.add("\\hline " + columns_longtable.toString() +" \\\\ \\hline ");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}} \\\\ \\hline ");
        list.add("\\endhead");
        list.add("");
        list.add("\\endfoot");
        list.add("");
        list.add("\\hline ");
        list.add("\\endlastfoot");
        list.add("");

        return list;

    }

    public static List<String> endLongTable (List<String> list) {

        System.out.println("End longtable.");
        list.add("\\end{longtable}");
        list.add("");

        return list;

    }
}
