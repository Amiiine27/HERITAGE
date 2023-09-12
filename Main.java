public class Main {
    public static void main(String[] args) throws HeureInvalide {
        Interieur a = new Prag("Akhrib");
        a.ajoutHeure(340);

        Interieur b = new Maitre("Lamchichi");
        b.ajoutHeure(180);

        Interieur c = new Maitre("Turlupin");
        c.ajoutHeure(650);

        Interieur d = new Maitre("Blancbec");
        d.ajoutHeure(32);

        Exterieur e = new Exterieur("Kheroua");
        e.ajoutHeure(20);

        Exterieur f = new Exterieur("Shalom");
        f.ajoutHeure(65);


    }
}
