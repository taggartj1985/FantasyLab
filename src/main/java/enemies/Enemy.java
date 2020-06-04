package enemies;

public abstract class Enemy {

    String name;
    int healthPoints;

    public Enemy(String name, int healthPoints){
    this.name = name;
    this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
