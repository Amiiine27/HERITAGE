public abstract class Enseignant{

    private int id = 0, heure = 0;
    private String nom;

    public Enseignant(String nom) {
        this.id++;
        this.nom = nom;
    }

    public void ajoutHeure(int heureArajouter) throws HeureInvalide {
        /*try {
            this.heure += heureArajouter;
        }
        catch (HeureInvalide e){
            System.out.println("Nombre d'heures à rajouter");
        }*/

        if (!(heureArajouter<0)){
            this.heure += heureArajouter;
        } else throw new HeureInvalide();
    }

}
