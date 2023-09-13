public class Exterieur extends Enseignant{

    public Exterieur(String nom) {
        super(nom);
    }

    @Override
    public int getHeureSupp() {
        int heureSupp = this.getHeure();
        return heureSupp;

    }
}
