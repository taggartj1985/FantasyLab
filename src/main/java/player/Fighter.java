package player;

import weapon.Weapon;

public abstract class Fighter extends Player{

    Weapon weapon;

    public Fighter(String name, int healthPoints){
        super(name, healthPoints);
        this.weapon = null;
    }

//    Attack somewhere in here
    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

}
