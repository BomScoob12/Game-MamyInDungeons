package controller;

import enemy.Enemy;
import player.Player;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameController {
    private Player player;
    private Enemy enemy;
    private Scanner scan;

    public GameController(){
        scan = new Scanner(System.in);
        try{
            loadPlayer();
        } catch (ClassNotFoundException | IOException e){
            System.out.println("Do not have save file. Please create new player.");
            createPlayer();
        }
        randomEnemy();
    }
    public void createPlayer(){
        System.out.println("Create player");
        System.out.print("Enter your name :");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        System.out.println(player);
        saveGame();
    }
    public void loadPlayer() throws IOException, ClassNotFoundException {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("saved-data.dat"));
            player = (Player) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Data loaded.");

    }
    public void saveGame(){
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("saved-data.dat"));
            objectOutputStream.writeObject(player);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Saved success");
        }catch (IOException e){
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);
        }
    }

    public void randomEnemy() {
        enemy = new Enemy();
    }

    public void start(){
        Turn turn = new Turn(player, enemy);
        System.out.println("Game Started!!!!!");
//        System.out.println("You can type 'exit' to Exit the game");
        System.out.println("Print your stats :");
        System.out.println(player);
        System.out.println("Print enemy stats :");
        System.out.println(enemy);
        do {
            System.out.println("Turn " + turn.getCount());
            turn.startTurn();
        } while (enemy.isAlive());
        System.out.println("You winnn.....");
        pauseGame();
    }

    private void pauseGame(){
        System.out.println("Do you need to continue.");
        System.out.println("1. Continue");
        System.out.println("2. Save.");
        System.out.println("3. Save and Exit.");
        int option = scan.nextInt();
        scan.nextLine();

        switch (option) {
            case 1 -> {
                randomEnemy();
                start();
            }
            case 2 -> {
                saveGame();
                start();
            }
            case 3 -> {
                saveGame();
                System.out.println("Exit the game.");
            }
        }
        System.out.println("------------------------");
    }


}