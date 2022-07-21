package Builders;

import Helpers.BaseDataHandler;

import java.util.List;

public class HardSoftwareBuilder {

    public static List<String> makeHardSoftware(List<String> list) {

        list.add("\\chapter{Hard- und Software}");
        list.add("");
        list.add("\\section{Hardware}");
        list.add("");
        list.add("XXX");
        list.add("");
        list.add("\\subsection{Überblick Hardware}");
        list.add("");
        list.add("Folgende Hardware ist bei " + BaseDataHandler.getData("Unternehmen_Name") + " im Einsatz:");
        list.add("");
        list.add("\\section{Software}");
        list.add("");
        list.add("XXX");
        list.add("");
        list.add("\\subsection{Überblick Software}");
        list.add("");
        list.add("Folgende Software ist bei " + BaseDataHandler.getData("Unternehmen_Name") + " im Einsatz:");


        list.add("\\section{Datenschutz}");
        list.add("");
        list.add("XXX");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        return list;

    }
}
