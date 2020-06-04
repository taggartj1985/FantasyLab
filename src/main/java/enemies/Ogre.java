package enemies;

public class Ogre extends Enemy{
    public Ogre(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int attack(){
        return 10;
    }

    public void defendSelf(int damage){
        gainHealth(damage);
    }
}
