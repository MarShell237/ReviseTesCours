package others_class;

import java.util.Scanner;

import static java.util.Arrays.sort;
import static others_class.ReadFile.readFile;
import static others_class.WriteFile.writeFile;

public class Joueur {
    private final String nom;
    private int score;

    public static Joueur[] classement = new Joueur[6];

    public static void fillTableClassement(String namePath, String scorepath){
        String[] names = readFile(namePath);
        String[] scores = readFile(scorepath);
       for (int i=0; i<=4; i++){
           int tamponScore = Integer.parseInt(scores[i]);
           classement[i] = new Joueur(names[i],tamponScore);
       }
    }


    public Joueur(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    public Joueur(){
        this.nom = "";
        this.score = 0;
    }


    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }



   public static void insertNewRecord_To_Classement(int scoreNouveauJouer){

       Scanner sc = new Scanner(System.in);

       System.out.println("▶veuillez entrer votre nom:");
       String nomNouveauJoueur = sc.nextLine();

       classement[5] = new Joueur(nomNouveauJoueur,scoreNouveauJouer);
       System.out.println();

        sort(classement);

        System.out.println();
        System.out.println("$***************************$");
        System.out.println("*  Meilleurs scores         *");
        System.out.println("*                           *");

        for(int i=5;i>0;i--){
            System.out.println("   "+classement[i].nom+"     "+classement[i].score+"   ");
        }

        System.out.println("*                           *");
        System.out.println("$***************************$");
        System.out.println();
    }

    public static void writeClassement_To_file(String namepath, String scorepath) {
        //ecrire le tableau classement dans des fichiers
        writeFile(namepath,classement[0].getNom(),false);
        writeFile(scorepath,Integer.toString(classement[0].getScore()),false);
        for (int i = 1; i <= 4; i++) {
            writeFile(namepath,classement[i].getNom(),true);
            writeFile(scorepath,Integer.toString(classement[i].getScore()),true);
        }
    }
}
