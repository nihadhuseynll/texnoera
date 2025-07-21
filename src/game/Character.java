package game;

public class Character {
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Character enemy) {
        int damage = 10;
        enemy.health -= damage;
        System.out.println("Attacked");
        System.out.println("Damage: " + damage);
        System.out.println("Enemy health after attack: " + enemy.health);
    }

    public void printStatus() {
        if (health <= 0)
            System.out.println("Character is DEAD");
        else {
            System.out.println("Name of Character: " + name);
            System.out.println("Health: " + health);
            System.out.println("Attack power: " + attackPower);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 30)
            this.name = name;
        else System.out.println("Name must be between 3 and 30 characters");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0 && health <= 100)
            this.health = health;
        else if (health <= 0) {
            System.out.println("DEAD");
            this.health = 0;
        } else System.out.println("Invalid health!");
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower > 0 && attackPower <= 50)
            this.attackPower = attackPower;
        else System.out.println("Wrong!!!");
    }

    @Override
    public String toString() {
        return "Character{" + "name='" + name + '\'' + ", health=" + health + ", attackPower=" + attackPower + '}';
    }
}
