package Rental;

public class Mobil extends Kendaraan {

    private int kapasitasPenumpang;

    public Mobil(String nopol, String merk, int thnProd, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nopol, merk, thnProd, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void displayInfo() {
        System.out.println("  Jenis           : MOBIL");
        super.displayInfo();
        System.out.println("  Kap. Penumpang  : " + kapasitasPenumpang + " orang");
    }

    @Override
    public double hitungDasar(int hari) {
        double total = super.hitungDasar(hari);
        double asuransi = 50_000.0 * hari;
        System.out.printf("  Biaya Asuransi Wajib (%d hari): +Rp%.0f%n", hari, asuransi);
        total += asuransi;
        if (kapasitasPenumpang > 5) {
            System.out.printf("  Biaya Kebersihan (kap. > 5): +Rp50000%n");
            total += 50_000.0;
        }
        return total;
    }
}
