package Builders;

import java.util.List;

public class MitgeltendeUnterlagenBuilder {

    public static List<String> makeMitgeltendeUnterlagen (List<String> list) {

        list.add("\\chapter{Mitgeltende Unterlagen}");
        list.add("");
        list.add("Über die in der vorliegenden Verfahrensdokumentation dargestellten Systeme und Prozesse hinaus gelten folgende Unterlagen, auf die z.T. im Text verwiesen wurde:");
        list.add("");

        return list;

    }

}
