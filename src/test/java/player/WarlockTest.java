package player;

import enemies.Ork;
import org.junit.Before;
import org.junit.Test;
import spell.Fire;
import spell.Spell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WarlockTest {

    Warlock warlock;
    Spell spell;
    Ork ork;

    @Before
    public void before(){
        warlock = new Warlock("Harry", 100);
        spell = new Fire("Level 1 Fire Ball", 2);
        ork = new Ork("Wee Guy", 25);
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", warlock.getName());
    }

    @Test
    public void canGetHitPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void canGetWeapon(){
        assertNull(warlock.getSpell());
    }

    @Test
    public void canSetWeapon(){
        warlock.setSpell(spell);
        assertEquals("Level 1 Fire Ball", warlock.getSpell().getName());
    }

    @Test
    public void canAttack(){
        warlock.setSpell(spell);
        warlock.castSpell(ork);
        assertEquals(23, ork.getHealthPoints());
    }
}
