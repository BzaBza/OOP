package encapsulation;

/**
 * Created by ARTUR on 12.07.2017.
 */
public class Hero {

    private int healthPoints, armor, heroDamage;
    private String heroName;

    public Hero(int healthPoints, int armor, int heroDamage, String heroName) {
        this.heroName = heroName;
        this.healthPoints = healthPoints;
        this.armor = armor;
        this.heroDamage = heroDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getArmor() {
        return armor;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroName() {
        return heroName;
    }

    private void takeDamage(int damage) {
        if (healthPoints <= 0) return;
        if (armor >= damage) {
            armor -= damage;
            return;
        }
        if (armor < damage) {
            healthPoints = healthPoints + armor - damage;
            armor = 0;
            if (healthPoints < 0) {
                healthPoints = 0;
            }
        }
    }

    public void giveDamage(Hero hero) {
        hero.takeDamage(heroDamage);
    }
}
