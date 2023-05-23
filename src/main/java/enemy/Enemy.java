package enemy;

import controller.Actions;

import java.util.Random;

public class Enemy {
    private final EnemyClass enemyStats;
    private boolean isAlive;

    public Enemy(){
        enemyStats = EnemyClass.randomStats();
        isAlive = true;
    }

    private void setAlive(boolean bool){
        this.isAlive = bool;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void takeTurn(){
        if (this.getEnemyStats().getHealth() <= 0) setAlive(false);
        System.out.println("Enemy taking turn.......");
    }

    private Skill randomSkill(){
        Random ran = new Random();
        Skill [] skill = Skill.values();
        int randomIndex = ran.nextInt(skill.length);
        return skill[randomIndex];
    }

    public EnemyClass getEnemyStats() {
        return enemyStats;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyStats=" + enemyStats + '}';
    }
}

