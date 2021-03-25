package tools.weapons;

import enemies.Enemy;

public class Axe {

    private int hitPoints;

    public Axe(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack(Enemy enemy) {
        enemy.loseHealth(hitPoints);
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
