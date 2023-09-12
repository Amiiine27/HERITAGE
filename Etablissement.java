import java.util.ArrayList;

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
        for (Enseignant profs : effectif){
            hsupp += profs.getHeureSupp();
        }
        return hsupp;
    }

    public int prixApayer(){
        return this.getHeuresSuppTotales()*40;
    }
}
