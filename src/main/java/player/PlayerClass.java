package player;

import java.util.Random;

public enum PlayerClass {
    KNIGHT("Knight",15,30,30,40),
    MAGE("Mage",20,10,30,50),
    PRIEST("Priest",10,20,30,40),
    THIEF("Thief",17,15,30,40);

    private String className;
    private final double attack;
    private final double armor;
    private final double health;
    private final double stamina;
    PlayerClass(String className, double attack, double armor, double health, double stamina){
        this.className = className;
        this.attack = attack;
        this.armor = armor;
        this.health = health;
        this.stamina = stamina;
    }

    //random class for player
    public static PlayerClass randomStats(){
        Random random = new Random();
        PlayerClass[] randomClass = values();
        return randomClass[random.nextInt(randomClass.length)];
    }

    public String getClassName(){
        return this.className;
    }

    public double getAttack() {
        return attack;
    }

    public double getArmor() {
        return armor;
    }

    public double getHealth() {
        return health;
    }

    public double getStamina() {
        return stamina;
    }

    public void setClassName(String className){
        this.className = className;
    }

    @Override
    public String toString() {
        return className +
                ", attack=" + attack +
                ", armor=" + armor +
                ", health=" + health +
                ", stamina=" + stamina;
    }
}
