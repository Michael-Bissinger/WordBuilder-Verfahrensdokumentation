import Builders.*;

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
        List<String> verzeichnisse = new ArrayList<>();
        List<String> vorbemerkungen = new ArrayList<>();
        List<String> zielsetzung_ueberblick = new ArrayList<>();
        List<String> organisation_sicherheit = new ArrayList<>();
        List<String> verfahren_massnahmen = new ArrayList<>();
        List<String> mitgeltende_unterlagen = new ArrayList<>();
        List<String> aenderungshistorie = new ArrayList<>();
        List<String> glossar = new ArrayList<>();
        List<String> doc_ende = new ArrayList<>();

        //List<String> lines = new ArrayList<>();

        System.out.println("File-Location ist: " + location);

        // Einzelne Abschnitte schreiben
        latex_dependencies = LaTexDependencyBuilder.makeDependencies(latex_dependencies);
        titelblatt = TitleBuilder.makeTitle(titelblatt);
        verzeichnisse = VerzeichnisseBuilder.makeVerzeichnisse(verzeichnisse);
        vorbemerkungen = VorbemerkungenBuilder.makeVorbemerkungen(vorbemerkungen);
        zielsetzung_ueberblick = UnternehmenOrganisationBuilder.makeUnternehmenOrganisation(zielsetzung_ueberblick);
        organisation_sicherheit = HardSoftwareBuilder.makeHardSoftware(organisation_sicherheit);
        verfahren_massnahmen = VerfahrenMassnahmenBuilder.makeVerfahrenMassnahmen(verfahren_massnahmen);
        mitgeltende_unterlagen = MitgeltendeUnterlagenBuilder.makeMitgeltendeUnterlagen(mitgeltende_unterlagen);
        aenderungshistorie = AenderungshistorieBuilder.makeAenderungshistorie(aenderungshistorie);
        glossar = GlossarBuilder.makeGlossar(glossar);


        doc_ende = DocEndBuilder.makeDocEnd(doc_ende);


        // lines zu finalem Dokument schreiben
        List<String> list_final;
        list_final = FinalBuilder.mergeLists(
                latex_dependencies,
                titelblatt,
                verzeichnisse,
                vorbemerkungen,
                zielsetzung_ueberblick,
                organisation_sicherheit,
                verfahren_massnahmen,
                mitgeltende_unterlagen,
                aenderungshistorie,
                glossar,
                doc_ende);

        System.out.println("FInale Liste:::::");
        System.out.println(list_final);


        DocumentFinalizer.writeContent(list_final);


    }
}