public class Bebas {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Belajar Java", "Eko", 50000);
        buku1.displayInfo();
        buku1.naikkanHarga(5000);
        System.out.println("Harga setelah kenaikan: " + buku1.getHarga());

        System.out.println();

        Komik komik1 = new Komik("One Piece", "Oda", 30000, 95);
        komik1.displayInfo();
        komik1.naikkanHarga(5000);
        System.out.println("Harga setelah kenaikan: " + komik1.getHarga());
    }
}