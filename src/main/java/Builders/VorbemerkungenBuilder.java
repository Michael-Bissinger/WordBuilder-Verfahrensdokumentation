package Builders;

import java.util.List;

public class VorbemerkungenBuilder {

    public static List<String> makeVorbemerkungen (List<String> list) {

        list.add("\\chapter{Vorbemerkungen zur Verfahrensdokumentation}");
        list.add("");
        list.add("\\begin{enumerate}[{[1]}]");
        list.add("");
        list.add("\\item Sämtliche Ausführungen und Änderungen der Verfahrensdokumentation unterliegen der Genehmigungspflicht der Geschäftsleitung, namentlich [Vorstand, Geschäftsführer, Inhaber].");
        list.add("");
        list.add("\\item Die vorliegende Verfahrensdokumentation wurde von der Geschäftsleitung am [Datum] von [Name] freigegeben, trägt die Versionsbezeichnung [Bezeichnung] und gilt bis zu einer Aktualisierung ab [Datum].");
        list.add("");
        list.add("\\item Die vorliegende Verfahrensdokumentation ersetzt die bis dahin geltende Verfahrensdokumentation [Versionsbezeichnung]. Eine Übersicht der vorgenommenen Aktualisierungen findet sich in Kapitel [6].");
        list.add("");
        list.add("\\end{enumerate}");
        list.add("");




        return list;

    }
}

