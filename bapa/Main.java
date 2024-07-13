public class Main {
    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna();
        pengguna.setId(1);
        pengguna.setUsername("username");
        pengguna.setPassword("password");
        pengguna.login();

        Tamu tamu = new Tamu();
        tamu.setId(2); // added setId method call
        tamu.setUsername("tamu"); // added setUsername method call
        tamu.setPassword("password"); // added setPassword method call
        tamu.menambahMasaAktif(10);
        tamu.hapus();
        tamu.login();

        Buku buku = new Buku("Judul Buku", 50000);
        buku.naikkanHarga();
        buku.naikkanHarga(10000);

        Komik komik = new Komik("Judul Komik", 30000, 5);
        komik.getVolume();
    }
}