package heritage;

public class Magicien extends Personnage{
    private String baguetteMagique;

    public Magicien(String name, int dureeDeVie, String baguetteMagique) {
        super(name,dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public String toString(){
        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\n\n",
                this.getName(),
                this.getDureeDeVie(),this.getBaguetteMagique());
    }
}
