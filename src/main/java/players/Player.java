package players;

public abstract class Player {

    private String playerName;
    private int healthPoints;

    public Player(String playerName, int healthPoints) {
        this.playerName = playerName;
        this.healthPoints = healthPoints;
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

}
