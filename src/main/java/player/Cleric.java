package player;

import actions.IHeal;

public class Cleric extends Player implements IHeal {

    public Cleric(String name, int healthPoints){
        super(name, healthPoints);
    }

    public void heal(int hp){
            healthPoints += hp;
        }


}

