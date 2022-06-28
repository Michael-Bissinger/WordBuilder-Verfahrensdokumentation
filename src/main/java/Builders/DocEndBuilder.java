package Builders;

import java.util.List;

public class DocEndBuilder {

    public static List<String> makeDocEnd (List<String> list) {

        list.add("");
        list.add("\\end{document}");

        return list;

    }

}
