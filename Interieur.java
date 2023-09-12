public abstract class Interieur extends Enseignant{

    private int heuresDues;

    public Interieur(int heuresDues, String nom){
        super(nom);
        this.heuresDues = heuresDues;
    }

    public int getHeuresDues() { return this.heuresDues;}
}
