public class laptop extends komputer {
    private double berat;

    // Constructor
    public laptop() {
        super();
        System.out.println("Object Laptop telah diciptakan, constructor berjalan");
    }

    // Getter
    public double getBerat() {
        return this.berat;
    }

    // Setter
    public void setBerat(double berat) {
        this.berat = berat;
    }

    // Overriding method
    @Override
    public void nyalakan() {
        System.out.println("Laptop dinyalakan");
    }

    @Override
    public void matikan() {
        System.out.println("Laptop dimatikan");
    }
}
