package game;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Thor", 100, 40, "Lightning strike");
        Monster monster = new Monster("Hulk", 100, 20);

        hero.setName("Thor");
        hero.setHealth(100);
        hero.setAttackPower(40);
        hero.printStatus();
        monster.printStatus();
        hero.attack(monster);
        hero.useSkill(monster);
        hero.useSkill(monster);
        monster.printStatus();

        System.out.println("\n");

        monster.setName("Hulk");
        monster.setHealth(monster.getHealth());
        monster.setAttackPower(20);
        monster.printStatus();
        hero.printStatus();
        monster.setBoss(true);
        monster.getIsBoss();
        monster.attack(hero);
        monster.powerAttack(hero);
        hero.printStatus();
    }
}
