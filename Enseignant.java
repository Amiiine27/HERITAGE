public abstract class Enseignant{

    private int id = 0, heure = 0, salaireHoraire = 40;
    private String nom;

    public Enseignant(String nom) {
        this.id++;
        this.nom = nom;
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

    public int getId() {
        return id;
    }

    public int getHeure() {
        return heure;
    }

    public int getSalaireHoraire() {
        return salaireHoraire;
    }

    public String getNom() {
        return nom;
    }
}
