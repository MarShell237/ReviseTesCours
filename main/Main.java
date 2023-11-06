﻿import static others_class.Action.*;
import static others_class.Choix.*;
import static others_class.Joueur.*;
import static others_class.Menu.*;

class Main{
    public static void main(String[] args){
        nomDuJeu();
        menuPrincipal();

        switch (optionMenuPrincipal()){
            case 1:
                menuDeJeu();
                int choixDuJoueurDuMenuJeu = optionMenuJeu();
                int scoreDuJouer = actionDuMenuJeu(choixDuJoueurDuMenuJeu);
                System.out.println("vous avez eu un total de "+scoreDuJouer+" réponses justes");

                menuDesMeilleursJoueurs();

                gameOver();
                break;
            case 2:
                menuD_Edition();
                int choixDuJoueurDuMenuEdition = optionMenuEdition();
                actionDuMenuEdition(choixDuJoueurDuMenuEdition);
                System.out.println("Edition terminée✅");
                break;
            case 3:
                gameOver();
                break;
        }
    }
}
