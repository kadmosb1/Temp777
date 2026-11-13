public class Main {

    public static int berekenDerdeMacht(int getal) {

        int kwadraat;
        kwadraat = getal * getal * getal;
        return kwadraat;
    }

    public static void main(String[] args) {

        int getal = 4;
        System.out.println (berekenDerdeMacht(getal));
    }
}