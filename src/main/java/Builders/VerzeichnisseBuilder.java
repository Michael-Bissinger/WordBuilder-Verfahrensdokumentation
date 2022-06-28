package Builders;

import java.util.List;

public class VerzeichnisseBuilder {

    public static List<String> makeVerzeichnisse (List<String> list) {

        // Römische Zahlen, großgeschrieben
        list.add("\\pagenumbering{Roman}");

        // Inhaltsverzeichnis
        list.add("\\tableofcontents");
        list.add("\\thispagestyle{empty}");
        list.add("\\newpage");

        // Abildungsverzeichnis
        list.add("\\addcontentsline{toc}{chapter}{Abbildungsverzeichnis}");
        list.add("\\listoffigures");

        // Seiteneinstellungen
        list.add("\\pagenumbering{}"); //Römische Zahlen, großgeschrieben
        list.add("\\pagenumbering{arabic}");
        list.add("\\setcounter{page}{1}");
        list.add("");

        return list;

        }
}

