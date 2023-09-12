public class Main {
    public static void main(String[] args) throws HeureInvalide {

        Etablissement etab = new Etablissement();

        Interieur a = new Prag("Akhrib");
        a.ajoutHeure(340);
        etab.getEnseignants().add(a);

        Interieur b = new Maitre("Lamchichi");
        b.ajoutHeure(180);
        etab.getEnseignants().add(b);

        Interieur c = new Maitre("Turlupin");
        c.ajoutHeure(320);
        etab.getEnseignants().add(c);

        Interieur d = new Maitre("Blancbec");
        d.ajoutHeure(32);
        etab.getEnseignants().add(d);

        Exterieur e = new Exterieur("Kheroua");
        e.ajoutHeure(20);
        etab.getEnseignants().add(e);

        Exterieur f = new Exterieur("Shalom");
        f.ajoutHeure(650);
        etab.getEnseignants().add(f);

        etab.afficherEnseignants();
        etab.profAvecPlusHeures();


    }
}
