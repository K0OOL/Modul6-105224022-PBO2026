import game.Hero;
import game.HeroStrength;

public class Main1 {
    public static void main(String[] args) {
        Hero hero = new Hero("Hanabi", 100, 10);
        HeroStrength heroStrength = new HeroStrength("Karie", 100, 10, "Strength");

        hero.display();
        heroStrength.display();

        hero.berlatih();
        heroStrength.berlatih();

        hero.terimaSerangan(50);
        heroStrength.terimaSerangan(50);

        hero.display();
        heroStrength.display();
    }
}
