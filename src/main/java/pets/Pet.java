package pets;

import behaviours.IDamage;
import behaviours.IPet;
import players.spellcasters.SpellCaster;

public abstract class Pet implements IPet, IDamage {

    private int healthPoints;

    public Pet(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void defend(SpellCaster spellCaster) {
        spellCaster.setDefended(true);
    }

    public void loseHealth(int damage) {
        this.healthPoints -= damage;
    }

}
