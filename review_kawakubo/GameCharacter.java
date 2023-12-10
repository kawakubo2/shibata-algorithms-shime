package review_kawakubo;

public class GameCharacter {
    private int healthPower;
    final private int attackPower;
    final String name;
    public GameCharacter(int healthPower, int attackPower, String name) {
        this.healthPower = healthPower;
        this.attackPower = attackPower;
        this.name = name;
    }
    public void attack(GameCharacter other) {
        other.setHealthPower(other.getHealthPower() - this.getAttackPower());
    }
    public int getHealthPower() {
        return healthPower;
    }
    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }
    public int getAttackPower() {
        return attackPower;
    }
    
}
