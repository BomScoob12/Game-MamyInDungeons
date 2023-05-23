package controller;

import enemy.Enemy;
import player.Player;

public class Turn {
    private final Player player;
    private final Enemy enemy;
    private final Actions actions;
    private int countTurn = 1;

    public Turn(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.actions = new Actions(this.player, this.enemy);
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
        countTurn++;
    }

    public int getCountTurn(){
        return countTurn;
    }
}
