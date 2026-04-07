package Rental;

public class Motor extends Kendaraan {

    private int kapasitasMesin;

    public Motor(String nopol, String Merk, int thnProd, double hargaSewaDasar, int kapasitasMesin) {
        super(nopol, Merk, thnProd, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        System.out.println("  Jenis           : MOTOR");
        super.displayInfo();
        System.out.println("  Kapasitas Mesin : " + kapasitasMesin + " cc");
    }

    @Override
    public double hitungDasar(int hari) {
        double total = super.hitungDasar(hari);
        double pajak = 10_000.0 * hari;
        System.out.printf("  Pajak Kendaraan (%d hari): +Rp%.0f%n", hari, pajak);
        total += pajak;
        return total;
    }
}
