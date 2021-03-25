package players;

import behaviours.ICast;
import behaviours.IPet;
import enemies.Enemy;
import pets.Pet;
import tools.Spell;

import java.util.ArrayList;

public abstract class SpellCaster extends Player implements ICast {

    ArrayList<Spell> spells;
    boolean defended;
    Pet pet;

    public SpellCaster(String playerName, int healthPoints) {
        super(playerName, healthPoints);
        this.spells = new ArrayList<Spell>();
        this.defended = false;
        this.pet = null;
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

    public boolean isDefended() {
        return defended;
    }

    public void setDefended(boolean defended) {
        this.defended = defended;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void changePet(Pet newPet) {
        setPet(newPet);
    }

    public void loseHealth(int damage) {
        int health = getHealthPoints();
        if(defended = true) {
            setHealthPoints(health);
            pet.loseHealth(damage);
        } else {
            setHealthPoints(health -= damage);
        }
    }

}
