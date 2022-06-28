package Builders;

import java.util.List;

public class LaTexDependencyBuilder {

    public static List<String> makeDependencies (List<String> list) {

        list.add("\\documentclass[a4paper,fontsize=12pt,oneside,parskip=half,headings=normal, bibtotocnumbered]{scrreprt}");
        list.add("\\usepackage{german}");
        list.add("");

        // Font
        list.add("\\usepackage{helvet}");
        list.add("\\renewcommand{\\familydefault}{\\sfdefault}");
        list.add("");

        // Grafiken
        list.add("\\usepackage{graphicx}");
        list.add("");

        // Tabellen
        list.add("\\usepackage{longtable}"); // Damit lange Tabellen möglich sind
        list.add("");

        // Hyperlinks
        list.add("\\usepackage[hidelinks]{hyperref}");
        list.add("");

        list.add("\\begin{document}");
        list.add("");


        return list;


        //latex_dependencies = ContentExtractor.getContent(latex_dependencies,
        //"\"Ressourcen\"Style\"latex_dependencies\"");


    }
}