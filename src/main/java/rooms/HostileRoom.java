package rooms;

import behaviours.ITreasure;
import enemies.Enemy;

import java.util.ArrayList;

public class HostileRoom {

    private ArrayList<Enemy> enemies;

    public HostileRoom() {
        this.enemies = new ArrayList<Enemy>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public int getEnemyCount() {
        return enemies.size();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

}
