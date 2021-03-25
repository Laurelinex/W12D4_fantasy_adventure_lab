import behaviours.ITreasure;
import org.junit.Before;
import org.junit.Test;
import rooms.BenignRoom;
import treasures.Gold;

import static org.junit.Assert.assertEquals;

public class BenignRoomTest {

    BenignRoom room;
    ITreasure gold;

    @Before
    public void setUp() throws Exception {
        room = new BenignRoom();
        gold = new Gold();
    }

    @Test
    public void lootStartsEmpty() {
        assertEquals(0, room.getLootSize());
    }

    @Test
    public void canAddLoot() {
        room.addLoot(gold);
        assertEquals(1, room.getLootSize());
    }

}
