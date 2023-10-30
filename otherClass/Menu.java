package otherClass;
import java.util.InputMismatchException;
import java.util.Scanner;

import static otherClass.ReadFile.readFile;
import static otherclass.WriteFile.writeFile;

public class Menu {

    public static void nomDuJeu(){
        System.out.println();
        System.out.println();
        System.out.println("******************************************************************************************************");
        System.out.println("*                           01110                                                                    *");
        System.out.println("*                          1111                                                                      *");
        System.out.println("*  11111111111010     11111111111111  11110       01110 01111    01011001111     011111111111111     *");
        System.out.println("*  1000111111000001   000011111111111 10001       10001 10000   11001011100011   100001111111111     *");
        System.out.println("*  00001      10001   10000           10001       10001 10001  010010    00111   10001               *");
        System.out.println("*  00001      11011   10101           01101       00011 11111  011101            11000               *");
        System.out.println("*  0000101111010001   10001111111111   00001     00010  10001   000010101110     10001111111111      *");
        System.out.println("*  000000000000111    10000000000001    010011  01001   10001    0001000000110   10000000000001      *");
        System.out.println("*  0000011010011      10001111111110     10001 10001    10001         011110001  10000011111111      *");
        System.out.println("*  00001   0100011    10000               100000001     10001  10000      10001  10001               *");
        System.out.println("*  10001     1100000  000001111111111      1000001      10000   100011111100010  100011111111111     *");
        System.out.println("*  10000      010000  000000000000011       10001       01000    011011111101    100000000000011     *");
        System.out.println("*                                                                                                    *");
        System.out.println("* 10000000000000000000000000001    010000000000000000000000011         0111011000001111011           *");
        System.out.println("* 10000000000000000000000000000    100000000000000000000000001       00100000000000000000011         *");
        System.out.println("* 10000000000000000000000000001    100000000000000000000000000      11000000010111010000000010       *");
        System.out.println("*            10000001              10000000                        0100000111       1000000001       *");
        System.out.println("*            10000001              10000000                        10000001           100000010      *");
        System.out.println("*            10000001              10000001                        100000000111                      *");
        System.out.println("*            10000001              10000001111111111111111110       1000000000010111101              *");
        System.out.println("*            10000001              10000000000000000000000001        0100000000000000001101          *");
        System.out.println("*            10000001              10000000000000000000000001          11110000000000000000110       *");
        System.out.println("*            10000001              10000001111111111111111111                111101000000000011      *");
        System.out.println("*            10000001              10000001                                          1100000000      *");
        System.out.println("*            10000001              10000000                       10011101             000000001     *");
        System.out.println("*            10000001              10000000                       000000001            100000000     *");
        System.out.println("*            10000001              1000000111111111111111111110    1000000001         100000000      *");
        System.out.println("*            10000001              1000000000000000000000000000     11000000000111110000000001       *");
        System.out.println("*            10000001              1000000000000000000000000001      1000000000000000000011          *");
        System.out.println("*            01111110              1111111111111111111111111111         110101111111101110           *");
        System.out.println("*                                                                                                    *");
        System.out.println("*       001111111           111111111       01110      01110   01111111111101         111111111      *");
        System.out.println("*    11100000000100     011000000000110     10000      10001   0000000000000011     1100000000001    *");
        System.out.println("*  01000111001100010   11000111001010001    10001      10001   00001111111110000   10000    110001   *");
        System.out.println("*  10001       11010  100010        10001   10001      10001   00000       10000   10000             *");
        System.out.println("* 00001               10001         100001  10001      10001   00001111111100011   1100000111011     *");
        System.out.println("* 10000               00001         010000  10001      10001   000000000000111       1110100000011   *");
        System.out.println("* 100001       11100  00001         100010  00000      10001   00001110110010                 10000  *");
        System.out.println("*  100000     010001   100011      100001   100010     10000   00000     100011   100011     010001  *");
        System.out.println("*   110001111100011     1000011110000001     00001111110001    00001      100001   100000111100000   *");
        System.out.println("*     110100010110        110100011110        110100001011     10111       111111   1111100011110    *");
        System.out.println("*                                                                                                    *");
        System.out.println("******************************************************************************************************");
        System.out.println();
        System.out.println();
    }

    public static void menuPrincipal(){
        System.out.println();
        System.out.println("@*********************@");
        System.out.println("*    MENU PRINCIPAL   *");
        System.out.println("*                     *");
        System.out.println("*     1️⃣ Jouer        *");
        System.out.println("*     2️⃣ Éditer🆕     *");
        System.out.println("*     3️⃣ Quitter🔚    *");
        System.out.println("*                     *");
        System.out.println("@*********************@");
        System.out.println();
    }

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

    public static void menuDeJeu(){

        System.out.println();
        System.out.println("@******************************@");
        System.out.println("*         MENU DE JEU          *");
        System.out.println("*                              *");
        System.out.println("*      1️⃣Anglais               *");
        System.out.println("*      2️⃣Cryptographie         *");
        System.out.println("*      3️⃣LanguageJAVA          *");
        System.out.println("*                              *");
        System.out.println("@******************************@");
        System.out.println();
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

    public static int actionDuMenuJeu(int choixDuJouerDuMenuJeu){
        int score = 0;
       String[] questions = new String[100];
       String[] reponses = new String[100];
       String[] explications = new String[100];

        switch (choixDuJouerDuMenuJeu){
            case 1:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\questionAnglais.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\reponseAnglais.txt");
                explications=readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\explicationAnglais.txt");
                break;
            case 2:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\questionCryptographie.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\reponseCryptographie.txt");
                explications = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\explicationCryptographie.txt");
                break;
            case 3:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\questionLanguageJAVA.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\reponseLanguageJava.txt");
                explications = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\explicationLanguageJAVA.txt");
                break;
        }

        System.out.println("***************************");
        System.out.println("*  Commencons a jouer!😁  *");
        System.out.println("***************************");


        int reponseDuJouer = 0;
        for (int i=0; i < 100; i++){
            if (questions[i] != null){
                System.out.println();
                System.out.println("*           #️⃣qusetion❔            *");
                System.out.println("*************************************");
                System.out.println(questions[i]);
                reponseDuJouer = repondreParVraiOuFaux();

                if (reponseDuJouer == Integer.parseInt(reponses[i])){
                    System.out.println("✅Reponse Correcte!");
                    System.out.println();
                    score++;
                }
                else
                {
                    System.out.println("❌Reponse incorrecte");
                    System.out.println();
                    System.out.println("*        🔠Explications        *");
                    System.out.println("********************************");
                    System.out.println(explications[i]);
                    System.out.println();
                }
            }
            else
            {
                break;
            }
        }
        return score;
    }

    public static void menuD_Edition(){

        System.out.println();
        System.out.println("@******************************@");
        System.out.println("*         MENU D'EDITION       *");
        System.out.println("*                              *");
        System.out.println("*          1️⃣Anglais          *");
        System.out.println("*          2️⃣Cryptographie     *");
        System.out.println("*          3️⃣LanguageJAVA      *");
        System.out.println("*                              *");
        System.out.println("@******************************@");
        System.out.println();
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


    public static void actionDuMenuEdition(int choixDuJoueurMenuEditer){
       Scanner sc = new Scanner(System.in);
        String nouvelleQuestion = "";
        String reponseDeLaNouvelleQuestion = "";
        String explicationDeLaNouvelleQuestion = "";
        switch (choixDuJoueurMenuEditer){
            case 1:
                System.out.println("Enter la nouvelle question D'anglais");
                nouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\questionAnglais.txt",nouvelleQuestion);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\reponseAnglais.txt",reponseDeLaNouvelleQuestion);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Anglais\\explicationAnglais.txt",explicationDeLaNouvelleQuestion);
                break;
            case 2:
                System.out.println("Enter la nouvelle question de cryptographie");
                nouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\questionCryptographie.txt",nouvelleQuestion);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\reponseCryptographie.txt",reponseDeLaNouvelleQuestion);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\explicationCryptographie.txt",explicationDeLaNouvelleQuestion);
                break;
            case 3:
                System.out.println("Enter la nouvelle question de langage JAVA");
                nouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\questionLanguageJAVA.txt",nouvelleQuestion);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\reponseLanguageJava.txt",reponseDeLaNouvelleQuestion);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\explicationLanguageJAVA.txt",explicationDeLaNouvelleQuestion);
                break;

        }
    }

    public static void gameOver(){
        System.out.println();
        System.out.println();
        System.out.println("***********************");
        System.out.println("*      GAME OVER      *");
        System.out.println("***********************");
        System.out.println();
        System.out.println();
    }

}