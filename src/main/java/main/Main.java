package main;

import player.Player;

public class Main {
    public static void main(String[] args) {
        testPlayer();
    }

    private static void testPlayer(){
        Player p1 = new Player("Bom");
        System.out.println(p1);
    }
}
