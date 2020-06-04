package enemy;

import enemies.Ork;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrkTest {
    Ork ork;

    @Before
    public void before(){
        ork = new Ork("Chopper", 30);
    }

    @Test
    public void canGetHealth(){
        assertEquals(30, ork.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        ork.takeDamage(2);
        assertEquals(28, ork.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(1, ork.attack());
    }
}
