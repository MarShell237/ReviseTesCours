import static otherClass.Action.actionDuMenuEdition;
import static otherClass.Action.actionDuMenuJeu;
import static otherClass.Choix.*;
import static otherClass.Menu.*;

class Main{
    public static void main(String[] args){
        nomDuJeu();
        menuPrincipal();

        switch (optionMenuPrincipal()){
            case 1:
                menuDeJeu();
                int choixDuJoueurDuMenuJeu = optionMenuJeu();
                int scoreDuJouer = actionDuMenuJeu(choixDuJoueurDuMenuJeu);
                System.out.println("vous avez eu un total de "+scoreDuJouer+" reponses justes");
                gameOver();
                break;
            case 2:
                menuD_Edition();
                int choixDuJoueurDuMenuEdition = optionMenuEdition();
                actionDuMenuEdition(choixDuJoueurDuMenuEdition);
                System.out.println("Edition terminee✅");
                break;
            case 3:
                gameOver();
                break;
        }
    }
}