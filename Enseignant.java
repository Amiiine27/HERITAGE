public abstract class Enseignant{

    private static int compteur = 0;
    private int id = 0;
    private int heure = 0, salaireHoraire = 40;
    private String nom;

    public Enseignant(String nom) {
        this.id = compteur;
        this.nom = nom;
        compteur++;
    }

    public void ajoutHeure(int heureArajouter) throws HeureInvalide {
        if (!(heureArajouter<0)){
            this.heure += heureArajouter;
        } else throw new HeureInvalide();
    }

    public int calculSommeDue(){
        int somme = (getHeureSupp() * salaireHoraire);
        return somme;
    }

    public int getHeureSupp(){
        if (this instanceof Interieur) {
            int heureSupp = this.heure - ((Interieur) this).getHeuresDues();
            return heureSupp;
        }
        return this.heure;
    }





    public String getNom() {
        return this.nom;
    }

    public int getId() {
        return id;
    }

    public int getHeure() {
        return heure;
    }

    public int getSalaireHoraire() {
        return salaireHoraire;
    }

}
