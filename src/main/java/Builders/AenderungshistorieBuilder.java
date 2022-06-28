package Builders;

import java.util.List;

public class AenderungshistorieBuilder {

    public static List<String> makeAenderungshistorie (List<String> list) {

        list.add("\\chapter{Änderungshistorie}");
        list.add("\\label{sec:Änderungshistorie}");
        list.add("Bei einer Änderung der Verfahrensdokumentation wird die abgelöste Version unter ihrer eindeutigen Versionsnummer mit Angabe des Gültigkeitszeitraums bis zum Ablauf der Aufbewahrungsfrist archiviert.\\\\");
        list.add("Folgende Verfahrensdokumentationen liegen bereits vor:");
        list.add("");

        return list;

    }

}
