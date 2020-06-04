package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Tam", 10);
    }

    @Test
     public void canGetName(){
        assertEquals("Tam", cleric.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(10, cleric.getHealthPoints());
    }

    @Test
    public void canHeal(){
        cleric.heal(20);
        assertEquals(30, cleric.getHealthPoints());
    }
}
