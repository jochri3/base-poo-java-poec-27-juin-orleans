

public class Main {
    public static void main(String[] args) {
        System.out.println("Affichage Boeing 737 Max\n=====================");
        Avion boeing737Max=new Avion();
        boeing737Max.setConstructeur("Boeing");
        boeing737Max.setNombreSieges(200);
        boeing737Max.setLongueur(70);
        System.out.printf("Constructeur : %s\nSieges : %d\nLongueur : %f\n",
                boeing737Max.getConstructeur(),boeing737Max.getNombreSieges(),
                boeing737Max.getLongueur());

        System.out.println("Affichage Airbus 350F\n=====================");
        Avion airbus350f=new Avion();
        airbus350f.setConstructeur("Airbus");
        airbus350f.setNombreSieges(250);
        airbus350f.setLongueur(60);
        System.out.printf("Constructeur : %s\nSieges : %d\nLongueur : %f\n",
                airbus350f.getConstructeur(),airbus350f.getNombreSieges(),airbus350f.getLongueur());
    }
}
