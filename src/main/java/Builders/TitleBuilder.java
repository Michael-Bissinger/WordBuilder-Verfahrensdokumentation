package Builders;

import java.util.List;

public class TitleBuilder {

    public static List<String> makeTitle (List<String> list) {

        // Titelzeilen in Liste abspeichern (Zeile für Zeile)

        // Header
        list.add("\\begin{titlepage}");
        list.add("\\centering");
        list.add("\\includegraphics[width=0.15\\textwidth]{Grafiken/laptop.png}\\par%\\vspace{1cm}");
        list.add("");
        list.add("{\\scshape\\huge Verfahrensdokumentation \\par}");

        list.add("\\vspace{2cm}");
        list.add("\\vfill");

        // Logo
        list.add("\\includegraphics[width=0.15\\textwidth]{Grafiken/HWS_New_Logo_blue.png}\\par");

        // Unternehmensangaben
        list.add("\\textbf{HWS Lutz GmbH \\& Co. KG}\\par");
        list.add("Steuerberatungsgesellschaft\\par");
        list.add("Kupferstraße 5\\par");
        list.add("70565 Stuttgart\\par");

        list.add("\\vfill");

        // Aktueller Stand
        list.add("\\underline{Versionsnummer:} 1.0\\par");
        list.add("\\underline{Stand:} 23.06.2022\\par");

        list.add("\\vfill");
        list.add("\\vspace{2cm}");

        // Änderungshistorie
        list.add("{\\Large Jüngste Änderungshistorie*}");
        list.add("\\normalsize");
        list.add("\\begin{center}");
        list.add("\\begin{tabular}{ | l | l | l | p{7cm} |}");
        list.add("\\hline");
        list.add("\\textbf{Datum} & \\textbf{Version} & \\textbf{Export durch} & \\textbf{Kommentar zur Änderung} \\\\ \\hline");
        list.add("");
        list.add("&  &  & \\\\ \\hline");
        list.add("&  &  & \\\\ \\hline");
        list.add("&  &  & \\\\ \\hline");
        list.add("");
        list.add("\\end{tabular}");
        list.add("\\end{center}");
        list.add("");
        list.add("\\textit{\\small*Überblick der letzten drei Änderungen. Komplette Änderungshistorie in Kapitel \\ref{sec:Änderungshistorie}}");
        list.add("");
        list.add("\\vfill");
        list.add("");
        list.add("\\end{titlepage}");


        System.out.println("Ausgabe Liste");
        System.out.println(list);

        // Liste zurückgeben
        return list;


    }

}
