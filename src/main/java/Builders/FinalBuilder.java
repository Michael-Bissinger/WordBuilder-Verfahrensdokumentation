package Builders;

import java.util.ArrayList;
import java.util.List;

public class FinalBuilder {

    private static Integer NUMBER_RUNS = 4; // Anzahl Durchläufe

    public static List<String> mergeLists (List<String> latex_dependencies,
                                           List<String> titelblatt,
                                           List<String> verzeichnisse,
                                           List<String> doc_ende) {

        List<String> list_final = new ArrayList<>();

        for (int r = 0; r < NUMBER_RUNS; r++) {
            System.out.println("--- Finalisierung Abschnitt: " + (r+1) + " ---");

            List<String> list_transfer = new ArrayList<>();

            switch(r){
                case 0:
                    list_transfer = latex_dependencies;
                    System.out.print("latex_dependencies");
                    break;
                case 1:
                    list_transfer = titelblatt;
                    System.out.print("titelblatt");
                    break;
                case 2:
                    list_transfer = verzeichnisse;
                    System.out.print("verzeichnisse");
                    break;
                case 3:
                    list_transfer = doc_ende;
                    System.out.print("doc_ende");
                    break;
            }

            System.out.println(" wird jetzt finalisiert:");
            System.out.println(list_transfer);

            for (int i = 0; i < list_transfer.size(); i++) {
                System.out.println("Finalisierung Abschnitt: " + (r+1) + " Zeile: " + (i+1));
                list_final.add(list_transfer.get(i));
            }

        }






        System.out.println("FInale Liste:::::");
        System.out.println(list_final);

        return list_final;

    }
}
