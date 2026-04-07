package game;

public class HeroStrength extends Hero {

    String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower, String tipe) {
        super(nama, health, attackPower);
        this.tipe = tipe;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe\t\t: " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double reducedDamage = damage * 0.5;
        super.terimaSerangan(reducedDamage);
        System.out.println(nama + " player berhasil menahan serangan dan menerima serangan sebesar " + reducedDamage);
    }

    @Override
    public void berlatih() {
        super.berlatih();
    }
}
