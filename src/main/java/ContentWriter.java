import java.util.List;
import java.util.Scanner;

public class ContentWriter {



    public static List<String> addline (List<String> lines, String line_original){ //TODO:Noch durch String-Liste ersetzen

        String line_neu = parseToLaTex(line_original);

        //TODO: line_neu zu lines hinzufügen

        return lines;

    }

    public static String parseToLaTex (String line){

        // Sonderzeichen durch LaTex-Zeichen ersetzen

        return line;

    }

}
