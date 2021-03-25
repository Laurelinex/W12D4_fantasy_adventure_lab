package players;

import behaviours.ICast;
import enemies.Enemy;
import tools.Spell;

import java.util.ArrayList;

public abstract class SpellCasters extends Player implements ICast {

    ArrayList<Spell> spells;

    public SpellCasters(String playerName, int healthPoints) {
        super(playerName, healthPoints);
        this.spells = new ArrayList<Spell>();
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getSpellCount() {
        return spells.size();
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }

    public void cast(Enemy enemy, Spell spell) {
//        if spell is in spells, do
//        else, no
        enemy.loseHealth(spell.getHitPoints());
    }

}
