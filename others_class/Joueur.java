package others_class;

import java.util.Scanner;

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


    public static void triSelection(Joueur[] tab){
        // programme qui realise le trie selection

        int n = tab.length;

        int i,j,k;
        Joueur tmp;

        for(i=0;i<n;i++){
            j=i;
            for(k=i+1;k<n;k++){
                if(tab[j].score < tab[k].score){
                    j=k;
                }
            }
            tmp=tab[i];
            tab[i]=tab[j];
            tab[j]=tmp;
        }
    }

   public static void menuDesMeilleursJoueurs(){

        System.out.println();
        System.out.println("$***************************$");
        System.out.println("*  Meilleurs scores         *");
        System.out.println("*                           *");

        for(int i=0;i<5;i++){
            System.out.println("   "+classement[i].nom+"     "+classement[i].score+"   ");
        }

        System.out.println("*                           *");
        System.out.println("$***************************$");
        System.out.println();
    }

    public static void writeClassement_To_file(String namepath, String scorepath) {
        //écrire le tableau classement dans des fichiers
        writeFile(namepath,classement[0].getNom(),false);
        writeFile(scorepath,Integer.toString(classement[0].getScore()),false);
        for (int i = 1; i <= 4; i++) {
            writeFile(namepath,classement[i].getNom(),true);
            writeFile(scorepath,Integer.toString(classement[i].getScore()),true);
        }
    }
}
