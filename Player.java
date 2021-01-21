package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public List<String> read() {
        List<String> al = new ArrayList<String>();
        al.add(0, this.name);
        al.add(1, "" + this.hitPoints);
        al.add(2, "" + this.strength);
        al.add(3, this.weapon);
        return al;
    }

    @Override
    public void write(List<String> al) {
        if (al != null && al.size() > 0) {
            this.name = al.get(0);
            this.hitPoints = Integer.parseInt(al.get(1));
            this.strength = Integer.parseInt(al.get(2));
            this.weapon = al.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
