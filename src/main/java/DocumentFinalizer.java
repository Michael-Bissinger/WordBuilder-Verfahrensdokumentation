import java.io.File;
import java.io.IOException;
import java.util.List;

public class DocumentFinalizer {

    public static void writelines (List<String> lines){

        // TODO: LaTex-Datei erstellen
        try {
            File docu_output = new File("docu_output.tex");
            if (docu_output.createNewFile()) {
                System.out.println("Finale Datei erstellt: " + docu_output.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // TODO: Alle lines Zeile für Zeile in Datei schreiben


    }

}
