public abstract class Figure {
    protected String nom;

    // Constructeur avec paramètre
    public Figure(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite pour calculer l'aire de la figure
    public abstract double calculerAire();

    // Méthode abstraite pour calculer le périmètre de la figure
    public abstract double calculerPerimetre();

    // Méthode pour afficher les détails de la figure
    public void afficherDetails() {
        System.out.println("Nom de la figure : " + nom);
        System.out.println("Aire : " + calculerAire());
        System.out.println("Périmètre : " + calculerPerimetre());
    }
}
