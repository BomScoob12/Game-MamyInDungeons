package controller;

import enemy.Enemy;
import player.Player;

public class Turn {
    private Player player;
    private Enemy enemy;
    private Actions actions;
    private int count = 1;

    public Turn(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.actions = new Actions(this.player, enemy);
    }

    public void startTurn() {
        System.out.println("Player's turn:");
        actions.performAction();
        if (enemy.isAlive()) {
            System.out.println("Enemy's turn:");
            enemy.takeTurn();
        } else{
            System.out.println("Enemy has die.");
        }
        count++;
    }

    public int getCount(){
        return count;
    }
}
