import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        System.out.println("Ausgabe aus der main()-Methode");

        // Wo liegen die benötigten Dokumente?
        String location = FileLocator.locateFile();

        // Hier werden Zeilen für finalen Output gesammelt
        List<String> latex_dependencies = new ArrayList<>();
        List<String> lines = new ArrayList<>();

        System.out.println("File-Location ist: " + location);

        // Auslesen Datei XYZ
        // Auslesen Datei BLABLA
        // Auslesen Datei FOO


        // lines zu finalem Dokument schreiben

        DocumentFinalizer.createOutputDoc();

        DocumentFinalizer.writeContent(latex_dependencies);
        DocumentFinalizer.writeContent(lines);




    }
}