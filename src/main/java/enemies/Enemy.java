package enemies;

import behaviours.IDamage;

public abstract class Enemy implements IDamage {

    private int healthPoints;
    private int hitPoints;

    public Enemy(int healthPoints, int hitPoints) {
        this.healthPoints = healthPoints;
        this.hitPoints = hitPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void loseHealth(int damage) {
        this.healthPoints -= damage;
    }

}
