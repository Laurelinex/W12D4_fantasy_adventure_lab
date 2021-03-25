import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import tools.HealingTool;
import tools.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool potion;

    @Before
    public void setUp() throws Exception {
        potion = new HealingTool("potion", 20);

    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(20, potion.getHealingPoints());
    }

}
