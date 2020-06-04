package player;

public class Wizard extends Mage {

    public Wizard(String name, int healthPoints){
        super(name, healthPoints);
    }

    public void defendSelf(int damage){
        gainHealth(damage);
    }
}
