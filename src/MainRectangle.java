import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        Rectangle rect=new Rectangle();

        System.out.print("Entrez la longueur : ");
        int longueur=input.nextInt();
        rect.setLongueur(longueur);

        System.out.print("Entrez la largeur : ");
        int largeur=input.nextInt();
        rect.setLargeur(largeur);

        System.out.println("Longueur : "+rect.getLongueur());
        System.out.println("Largeur : "+rect.getLargeur());
        System.out.println("Périmètre : "+rect.calculPerimetre());
        System.out.println("Surface : "+rect.calculSurface());
    }
}
