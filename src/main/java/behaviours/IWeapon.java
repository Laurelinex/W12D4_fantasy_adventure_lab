package behaviours;

import enemies.Enemy;

public interface IWeapon {

    int getHitPoints();
    void attack(Enemy enemy);

}
