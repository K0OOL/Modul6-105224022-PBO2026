package Minimarket;

public class Product {
    public String name;
    public double harga;

    public Product(String name, double harga) {
        this.name = name;
        this.harga = harga;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Produk:\t" + name);
        System.out.println("Harga:\t" + harga);
    }
}
