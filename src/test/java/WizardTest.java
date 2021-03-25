import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Troll troll;
    Spell fireBall;

    @Before
    public void setUp() throws Exception {
        wizard = new Wizard("Kev", 100);
        troll = new Troll(50, 10);
        fireBall = new Spell("Fire Ball", 20);
    }

    @Test
    public void canCastSpell() {
        wizard.addSpell(fireBall);
        wizard.cast(troll, fireBall);
        assertEquals(30, troll.getHealthPoints());
    }

}
