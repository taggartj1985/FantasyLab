package player;

import actions.IWeapon;
import enemies.Enemy;
import weapon.Weapon;

public abstract class Fighter extends Player implements IWeapon {

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

    public void attack(Enemy enemy){
        if(weapon != null){
            enemy.takeDamage(weapon.getDamage());
        }
    }

}
