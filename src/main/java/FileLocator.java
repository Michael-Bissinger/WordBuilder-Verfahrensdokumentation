import java.util.Scanner;

public class FileLocator {

    public static String locateFile (){

        Scanner sc= new Scanner(System.in);

        System.out.println("Bitte Ordner der benötigten Dokumente eingeben! (Pfad kopieren aus Explorer)");
        String location = sc.nextLine();

        return location;

    }
}
