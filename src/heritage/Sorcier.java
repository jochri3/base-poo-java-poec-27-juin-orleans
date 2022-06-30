package heritage;

public class Sorcier extends Magicien{
    private String batonMagique;

    public Sorcier(String name, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(name, dureeDeVie, baguetteMagique);
        this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    public String toString(){
        return String.format("Nom : %s\nDurée de vie : %d\nBaguette : %s\nBaton : %s\n\n"
                ,this.getName(),
                this.getDureeDeVie(),this.getBaguetteMagique(),this.getBatonMagique());
    }
}
