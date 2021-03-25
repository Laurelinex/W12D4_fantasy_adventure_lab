package tools.weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Sword implements IWeapon {

    private int hitPoints;

    public Sword(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack(Enemy enemy) {
        enemy.loseHealth(hitPoints);
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
