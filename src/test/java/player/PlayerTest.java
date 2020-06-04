package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Bob", 12);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", player.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(12, player.getHealthPoints());
    }

    @Test
    public void canSetHealth(){
        player.setHealthPoints(100);
        assertEquals(100, player.getHealthPoints());
    }



}