package player;

public class Exp {
    private int exp;
    private static int expMax;
    private static int level;

    Exp(){
        this.exp = 0;
        expMax = 100;
    }

    public void increaseExp(){
        exp += 20;
        if (exp >= expMax){
            level++;
            expMax *= 1.05;
        }
    }

    public int getLevel(){
        return level;
    }
}
