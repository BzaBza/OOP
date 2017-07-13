package encapsulation;

public class App {
    public static void main(String[] args) {
        Hero jirniyJenya = new Hero(224, 453, 213, "$$Jirniy Jenya Bond$$");
        Hero tovstiyArthur = new Hero(111, 242, 563, "Boss Arthur LaTovstiy");
        tovstiyArthur.giveDamage(jirniyJenya);
        System.out.println("hero name - " + jirniyJenya.getHeroName() + "\n" + jirniyJenya.getArmor() + " armor \n" + jirniyJenya.getHealthPoints() + " HP");
        jirniyJenya.giveDamage(tovstiyArthur);
        System.out.println("hero name - " + tovstiyArthur.getHeroName() + "\n" + tovstiyArthur.getArmor() + " armor \n" + tovstiyArthur.getHealthPoints() + " HP");

    }
}
