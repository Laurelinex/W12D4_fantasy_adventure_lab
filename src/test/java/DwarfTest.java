import behaviours.IWeapon;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Dwarf;
import tools.HealingTool;
import tools.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Troll troll;
    IWeapon sword;

    @Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Kev", 100);
        troll = new Troll(100, 10);
        sword = new Sword(20);
    }

    @Test
    public void startsWithClub() {
        assertEquals(5, dwarf.getWeapon().getHitPoints());
    }

    @Test
    public void canSwapWeapon() {
        dwarf.swapWeapon(sword);
        assertEquals(20, dwarf.getWeapon().getHitPoints());
    }

    @Test
    public void canHitEnemy() {
        dwarf.hit(troll);
        assertEquals(95, troll.getHealthPoints());
    }

}
