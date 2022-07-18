package Builders;

import Helpers.BaseDataHandler;

import java.io.File;
import java.util.List;

public class VorbemerkungenBuilder {

    public static List<String> makeVorbemerkungen (List<String> list) {

        list.add("\\chapter{Vorbemerkungen zur Verfahrensdokumentation}");
        list.add("");
        list.add("\\begin{enumerate}[{[1]}]");
        list.add("");
        list.add("\\item Sämtliche Ausführungen und Änderungen der Verfahrensdokumentation unterliegen der Genehmigungspflicht der Geschäftsleitung, namentlich " + BaseDataHandler.getData("Geschäftsführung_Vorname") + " " + BaseDataHandler.getData("Geschäftsführung_Nachname") +".");
        list.add("");
        list.add("\\item Die vorliegende Verfahrensdokumentation wurde von der Geschäftsleitung am " + BaseDataHandler.getData("Doku_Stand_Datum") + " von " + BaseDataHandler.getData("Geschäftsführung_Vorname") + " " + BaseDataHandler.getData("Geschäftsführung_Nachname") + " freigegeben, trägt die Versionsbezeichnung " + BaseDataHandler.getData("Doku_Versionsnummer") + " und gilt bis zu einer Aktualisierung ab " + BaseDataHandler.getData("Doku_Stand_Datum") + ".");
        list.add("");
        list.add("\\item Die vorliegende Verfahrensdokumentation ersetzt die bis dahin geltende Verfahrensdokumentation [Versionsbezeichnung]. Eine Übersicht der vorgenommenen Aktualisierungen findet sich in Kapitel \\ref{sec:Änderungshistorie}.");
        // TODO: Bisherige Versionsnummer muss gepflegt werden
        list.add("Alle gegebenenfalls zuvor erstellten Verfahrensdokumentationen werden archiviert, sind ansonsten aber veraltet und somit ungültig.");
        list.add("");
        list.add("\\end{enumerate}");
        list.add("");




        return list;

    }
}

