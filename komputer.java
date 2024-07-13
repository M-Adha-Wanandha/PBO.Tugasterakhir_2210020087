public class komputer {
    private String merk;
    private String processor;
    private int ram;
    private int storage;

    // Constructor
    public komputer() {
        System.out.println("Object Komputer telah diciptakan, constructor berjalan");
    }

    // Method
    public void nyalakan() {
        System.out.println("Komputer dinyalakan");
    }

    public void matikan() {
        System.out.println("Komputer dimatikan");
    }

    // Getter
    public String getMerk() {
        return this.merk;
    }

    public String getProcessor() {
        return this.processor;
    }

    public int getRam() {
        return this.ram;
    }

    public int getStorage() {
        return this.storage;
    }

    // Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
