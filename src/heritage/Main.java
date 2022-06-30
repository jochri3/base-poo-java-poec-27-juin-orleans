package heritage;

public class Main {
    public static void main(String[] args) {
        Guerrier chris=new Guerrier("Christian Lisangola",200,"M16 A-4");
        Magicien iqra=new Magicien("Iqra",300,"BaguetteIqra");
        Sorcier imen=new Sorcier("Imen",400,"BaguetteImen","BatonImen");

        System.out.println(chris);
        System.out.println(iqra);
        System.out.println(imen);

    }
}
