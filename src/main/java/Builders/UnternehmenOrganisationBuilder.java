package Builders;

import Helpers.BaseDataHandler;
import Helpers.ExcelReader;
import LaTexBuilders.LongTableBuilder;

import java.io.File;
import java.util.List;
import java.util.Map;

public class UnternehmenOrganisationBuilder {

    private static File PATH_BRANCHENBESONDERHEITEN_FILE = new File("Ressourcen/Rechtliches Wissen/Branchenbesonderheiten.xlsx");
    private static File PATH_MITARBEITER_DATA = new File("Ressourcen/_Testdaten/Datenbank_Testdaten_Mitarbeiter.xlsx");
    private static File PATH_ABTEILUNGEN_DATA = new File("Ressourcen/_Testdaten/Datenbank_Testdaten_Abteilungen.xlsx");

    public static List<String> makeUnternehmenOrganisation(List<String> list) {

        list.add("\\chapter{Unternehmen und Organisation}");
        list.add("");




        // Kapitel: Unternehmen und organisatorisches Umfeld
        list.add("");
        list.add("\\section{Allgemeine Angaben}");
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

        list.add("");
        list.add("\\item Handelsrechtlicher und steuerlicher Rahmen:");
        list.add("\\begin{itemize}");

        list.add("");
        list.add("\\item \\textbf{USt-ID-Nummer:} " +
                BaseDataHandler.getData("Unternehmen_USt-ID-Nummer"));
        list.add("\\item \\textbf{Steuernummer:} " +
                BaseDataHandler.getData("Unternehmen_Steuernummer"));
        list.add("");
        list.add("\\item \\textbf{Buchführungspflicht:} " +
                BaseDataHandler.getData("Unternehmen_Buchführungspflicht"));
        list.add("\\item \\textbf{Umsatzversteuerung:} " +
                BaseDataHandler.getData("Unternehmen_Umsatzversteuerung"));
        list.add("\\item \\textbf{Gewinnermittlungsart:} " +
                BaseDataHandler.getData("Unternehmen_Gewinnermittlungsart"));
        list.add("\\item \\textbf{Zuständiges Finanzamt:} " +
                BaseDataHandler.getData("Unternehmen_Zuständiges Finanzamt"));
        list.add("");

        list.add("\\end{itemize}");
        list.add("");



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

        // Unternehmenssruktur
        list.add("\\section{Unternehmensstruktur}");
        list.add("");

        // Abteilungen
        list.add("\\subsection{Abteilungen}");
        list.add("");

        String[] captions_abteilungen = {"Abteilung", "Leitung"};
        list = LongTableBuilder.startLongTable(list, captions_abteilungen);
        //list.add("\\begin{longtable} {|l|p{4,3cm}|}");
        //list.add("");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}}  \\\\ \\hline ");
        //list.add("\\endfirsthead");
        //list.add("");
        //list.add("\\multicolumn{2}{c}");
        //list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Abteilung}} & \\multicolumn{1}{l|}{\\textbf{Leitung}} \\\\ \\hline ");
        //list.add("\\endhead");
        //list.add("");
        //list.add("\\endfoot");
        //list.add("");
        //list.add("\\hline ");
        //list.add("\\endlastfoot");
        //list.add("");

        Map<Integer, List<String>> data_abteilungen;
        data_abteilungen = ExcelReader.readExcel(PATH_ABTEILUNGEN_DATA);

        for(int i=1;i<data_abteilungen.size();i++){
            System.out.println("Schreibe Abteilungen. Durchlauf " + i);

            list.add(data_abteilungen.get(i).get(1) + " & " +
                    data_abteilungen.get(i).get(3) + ", " +
                    data_abteilungen.get(i).get(2) + " \\\\ \\hline");
            //list.add("XXX & XXX & XXX & XXX  \\\\ \\hline");


        }

        list = LongTableBuilder.endLongTable(list);

        // Mitarbeiter
        list.add("\\subsection{Mitarbeiter}");
        list.add("");

        String[] captions_mitarbeiter = {"Nachname", "Vorname", "Berufsbezeichnung", "Abteilung"};
        list = LongTableBuilder.startLongTable(list, captions_mitarbeiter);
        //list.add("\\begin{longtable} {|l|l|l|p{4,3cm}|}");
        //list.add("");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Nachname}} & \\multicolumn{1}{l|}{\\textbf{Vorname}} & \t\t\\multicolumn{1}{l|}{\\textbf{Berufsbezeichnung}} & \\multicolumn{1}{l|}{\\textbf{Abteilung}} \\\\ \\hline ");
        //list.add("\\endfirsthead");
        //list.add("");
        //list.add("\\multicolumn{4}{c}");
        //list.add("{{ \\tablename\\ \\thetable{} -- weitergeführt von vorheriger Seite}} \\\\");
        //list.add("\\hline \\multicolumn{1}{|l|}{\\textbf{Nachname}} & \\multicolumn{1}{l|}{\\textbf{Vorname}} & \\multicolumn{1}{l|}{\\textbf{Berufsbezeichnung}} & \\multicolumn{1}{l|}{\\textbf{Abteilung}} \\\\ \\hline ");
        //list.add("\\endhead");
        //list.add("");
        //list.add("\\endfoot");
        //list.add("");
        //list.add("\\hline ");
        //list.add("\\endlastfoot");
        //list.add("");

        Map<Integer, List<String>> data_mitarbeiter;
        data_mitarbeiter = ExcelReader.readExcel(PATH_MITARBEITER_DATA);

        for(int i=1;i<data_mitarbeiter.size();i++){
            System.out.println("Schreibe Mitarbeiter. Durchlauf " + i);

            list.add(data_mitarbeiter.get(i).get(2) + " & " +
                    data_mitarbeiter.get(i).get(1) + " & " +
                    data_mitarbeiter.get(i).get(3) + " & " +
                    data_mitarbeiter.get(i).get(4) + " \\\\ \\hline");
            //list.add("XXX & XXX & XXX & XXX  \\\\ \\hline");


        }

        list = LongTableBuilder.endLongTable(list);

        // Organigram
        list.add("\\subsection{Organigram}");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        // Externe Geschäftspartner
        list.add("\\section{Externe Geschäftspartner}");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");


        return list;

    }
}
