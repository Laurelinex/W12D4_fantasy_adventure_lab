package behaviours;

import enemies.Enemy;
import tools.Spell;

public interface ICast {

    void cast(Enemy enemy, Spell spell);

}
