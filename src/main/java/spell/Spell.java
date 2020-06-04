package spell;

import actions.ISpell;
import enemies.Enemy;

public abstract class Spell implements ISpell {

    String name;
    int damage;

    public Spell(String name, int damage){
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
