package enemy;

import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre("Chopper", 30);
    }

    @Test
    public void canGetHealth(){
        assertEquals(30, ogre.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        ogre.takeDamage(2);
        assertEquals(28, ogre.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(10, ogre.attack());
    }
}
