package others_class;

import java.util.Scanner;

import static others_class.Joueur.fillTableClassement;
import static others_class.Joueur.writeClassement_To_file;
import static others_class.ReadFile.readFile;
import static others_class.WriteFile.writeFile;
import static others_class.Choix.repondreParVraiOuFaux;

public class Action {
    public static int actionDuMenuJeu(int choixDuJouerDuMenuJeu){
        int score = 0;
        String[] questions = new String[100];
        String[] reponses = new String[100];
        String[] explications = new String[100];

        switch (choixDuJouerDuMenuJeu){
            case 1:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\questionAnglais.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\reponseAnglais.txt");
                explications=readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\explicationAnglais.txt");
                fillTableClassement("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\classement_nom.txt",
                        "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\classement_score.txt"
                );
                break;
            case 2:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\questionCryptographie.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\reponseCryptographie.txt");
                explications = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\explicationCryptographie.txt");
                fillTableClassement("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\classement_nom.txt",
                        "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\classement_score.txt"
                );
                break;
            case 3:
                questions = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\questionLanguageJAVA.txt");
                reponses = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\reponseLanguageJava.txt");
                explications = readFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\explicationLanguageJAVA.txt");
                fillTableClassement("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\classement_nom.txt",
                        "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\classement_score.txt"
                );
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
        switch (choixDuJouerDuMenuJeu){
            case 1:
                writeClassement_To_file("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\classement_nom.txt",
                                          "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\classement_score.txt"
                );
            case 2:
                writeClassement_To_file("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\classement_nom.txt",
                                          "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\classement_score.txt"
                );
            case 3:
                writeClassement_To_file("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\classement_nom.txt",
                                          "C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\classement_score.txt"
                );
        }
        return score;
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
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\questionAnglais.txt",
                            nouvelleQuestion,
                            true);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\reponseAnglais.txt",
                            reponseDeLaNouvelleQuestion,
                            true);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Anglais\\explicationAnglais.txt",
                        explicationDeLaNouvelleQuestion,
                            true);
                break;
            case 2:
                System.out.println("Enter la nouvelle question de cryptographie");
                nouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\questionCryptographie.txt",
                            nouvelleQuestion,
                            true);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\reponseCryptographie.txt",
                        reponseDeLaNouvelleQuestion,
                        true);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\Cryptographie\\explicationCryptographie.txt",
                        explicationDeLaNouvelleQuestion,
                        true);
                break;
            case 3:
                System.out.println("Enter la nouvelle question de langage JAVA");
                nouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\questionLanguageJAVA.txt",
                        nouvelleQuestion,
                        true);

                System.out.println("Entrer reponse juste 1 pour vrai et 2 pour faux");
                reponseDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\reponseLanguageJava.txt",
                        reponseDeLaNouvelleQuestion,
                        true);

                System.out.println("Entrer le message a afficher si la reponse a la question est incorrecte");
                explicationDeLaNouvelleQuestion = sc.nextLine();
                writeFile("C:\\Users\\chris\\OneDrive\\Bureau\\docs\\projetJava_V2.0\\TableDesMatieres\\LanguageJAVA\\explicationLanguageJAVA.txt",
                        explicationDeLaNouvelleQuestion,
                        true);
                break;

        }
    }

}
