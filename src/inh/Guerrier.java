package inh;

//DRY : Don't repeat yourself

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String name, String arme, int dureeDeVie) {
        super(name,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

}
