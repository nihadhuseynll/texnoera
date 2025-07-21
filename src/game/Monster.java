package game;

public class Monster extends Character {
    private boolean isBoss;

    public Monster(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.isBoss = false;
    }

    public void powerAttack(Character enemy) {
        if (enemy.getHealth() <= 0)
            System.out.println("Character is DEAD");
        else {
            int damage = 0;

            if (isBoss) {
                damage = getAttackPower() * 2;
                enemy.setHealth(enemy.getHealth() - damage);
                System.out.println(getName() + " attacked " + enemy.getName() + ", 'With Boss Power'." + " Enemy's health: " + enemy.getHealth());
            }
        }
    }

    @Override
    public void printStatus() {
        super.printStatus();
    }

    public boolean getIsBoss() {
        System.out.println("Monster is Boss: " + isBoss);
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    @Override
    public String toString() {
        return "Monster{" + "isBoss=" + isBoss + '}';
    }
}
