package enemy;

import enemies.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Chopper", 30);
    }

    @Test
    public void canGetHealth(){
        assertEquals(30, dragon.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        dragon.takeDamage(2);
        assertEquals(28, dragon.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(10, dragon.attack());
    }

    @Test
    public void canProtectDamage(){
        dragon.takeDamage(10);
        dragon.defendSelf(5);
        assertEquals(25, dragon.getHealthPoints());
    }
}
