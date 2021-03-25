package tools.weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Club implements IWeapon {

    private int hitPoints;

    public Club(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack(Enemy enemy) {
        enemy.loseHealth(hitPoints);
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
