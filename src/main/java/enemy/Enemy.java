package enemy;

import java.util.Random;

public class Enemy {
    private EnemyClass enemyStats;

    public Enemy(){
        enemyStats = EnemyClass.randomStats();
    }

    public double attack(){
        Random random = new Random();
        switch(random.nextInt(3)){
            case 0:
                return normalAttack();
            case 1:
                return criticalAttack();
            case 2:
                return specialAttack();
        }
        return 0;
    }

    private double normalAttack(){
        return enemyStats.getArmor();
    }
    private double criticalAttack(){
        return enemyStats.getAttack() * 1.5;
    }
    private double specialAttack(){
        return enemyStats.getAttack() * 2;
    }

}

