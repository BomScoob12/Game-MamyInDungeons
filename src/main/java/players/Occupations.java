package players;

public enum Occupations {
    //MAX: attack 20 armor 50 speed 50 stamina 50 health 100
    Tanks(5, 35,12,20,70),
    Knight (8, 25, 15, 20, 50),
    Rogue(7, 15, 20, 20, 40),
    Fencer(10, 10, 25,25, 40),
    Mage(15, 10, 10,30,30);


    private double attack;
    private double armor;
    private double stamina;
    private double speed;
    private double health;

    Occupations(double attack, double armor, double speed, double stamina, double health){
        this.attack = attack;
        this.armor = armor;
        this.speed = speed;
        this.stamina = stamina;
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public double getArmor() {
        return armor;
    }

    public double getStamina() {
        return stamina;
    }

    public double getSpeed() {
        return speed;
    }

    public double getHealth() {
        return health;
    }
}
