public class Buku {
    private String judul;
    private String pengarang;
    private int harga;

    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga: " + harga);
    }

    public void naikkanHarga(int kenaikan) {
        harga += kenaikan;
    }

    public int getHarga() {
        return harga;
    }
}

