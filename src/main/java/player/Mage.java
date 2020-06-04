package player;

import actions.IDefend;

public abstract class Mage extends Player implements IDefend {

    public Mage(String name, int healthPoints){
        super(name, healthPoints);
    }
}
