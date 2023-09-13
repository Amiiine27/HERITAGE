public abstract class Interieur extends Enseignant{

    private int heuresDues;

    public Interieur(int heuresDues, String nom){
        super(nom);
        this.heuresDues = heuresDues;
    }

    @Override
    public int getHeureSupp() {
            int heureSupp = this.getHeure() - this.getHeuresDues();
            return heureSupp;

    }

    public int getHeuresDues() { return this.heuresDues;}
}
