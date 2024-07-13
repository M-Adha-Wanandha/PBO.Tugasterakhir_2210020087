public class pengguna {
    private int id;
    private String username;
    private String password;

    public pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public void login() {
        System.out.println("Ini method untuk login");
    }

    public void lupaPassword() {
        System.out.println("(Ini method Lupa Password)");
    }

    public void daftar() {
        System.out.println("(Ini method untuk daftar)");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }

    public void hapusByUsername(String username) {
        System.out.println("DELETE FROM pengguna WHERE username='" + username + "'");
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini method untuk Login menggunakan Google");
    }
}
