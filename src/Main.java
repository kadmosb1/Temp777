public class Main {

    public static int berekenKwadraat(int getal) {

        int kwadraat;
        kwadraat = getal * getal;
        return kwadraat;
    }

    public static void main(String[] args) {

        int getal = 4;
        System.out.println (berekenKwadraat(getal));
    }
}