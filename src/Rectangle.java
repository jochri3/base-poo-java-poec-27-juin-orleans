public class Rectangle {
    private int longueur;
    private int largeur;

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
