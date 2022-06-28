package Builders;

import java.util.List;

public class VorbemerkungenBuilder {

    public static List<String> makeVorbemerkungen (List<String> list) {

        list.add("\\chapter{Vorbemerkungen zur Verfahrensdokumentation}");
        list.add("");
        list.add("XXXXX");
        list.add("");

        return list;

    }
}
