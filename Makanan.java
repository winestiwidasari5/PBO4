public class Makanan {

    protected String nama;

    public static double hitungKalori(double gram, double kaloriPerGram) {
        return gram * kaloriPerGram;
    }

    public static double hitungKalori(int porsi, double kaloriPerPorsi) {
        return porsi * kaloriPerPorsi;
    }

    public static void main(String[] args) {
        System.out.println("Kalori 100 gram nasi (130 kalori/gram): " + hitungKalori(100, 130));
        System.out.println("Kalori 1 porsi ayam goreng (300 kalori/porsi): " + hitungKalori(1, 300));
    }
}
