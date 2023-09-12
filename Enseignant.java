public abstract class Enseignant{

    private int id = 0;
    private String nom;

    public Enseignant(String nom) {
        this.id++;
        this.nom = nom;
    }

}
