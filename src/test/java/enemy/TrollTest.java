package enemy;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Chopper", 30);
    }

    @Test
    public void canGetHealth(){
        assertEquals(30, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(10);
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(2, troll.attack());
    }

}
