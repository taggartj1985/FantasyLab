package player;

import actions.IDefend;
import actions.ISpell;
import enemies.Enemy;
import spell.Spell;

public abstract class Mage extends Player implements IDefend, ISpell {

    Spell spell;


    public Mage(String name, int healthPoints){
        super(name, healthPoints);
        this.spell = null;
    }

    public Spell getSpell(){
        return this.spell;
    }

    public void setSpell(Spell spell){
        this.spell = spell;
    }

    public void castSpell(Enemy enemy){
        if(spell != null){
            enemy.takeDamage(spell.getDamage());
        }
    }
}
