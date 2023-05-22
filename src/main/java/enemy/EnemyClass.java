package enemy;

import java.util.Random;

public enum EnemyClass {
    SPIDERMAN("John", 10,10,30),
    ZOMBIE("John2", 10,10,30),
    ORC("John3", 10,10,30),
    BOSSON("John4", 10,10,30),
    BEE("John5", 10,10,30);

    private String name;
    private final double attack;
    private final double armor;
    private final double health;

    EnemyClass(String name, double attack, double armor, double health){
        this.name = name;
        this.attack = attack;
        this.armor = armor;
        this.health = health;
    }

    //random class for player
    public static EnemyClass randomStats(){
        Random random = new Random();
        EnemyClass[] randomClass = values();
        return randomClass[random.nextInt(randomClass.length)];
    }

    public String getName() {
        return name;
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

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                ", attack=" + attack +
                ", armor=" + armor +
                ", health=" + health;
    }
}
