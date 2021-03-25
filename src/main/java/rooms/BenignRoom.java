package rooms;

import behaviours.ITreasure;

import java.util.ArrayList;

public class BenignRoom {

    private ArrayList<ITreasure> loot;

    public BenignRoom() {
        this.loot = new ArrayList<ITreasure>();
    }

    public ArrayList<ITreasure> getLoot() {
        return loot;
    }

    public int getLootSize() {
        return loot.size();
    }

    public void addLoot(ITreasure item) {
        loot.add(item);
    }

}
