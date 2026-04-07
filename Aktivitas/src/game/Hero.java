package game;

public class Hero {
    String nama;
    double health;
    double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Health\t: " + health);
        System.out.println("Attack Power\t: " + attackPower);
    }

    public void berlatih() {
        this.attackPower += 10;
        System.out.println(nama + " sedang berlatih...");
    }

    public void terimaSerangan(double damage) {
        if (this.health - damage <= 0) {
            this.health = 0;
            System.out.println(nama + " telah dikalahkan!");
        } else {
            this.health -= damage;
            System.out.println(nama + " menerima serangan sebesar " + damage);
        }
    }
}