package others_class;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static String[] readFile(String cheminDaccesDuFichier){
        String[] questions = new String[100];
        int i=0;
        try {
            File myObj = new File(cheminDaccesDuFichier);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                questions[i] = myReader.nextLine();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("⛔impossible de lire le fichier");
        }
        return questions;
    }
}
