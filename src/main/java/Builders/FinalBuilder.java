package Builders;

import java.util.ArrayList;
import java.util.List;

public class FinalBuilder {

    private static Integer NUMBER_RUNS = 11; // Anzahl Durchläufe

    public static List<String> mergeLists (List<String> latex_dependencies,
                                           List<String> titelblatt,
                                           List<String> verzeichnisse,
                                           List<String> vorbemerkungen,
                                           List<String> zielsetzung_ueberblick,
                                           List<String> organisation_sicherheit,
                                           List<String> verfahren_massnahmen,
                                           List<String> mitgeltende_unterlagen,
                                           List<String> aenderungshistorie,
                                           List<String> glossar,
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
                    list_transfer = vorbemerkungen;
                    System.out.print("vorbemerkungen");
                    break;
                case 4:
                    list_transfer = zielsetzung_ueberblick;
                    System.out.print("zielsetzung_ueberblick");
                    break;
                case 5:
                    list_transfer = organisation_sicherheit;
                    System.out.print("organisation_sicherheit");
                    break;
                case 6:
                    list_transfer = verfahren_massnahmen;
                    System.out.print("verfahren_massnahmen");
                    break;
                case 7:
                    list_transfer = mitgeltende_unterlagen;
                    System.out.print("mitgeltende_unterlagen");
                    break;
                case 8:
                    list_transfer = aenderungshistorie;
                    System.out.print("aenderungshistorie");
                    break;
                case 9:
                    list_transfer = glossar;
                    System.out.print("glossar");
                    break;
                case 10:
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
