package weapon;

import actions.IWeapon;

public abstract class Weapon implements IWeapon {
    String name;
    int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
