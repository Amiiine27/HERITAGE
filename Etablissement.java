import java.util.ArrayList;
import java.util.Scanner;

public class Etablissement {

    /*
    Attribute
     */
    private ArrayList<Enseignant> effectif;

    /*
    Constructor
     */
    public Etablissement() {
        effectif  = new ArrayList<Enseignant>();
    }

    /*
    Methods
     */
    public int getHeuresSuppTotales(){
        int hsupp = 0;
        for (Enseignant prof : effectif){
            hsupp += prof.getHeureSupp();
        }
        return hsupp;
    }

    public int prixApayer(){
        return this.getHeuresSuppTotales()*40;
    }

    public void ajouterHeureSupp() throws HeureInvalide {
        Scanner sc = new Scanner(System.in);
        for (Enseignant prof : effectif){
            try {
                prof.ajoutHeure(sc.nextInt());
            }
            catch (HeureInvalide e){
                System.out.println("Heure Saisie Invalide");
            }

        }
    }
}
