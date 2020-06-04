package player;

import enemies.Ork;
import org.junit.Before;
import org.junit.Test;
import weapon.Sword;
import weapon.Weapon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    Ork ork;

    @Before
        public void before(){
        barbarian = new Barbarian("Mark", 100);
        weapon = new Sword("Two-Handed", 20);
        ork = new Ork("Wee Guy", 25);
    }

    @Test
        public void canGetName(){
        assertEquals("Mark", barbarian.getName());
    }

    @Test
        public void canGetHitPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
        public void canGetWeapon(){
        assertNull(barbarian.getWeapon());
    }

    @Test
        public void canSetWeapon(){
        barbarian.setWeapon(weapon);
        assertEquals("Two-Handed", barbarian.getWeapon().getName());
    }

    @Test
        public void canAttack(){
        barbarian.setWeapon(weapon);
        barbarian.attack(ork);
        assertEquals(5, ork.getHealthPoints());
    }



}
