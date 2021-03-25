package players;

import behaviours.ITreasure;

import java.util.ArrayList;

public abstract class Player {

    private String playerName;
    private int healthPoints;
    private ArrayList<ITreasure> inventory;

    public Player(String playerName, int healthPoints) {
        this.playerName = playerName;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<ITreasure>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void addHealth(int value) {
        this.healthPoints += value;
    }

    public ArrayList<ITreasure> getInventory() {
        return inventory;
    }
}
