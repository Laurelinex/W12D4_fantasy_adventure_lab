package players;

import behaviours.IFight;
import behaviours.IWeapon;
import enemies.Enemy;
import tools.weapons.Club;
import tools.weapons.Sword;

public abstract class Fighter extends Player implements IFight {

    IWeapon weapon;

    public Fighter(String playerName, int healthPoints) {
        super(playerName, healthPoints);
        this.weapon = new Club(5);
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void swapWeapon(IWeapon newWeapon) {
        setWeapon(newWeapon);
    }

    public void hit(Enemy enemy) {
        enemy.loseHealth(getWeapon().getHitPoints());
    }

}
