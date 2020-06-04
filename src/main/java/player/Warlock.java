package player;

public class Warlock extends Mage {

    public Warlock(String name, int healthPoints){
        super(name, healthPoints);
    }

    public void defendSelf(int damage){
        gainHealth(damage);
    }

}
