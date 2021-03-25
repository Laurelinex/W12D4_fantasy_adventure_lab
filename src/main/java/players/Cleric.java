package players;

import behaviours.IHeal;
import tools.HealingTool;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    ArrayList<HealingTool> inventory;

    public Cleric(String playerName, int healthPoints) {
        super(playerName, healthPoints);
        this.inventory = new ArrayList<HealingTool>();
    }

    public void addToolToInventory(HealingTool tool) {
        inventory.add(tool);
    }

    public void heal(Player player, HealingTool tool) {
//        if tool is in inventory, heal
//        else, nothing
        player.addHealth(tool.getHealingPoints());
    }
}
