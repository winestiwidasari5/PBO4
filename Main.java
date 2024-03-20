abstract class Restoran {

    protected String nama;

    public abstract void cetakInformasi();

    public void tampilkanMenuSpesial() {
        System.out.println("Menu spesial: ...");
    }
}

class RestoranIndonesia extends Restoran {

    public RestoranIndonesia(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama restoran: " + nama);
        System.out.println("Jenis masakan: Indonesia");
    }

    @Override
    public void tampilkanMenuSpesial() {
        System.out.println("Menu spesial: Nasi Padang dengan Rendang");
    }
}

class RestoranJepang extends Restoran {

    public RestoranJepang(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama restoran: " + nama);
        System.out.println("Jenis masakan: Jepang");
    }

    @Override
    public void tampilkanMenuSpesial() {
        System.out.println("Menu spesial: Sushi dan Ramen");
    }
}

public class Main {

    public static void main(String[] args) {
        Restoran indonesia = new RestoranIndonesia("Warung Makan Nusantara");
        indonesia.cetakInformasi();
        indonesia.tampilkanMenuSpesial();

        Restoran jepang = new RestoranJepang("Sakura Sushi");
        jepang.cetakInformasi();
        jepang.tampilkanMenuSpesial();
    }
}
