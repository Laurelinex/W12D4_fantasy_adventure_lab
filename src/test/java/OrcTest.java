import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void setUp() throws Exception {
        orc = new Orc(100, 20);
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(100, orc.getHealthPoints());
    }

}
