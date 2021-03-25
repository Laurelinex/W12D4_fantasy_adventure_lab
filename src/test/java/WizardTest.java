import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import pets.Dragon;
import players.spellcasters.Wizard;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Troll troll;
    Spell fireBall;
    Dragon dragon;

    @Before
    public void setUp() throws Exception {
        wizard = new Wizard("Kev", 100);
        troll = new Troll(50, 10);
        fireBall = new Spell("Fire Ball", 20);
        dragon = new Dragon(100);
    }

    @Test
    public void canCastSpell() {
        wizard.addSpell(fireBall);
        wizard.cast(troll, fireBall);
        assertEquals(30, troll.getHealthPoints());
    }

    @Test
    public void defendedStartsFalse() {
        assertEquals(false, wizard.isDefended());
    }

    @Test
    public void canBeDefended() {
        wizard.changePet(dragon);
        dragon.defend(wizard);
        troll.hit(wizard);
        assertEquals(100, wizard.getHealthPoints());
        assertEquals(90, dragon.getHealthPoints());
    }

}
