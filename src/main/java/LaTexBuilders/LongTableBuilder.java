package LaTexBuilders;

import java.util.List;

public class LongTableBuilder {

    public static List<String> startLongTable (List<String> list, int columns) {

        System.out.println("Start longtable with " + columns + "columns.");

        return list;

    }

    public static List<String> endLongTable (List<String> list) {

        System.out.println("End longtable.");
        list.add("\\end{longtable}");
        list.add("");

        return list;

    }
}
