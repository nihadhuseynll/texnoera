package game;

public class Hero extends Character {
    private String specialSkill;

    public Hero(String name, int health, int attackPower, String specialSkill) {
        super(name, health, attackPower);
        this.specialSkill = specialSkill;
    }

    public void useSkill(Character enemy) {
        if (enemy.getHealth() <= 0)
            System.out.println("Character is DEAD");
        else {
            int skillDamage = getAttackPower() + 10;
            enemy.setHealth(enemy.getHealth() - skillDamage);
            System.out.println(getName() + " used special skill '" + specialSkill + "' on " + enemy.getName() + "! Enemy's health is now: " + enemy.getHealth());
        }
    }

    @Override
    public void printStatus() {
        super.printStatus();
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    @Override
    public String toString() {
        return "Hero{" + "specialSkill='" + specialSkill + '\'' + '}';
    }
}
