

public class Main {
    public static void main(String[] args) {
        System.out.println("Affichage Boeing 737 Max\n=====================");
        Avion boeing737Max=new Avion();
        boeing737Max.constructeur="Boeing";
        boeing737Max.nombreSieges=200;
        boeing737Max.longueur=70;
        System.out.printf("Constructeur : %s\nSieges : %d\nLongueur : %f\n",
                boeing737Max.constructeur,boeing737Max.nombreSieges,boeing737Max.longueur);

        System.out.println("Affichage Airbus 350F\n=====================");
        Avion airbus350f=new Avion();
        airbus350f.constructeur="AIrbus";
        airbus350f.nombreSieges=250;
        airbus350f.longueur=60;
        System.out.printf("Constructeur : %s\nSieges : %d\nLongueur : %f\n",
                airbus350f.constructeur,airbus350f.nombreSieges,airbus350f.longueur);
    }
}
