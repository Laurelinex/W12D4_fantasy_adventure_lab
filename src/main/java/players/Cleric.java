package players;

import behaviours.IHeal;
import tools.HealingTool;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    ArrayList<HealingTool> tools;

    public Cleric(String playerName, int healthPoints) {
        super(playerName, healthPoints);
        this.tools = new ArrayList<HealingTool>();
    }

    public void addToolToInventory(HealingTool tool) {
        tools.add(tool);
    }

    public void heal(Player player, HealingTool tool) {
//        if tool is in tools, heal
//        else, nothing
        player.addHealth(tool.getHealingPoints());
    }
}
