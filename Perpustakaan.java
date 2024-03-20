public abstract class Perpustakaan {

    protected String nama;

    public abstract void cariBuku(String judul);

    public void cariBuku(String judul, String kategori) {
        System.out.println("Mencari buku " + judul + " dengan kategori " + kategori);
    }

    public void pinjamBuku(String judul) {
        System.out.println("Meminjam buku " + judul + " secara reguler");
    }

    public void pinjamBuku(String judul, String jenisPeminjaman) {
    }

}