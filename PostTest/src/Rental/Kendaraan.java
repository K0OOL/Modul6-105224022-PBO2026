package Rental;

public class Kendaraan {

    protected String nopol;
    protected String Merk;
    protected int thnProd;
    protected double hargaSewaDasar;

    public Kendaraan(String nopol, String Merk, int thnProd, double hargaSewaDasar) {
        this.nopol = nopol;
        this.Merk = Merk;
        this.thnProd = thnProd;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("  Nomor Polisi    : " + nopol);
        System.out.println("  Merk            : " + Merk);
        System.out.println("  Tahun Produksi  : " + thnProd);
        System.out.printf("  Harga Sewa Dasar: Rp%.0f / hari%n", hargaSewaDasar);
    }

    public double hitungDasar(int hari) {
        double total = hargaSewaDasar * hari;
        if (thnProd < 2015) {
            double diskon = total * 0.10;
            System.out.printf("  Diskon 10%% (kendaraan lama): -Rp%.0f%n", diskon);
            total -= diskon;
        }
        return total;
    }
}
