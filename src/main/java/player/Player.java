package player;

public class Player {
    private String name;
    private final String id;
    private int countPlayer;
    private PlayerClass playerClass;


    public Player(String name){
        this.name = name;
        this.id = "083-00"+(++countPlayer);
        this.playerClass = PlayerClass.randomStats();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public PlayerClass getStats() {
        return playerClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", countPlayer=" + countPlayer +
                ", stats=" + playerClass +
                '}';
    }
}
