package player;

import java.util.Random;

public enum PlayerClass {
    KNIGHT("Knight",15,30,30,40),
    MAGE("Mage",20,10,30,50),
    PRIEST("Priest",10,20,30,40),
    THIEF("Thief",17,15,30,40);

    private String name;
    private final double attack;
    private final double armor;
    private final double health;
    private final double stamina;
    PlayerClass(String name, double attack, double armor, double health, double stamina){
        this.name = name;
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

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                ", attack=" + attack +
                ", armor=" + armor +
                ", health=" + health +
                ", stamina=" + stamina;
    }
}
