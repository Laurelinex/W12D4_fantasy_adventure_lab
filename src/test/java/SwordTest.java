import enemies.Enemy;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import tools.weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;
    Orc orc;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(15);
        orc = new Orc(100, 20);
    }

    @Test
    public void canMakeDamage() {
        sword.attack(orc);
        assertEquals(85, orc.getHealthPoints());
    }

}
