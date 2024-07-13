public class main {
    public static void main(String[] args) {
        // Object Komputer
        komputer komputer1 = new komputer();
        komputer1.setMerk("Dell");
        komputer1.setProcessor("Intel i7");
        komputer1.setRam(16);
        komputer1.setStorage(512);

        System.out.println("Komputer:");
        System.out.println("Merk: " + komputer1.getMerk());
        System.out.println("Processor: " + komputer1.getProcessor());
        System.out.println("RAM: " + komputer1.getRam() + " GB");
        System.out.println("Storage: " + komputer1.getStorage() + " GB");

        komputer1.nyalakan();
        komputer1.matikan();

        laptop laptop1 = new laptop();
        laptop1.setMerk("HP");
        laptop1.setProcessor("AMD Ryzen 5");
        laptop1.setRam(8);
        laptop1.setStorage(256);
        laptop1.setBerat(1.5);

        System.out.println("laptop:");
        System.out.println("Merk: " + laptop1.getMerk());
        System.out.println("Processor: " + laptop1.getProcessor());
        System.out.println("RAM: " + laptop1.getRam() + " GB");
        System.out.println("Storage: " + laptop1.getStorage() + " GB");
        System.out.println("Berat: " + laptop1.getBerat() + " kg");

        laptop1.nyalakan();
        laptop1.matikan();
    }
}
