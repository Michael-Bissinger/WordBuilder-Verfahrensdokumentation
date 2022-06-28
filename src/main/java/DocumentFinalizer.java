import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DocumentFinalizer {

    public static void createOutputDoc() {

        // LaTex-Datei erstellen
        // https://www.w3schools.com/java/java_files_create.asp
        try {
            File docu_output = new File("docu_output.tex"); //TODO: Relativen Pfad machen
            if (docu_output.createNewFile()) {
                System.out.println("Finale Datei erstellt: " + docu_output.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeContent(List<String> lines){

        // Alle lines Zeile für Zeile in Datei schreiben
        // https://stackoverflow.com/questions/50257374/how-do-i-write-multiple-lines-to-a-text-file-in-java#:~:text=%22%5Cr%5Cn%22%20%2D,line%20separator%20for%20Windows%20systems.

        try (FileWriter fstream = new FileWriter("docu_output.tex");
             BufferedWriter info = new BufferedWriter(fstream)) {
            for (int i = 0; i < lines.size(); i++) {
                info.write(String.format("Hello%n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (FileWriter fstream = new FileWriter("docu_output.tex");
             BufferedWriter info = new BufferedWriter(fstream)) {
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Durchlauf: " + i);
                info.write(String.format(lines.get(i).toString()+ "%n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
