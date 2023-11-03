package others_class;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String cheminDaccesDuFichier, String newLine) {
        try {
            FileWriter myWriter = new FileWriter(cheminDaccesDuFichier);
            myWriter.write("\n"+newLine);
            myWriter.close();
            System.out.println("nouvelle ligne editer avec success");
        } catch (IOException e) {
            System.out.println("🛑impossible de lire dans le fichier");
        }
    }
}

