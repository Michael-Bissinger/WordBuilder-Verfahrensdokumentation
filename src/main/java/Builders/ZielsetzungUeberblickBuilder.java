package Builders;

import Helpers.BaseDataHandler;
import Helpers.ExcelReader;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ZielsetzungUeberblickBuilder {

    private static File PATH_BRANCHENBESONDERHEITEN_FILE = new File("Ressourcen/Rechtliches Wissen/Branchenbesonderheiten.xlsx");

    public static List<String> makeZielsetzungUeberblick (List<String> list) {

        list.add("\\chapter{Zielsetzung und Überblick}");
        list.add("");


        // Kapitel: Zielsetzung und Anwendungsbereich
        list.add("\\section{Zielsetzung und Anwendungsbereich}");
        list.add("");
        list.add("\\begin{enumerate}[{[1]}]");
        list.add("");
        list.add("\\item XXX");
        list.add("");
        list.add("\\item XXX");
        list.add("");
        list.add("\\item Die dargestellten Verfahren und Maßnahmen sind von allen Personen zu beachten, die an den einzelnen Prozess-Schritten beteiligt sind und für diese unterwiesen und autorisiert wurden. Nicht unterwiesene oder nicht autorisierte Personen dürfen nicht in den Prozess eingreifen.");
        list.add("");
        list.add("\\item XXX");
        list.add("");
        list.add("\\end{enumerate}");
        list.add("");

        // Kapitel: Unternehmen und organisatorisches Umfeld
        list.add("");
        list.add("\\section{Unternehmen und organisatorisches Umfeld}");
        list.add("");
        list.add("\\begin{enumerate}[{[1]}]");
        list.add("");
        list.add("\\item Kurze Beschreibung des Unternehmens: ");
        list.add("");
        list.add("\\begin{itemize}");
        list.add("\\item \\textbf{Name:} " +
                BaseDataHandler.getData("Unternehmen_Name"));
        list.add("\\item \\textbf{Sitz:} " +
                BaseDataHandler.getData("Unternehmen_Strasse") + " " +
                BaseDataHandler.getData("Unternehmen_Hausnummer") + ", " +
                BaseDataHandler.getData("Unternehmen_Postleitzahl") + " " +
                BaseDataHandler.getData("Unternehmen_Ort"));
        list.add("\\item \\textbf{Rechtsform:} " +
                BaseDataHandler.getData("Unternehmen_Rechtsform"));
        list.add("\\item \\textbf{Branche:} " +
                BaseDataHandler.getData("Unternehmen_Branche"));
        list.add("\\item \\textbf{Geschäftszweck:} " +
                BaseDataHandler.getData("Unternehmen_Geschäftszweck"));
        list.add("\\item \\textbf{USt-ID-Nummer:} " +
                BaseDataHandler.getData("Unternehmen_USt-ID-Nummer"));
        list.add("\\item \\textbf{Steuernummer:} " +
                BaseDataHandler.getData("Unternehmen_Steuernummer"));
        list.add("\\item \\textbf{Gewinnermittlungsart:} " +
                BaseDataHandler.getData("Unternehmen_Gewinnermittlungsart"));
        list.add("\\item \\textbf{Zuständiges Finanzamt:} " +
                BaseDataHandler.getData("Unternehmen_Zuständiges Finanzamt"));

        list.add("\\end{itemize}");
        //list.add("\\item Kurze Beschreibung des Unternehmens: Name, Sitz, Rechtsform, Branche, Geschäftszweck, Gewinnermittlungsart.");
        //\item [Kurze Beschreibung des Unternehmens: Name, Sitz, Rechtsform, Branche, Geschäftszweck, Gewinnermittlungsart].
        list.add("");

        // Branchenbesonderheiten
        list.add("\\item Es gelten die Besonderheiten der folgenden Gesetze: ");

        Map<Integer, List<String>> data;
        data = ExcelReader.readExcel(PATH_BRANCHENBESONDERHEITEN_FILE);
        String branchenbesonderheiten = ExcelReader.findTermInData(data, BaseDataHandler.getData("Unternehmen_Branche"));

        if (branchenbesonderheiten.equals("")) { // Errorandling, wenn Branche nicht im System ist
            branchenbesonderheiten = "??? (Branche nicht im System) ???";
        }
        list.add(branchenbesonderheiten);




        //list.add("\\item Beschreibung von evtl. Branchenbesonderheiten des Unternehmens in Bezug auf Aufbe-wahrung/Archivierung, z. B. Ärzte.");
        //\item [Beschreibung von evtl. Branchenbesonderheiten des Unternehmens in Bezug auf Aufbe-wahrung/Archivierung, z. B. Ärzte.]
        list.add("");

        list.add("\\item Je nach Unternehmensgröße Beschreibung der betroffenen Organisationseinheiten im Unternehmen. Im Unternehmen fallen Belege in folgenden Organisationseinheiten und Prozess-Schritten an:");
        //\item [Je nach Unternehmensgröße Beschreibung der betroffenen Organisationseinheiten im Unter-nehmen]. Im Unternehmen fallen Belege in folgenden Organisationseinheiten und Prozess-Schritten an:
        list.add("");

        list.add("\\begin{itemize}");
        list.add("\\item Organisationseinheit: Prozess-Schritt, z. B. Bearbeitung der Eingangspost");
        list.add("");
        list.add("\\item XXX");
        list.add("");
        list.add("\\end{itemize}");
        list.add("");
        list.add("\\end{enumerate}");
        list.add("");
        list.add("");
        list.add("");
        list.add("");


        return list;

    }
}
