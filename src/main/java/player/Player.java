package player;

import controller.Actions;

import java.io.Serializable;

public class Player implements Exp, Serializable {
    private String name;
    private final String id;
    private PlayerClass playerStats;
    private int level;
    private int currentExp;
    private int expMax = 100;


    public Player(String name){
        this.name = name;
        this.id = "65083";
        this.playerStats = PlayerClass.randomStats();
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public PlayerClass getStats() {
        return playerStats;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", id=" + id + ", playerStats=" + playerStats + "]";
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void increaseExp(int amountExp) {
        currentExp += amountExp;
        if (currentExp >= expMax){
            currentExp -= expMax;
            expMax += 100;
            level++;
        }
    }

}
