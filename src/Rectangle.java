public class Rectangle {
    private int longueur;
    private int largeur;

    public Rectangle(int longueur,int largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

// Constructeur par défaut
    public Rectangle(){
        longueur=56;
        largeur=36;
    }

    public int getLongueur(){
        return longueur;
    }

    public int getLargeur(){
        return largeur;
    }

    public void setLongueur(int longueur){
        this.longueur=longueur;
    }

    public void setLargeur(int largeur){
        this.largeur=largeur;
    }

    public int calculSurface(){
        return longueur*largeur;
    }

    public int calculPerimetre(){
        return 2*(longueur+largeur);
    }
}
