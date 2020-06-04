package enemies;

public class Troll extends Enemy{
    public Troll(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int attack(){
        return 2;
    }

    public void defendSelf(int damage){
        gainHealth(damage);
    }

}
