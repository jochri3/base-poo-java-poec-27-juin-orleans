package heritage;

//DRY : Don't repeat yourself

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String name, int dureeDeVie, String arme) {
        super(name,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public String toString(){
        return String.format("Nom : %s\nDurée de vie : %d\nArme : %s\n\n",this.getName(),
                this.getDureeDeVie(),this.getArme());
    }

}
