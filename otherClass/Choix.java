package otherClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Choix {
    public static int optionMenuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        int compteur = 0;
        try{
            do {
                if (compteur > 0){
                    System.out.println("🛑warning:veuillez entrer une valeur comprise entre 1 et 3");
                    System.out.println();
                }

                System.out.println("⏩Veuillez choisir une option du menu principal:");
                choix = sc.nextInt();
                System.out.println();

                compteur++;
            }while (choix <1 || choix>3 );
        }
        catch (InputMismatchException e)
        {
            System.out.println();
            System.out.println("⛔Erreur de saisie:veuillez entrer une valeur entiere comprise entre 1 et 3");
            System.out.println();
            optionMenuPrincipal();
        }
        return choix;
    }

    public static int repondreParVraiOuFaux(){
        System.out.println();
        System.out.println();
        int reponse = 0;
        int compteur = 0;
        Scanner sc = new Scanner(System.in);

        try{
            do {
                if (compteur > 0){
                    System.out.println("🛑warning:veuillez choisir soit 1 soit 2");
                    System.out.println();
                }

                System.out.println("⏩appuyez sur 1 pour repondre vrai ou 2 pour repondre faux");
                reponse = sc.nextInt();

                compteur++;
            }while (reponse != 1 && reponse != 2);
        }
        catch (InputMismatchException e)
        {
            System.out.println();
            System.out.println("⛔Erreur de saisie:veuillez entrer une valeur entiere soit 1 soit 2");
            System.out.println();
            optionMenuPrincipal();
        }
        return reponse;
    }

    public static int optionMenuJeu(){
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        int compteur = 0;
        try{
            do {
                if (compteur > 0){
                    System.out.println("🛑warning:veuillez entrer une valeur entiere comprise entre 1 et 3");
                    System.out.println();
                }

                System.out.println("⏩Veuillez choisir une option du menu de jeu:");
                choix = sc.nextInt();
                System.out.println();

                compteur++;
            }while (choix <1 || choix>3);
        }
        catch (InputMismatchException e)
        {
            System.out.println();
            System.out.println("⛔Erreur de saisie:veuillez entrer une valeur entiere comprise entre 1 et 3");
            System.out.println();
            optionMenuPrincipal();
        }
        return choix;
    }

    public static int optionMenuEdition(){
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        int compteur = 0;
        try{
            do {
                if (compteur > 0){
                    System.out.println("🛑warning:veuillez entrer une valeur entiere comprise entre 1 et 3");
                    System.out.println();
                }

                System.out.println("⏩Veuillez choisir une option du menu d'edition:");
                choix = sc.nextInt();
                System.out.println();

                compteur++;
            }while (choix <1 || choix>3);
        }
        catch (InputMismatchException e)
        {
            System.out.println();
            System.out.println("⛔Erreur de saisie:veuillez entrer une valeur entiere comprise entre 1 et 3");
            System.out.println();
            optionMenuPrincipal();
        }
        return choix;
    }

}
