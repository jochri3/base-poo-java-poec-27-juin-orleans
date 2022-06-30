package inh;

//DRY : Don't repeat yourself

public class Guerrier {
    private String name;
    private String arme;
    private int dureeDeVie;

    public Guerrier(String name, String arme, int dureeDeVie) {
        this.name = name;
        this.arme = arme;
        this.dureeDeVie = dureeDeVie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }
}
