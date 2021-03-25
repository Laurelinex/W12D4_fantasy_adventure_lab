import org.junit.Before;
import org.junit.Test;
import players.healers.Cleric;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric1;
    Cleric cleric2;
    HealingTool potion;

    @Before
    public void setUp() throws Exception {
        cleric1 = new Cleric("Kev", 100);
        cleric2 = new Cleric("Bev", 10);
        potion = new HealingTool("potion", 20);
    }

    @Test
    public void canHealPlayer() {
        cleric1.addToolToInventory(potion);
        cleric1.heal(cleric2, potion);
        assertEquals(30, cleric2.getHealthPoints());
    }

}
