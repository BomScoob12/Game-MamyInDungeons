package controller;

import enemy.Enemy;
import player.Player;

import java.util.Scanner;

public class Actions {
    private final Player player;
    private final Enemy enemy;
    Scanner scan;

    public Actions(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
        scan = new Scanner(System.in);
    }

    public void performAction(){
        System.out.println("Select your action :");
        System.out.println("1. Attack");
        System.out.println("2. Defends");
        System.out.println("3. Do nothing");
        int option = scan.nextInt();
        scan.nextLine();
        switch (option){
            case 1 -> {
                //attack and swap turn
                attack();
            }
            case 2 -> {
                //defends
                defends();
            }
            case 3 -> {
                //Skip turn
                System.out.println("Skip turn");
            }
        }
    }

    private void attack(){
        System.out.println("ATK");
        double playerAttack = player.getStats().getAttack();
        double enemyHealth = enemy.getEnemyStats().getHealth();
        double enemyArmor = enemy.getEnemyStats().getArmor();

        if (enemyArmor == 0) {
            double remain = enemyHealth - playerAttack;
            enemy.getEnemyStats().setHealth(remain);
            System.out.println(player);
            System.out.println(enemy);
        }
        else if (playerAttack >= enemyArmor){
            playerAttack = playerAttack - enemyArmor;
            double remain = enemyHealth - playerAttack;
            enemy.getEnemyStats().setArmor(0);
            enemy.getEnemyStats().setHealth(remain);
            System.out.println(player);
            System.out.println(enemy);
        }else {
            enemyArmor = enemyArmor - playerAttack;
            enemy.getEnemyStats().setArmor(enemyArmor);
            System.out.println(player);
            System.out.println(enemy);
        }
    }
    private void defends(){
        System.out.println("DEFENDS");
    }

}
