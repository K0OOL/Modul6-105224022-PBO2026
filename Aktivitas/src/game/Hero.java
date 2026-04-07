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
        System.out.println("\nNama\t\t: " + nama);
        System.out.println("Health\t\t: " + health);
        System.out.println("Attack Power\t: " + attackPower);
    }

    public void berlatih() {
        this.attackPower += 10;
        System.out.println("\n" + nama + " sedang berlatih...");
    }

    public void terimaSerangan(double damage) {
        if (this.health - damage <= 0) {
            this.health = 0;
            System.out.println("\n" + nama + " telah dikalahkan!");
        } else {
            this.health -= damage;
            System.out.println("\n" + nama + " menerima serangan sebesar " + damage);
        }
    }
}