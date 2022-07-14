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

        // Listen mit [1] ermöglichen
        list.add("\\usepackage{enumerate}");
        list.add("");

        // %Kopf- und Fußzeile
        list.add("\\usepackage[");
        list.add("automark,");
        list.add("autooneside=false,");
        list.add("headsepline");
        list.add("]{scrlayer-scrpage}");
        list.add("");
        list.add("\\clearpairofpagestyles");
        list.add("\\ihead{\\leftmark}");
        list.add("\\ohead{\\ifstr{\\leftmark}{\\rightbotmark}{}{\\rightbotmark}}");
        list.add("\\ifoot*{Verfahrensdokumentation XXX}");
        list.add("\\usepackage{lastpage}");
        list.add("\\ofoot*{Seite \\thepage\\ / \\pageref{LastPage}}");
        list.add("\\renewcommand*\\chapterpagestyle{scrheadings}");
        list.add("");
        list.add("");
        list.add("");

        list.add("\\begin{document}");
        list.add("");


        return list;


        //latex_dependencies = ContentExtractor.getContent(latex_dependencies,
        //"\"Ressourcen\"Style\"latex_dependencies\"");


    }
}