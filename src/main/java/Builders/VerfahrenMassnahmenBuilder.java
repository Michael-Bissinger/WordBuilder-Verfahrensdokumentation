package Builders;

import java.util.List;

public class VerfahrenMassnahmenBuilder {

    public static List<String> makeVerfahrenMassnahmen (List<String> list) {

        list.add("\\chapter{Verfahren und Maßnahmen}");
        list.add("");
        list.add("XXXXX");
        list.add("");
        list.add("\\section{Zuständigkeiten}");
        list.add("");
        list.add("XXX");
        list.add("");
        list.add("\\section{Organisation und Internes Kontrollsystem (IKS)}");
        list.add("");
        list.add("XXX");
        list.add("");

        return list;

    }

}
