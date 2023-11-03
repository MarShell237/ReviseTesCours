package others_class;
public class Joueur {
    private final String nom;
    private int score;

    static Joueur[] classement = new Joueur[6];

//    void
//    {
//            new Joueur("joueur1",0),
//            new Joueur("joueur2",0),
//            new Joueur("joueur3",0),
//            new Joueur("joueur4",0),
//            new Joueur("joueur5",0),
//            new Joueur("joueurTampon",0)
//    };



    public Joueur(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }


    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    static Joueur[] triSelection(Joueur[] tab){
        // programme qui realise le trie selection

        int n = tab.length;

        int i,j,k;
        Joueur tmp;

        for(i=0;i<n;i--){
            j=i;
            for(k=i+1;k<n;k++){
                if(tab[j].score > tab[k].score){
                    j=k;
                }
            }
            tmp=tab[i];
            tab[i]=tab[j];
            tab[j]=tmp;
        }
        return tab;
    }
    void insertNewRecord_To_Classement(Joueur nouveauRecord){

        classement[5] = nouveauRecord;

        classement = triSelection(classement);

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

    void writeClassement_To_file(){
        //ecrire le tableau dans le fichier meilleursScore
    }
}
