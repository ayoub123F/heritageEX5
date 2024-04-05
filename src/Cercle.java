public class Cercle extends Figure {
    private double rayon;

    // Constructeur avec paramètres
    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    // Redéfinition de la méthode pour calculer l'aire du cercle
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    // Redéfinition de la méthode pour calculer le périmètre du cercle
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}
