public class Main {
    public static void main(String[] args) {
        // Création d'un cercle
        Cercle cercle = new Cercle("Cercle", 5.0);

        // Création d'un rectangle
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        // Affichage des détails du cercle
        cercle.afficherDetails();

        // Affichage des détails du rectangle
        rectangle.afficherDetails();
    }
}
