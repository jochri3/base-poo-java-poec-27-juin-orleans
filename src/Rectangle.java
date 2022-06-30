public class Rectangle {
    private int largeur;
    private int longueur;
    void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    void setLongueur(int longueur) {
        this.longueur = longueur;
    }
    int périmètre() {
        return 2 * (largeur + longueur);
    }
    int surface() {
        return largeur * longueur;
    }
}
