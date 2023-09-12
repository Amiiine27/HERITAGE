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

    public void afficheEnseignantFlemmards(){
        for(Enseignant prof : effectif){
            if (prof.getHeureSupp()==0){
                System.out.println(prof.getNom()+" ayant l'identifiant " + prof.getId() + " n'a fais aucune heure complémentaire.");
            }
        }
    }

    public void afficheEnseignantAuDessusDeNheureSupp(int n){
        for(Enseignant prof : effectif){
            if (prof.getHeureSupp()>n){
                if (n==1) System.out.println(prof.getNom()+" ayant l'identifiant " + prof.getId() + " a fait plus de 1 heure complémentaire.");
                else System.out.println(prof.getNom()+" ayant l'identifiant " + prof.getId() + " a fait plus de " + n + " heures complémentaires.");
            }
        }
    }
}
