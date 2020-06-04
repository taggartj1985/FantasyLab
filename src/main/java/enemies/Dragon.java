package enemies;

import actions.IDefend;

public class Dragon extends Enemy{
    public Dragon(String name, int healthPoints){
        super(name, healthPoints);
    }

    public int attack(){
        return 10;
    }

    public void defendSelf(int damage){
        gainHealth(damage);
    }
}
