import Rental.*;

import java.util.ArrayList;

public class MainRental {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        daftarKendaraan.add(new Mobil("B 1234 ABC", "Toyota Avanza", 2012,
                300_000, 7));

        daftarKendaraan.add(new Mobil("D 5678 XYZ", "Honda Civic", 2022,
                500_000, 5));

        daftarKendaraan.add(new Motor("Z 9999 BIG", "Kawasaki Ninja", 2020,
                200_000, 250));

        daftarKendaraan.add(new Motor("AB 4321 STD", "Honda Vario", 2019,
                100_000, 125));

        int hariSewa = 5;
        String garis = "=".repeat(55);

        for (Kendaraan k : daftarKendaraan) {
            System.out.println(garis);
            k.displayInfo();
            System.out.println();
            System.out.println("  ---  Rincian Perhitungan  ---");
            double total = k.hitungDasar(hariSewa);
            System.out.println();
            System.out.printf("  Total Biaya Sewa selama %d Hari: Rp%.0f%n",
                    hariSewa, total);
        }
        System.out.println(garis);
    }
}