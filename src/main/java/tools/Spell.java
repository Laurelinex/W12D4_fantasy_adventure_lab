package tools;

public class Spell {

    private String name;
    private int hitPoints;

    public Spell(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
