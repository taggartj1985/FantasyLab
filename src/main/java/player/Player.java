package player;

public class Player {

    String name;
    int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage){
        healthPoints -= damage;
    }

    public void gainHealth(int damage){
        healthPoints += damage;
    }

}
