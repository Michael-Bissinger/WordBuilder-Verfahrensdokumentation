import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        System.out.println("Ausgabe aus der main()-Methode");

        // Wo liegen die benötigten Dokumente?
        String location = FileLocator.locateFile();

        // Hier werden Zeilen für finalen Output gesammelt
        List<String> latex_dependencies = new ArrayList<>();
        List<String> titelblatt = new ArrayList<>();
        List<String> vorbemerkungen = new ArrayList<>();
        List<String> zielsetzung_ueberblick = new ArrayList<>();
        List<String> organisation_sicherheit = new ArrayList<>();
        List<String> verfahren_massnahmen = new ArrayList<>();
        List<String> mitgeltende_unterlagen = new ArrayList<>();
        List<String> aenderungshistorie = new ArrayList<>();
        //List<String> lines = new ArrayList<>();

        System.out.println("File-Location ist: " + location);

        // Auslesen Datei XYZ
        // Auslesen Datei BLABLA
        // Auslesen Datei FOO


        // lines zu finalem Dokument schreiben

        DocumentFinalizer.createOutputDoc();

        latex_dependencies = ContentExtractor.getContent(latex_dependencies,
                "\"Ressourcen\"Style\"latex_dependencies\"");


        DocumentFinalizer.writeContent(latex_dependencies);
        DocumentFinalizer.writeContent(titelblatt);




    }
}