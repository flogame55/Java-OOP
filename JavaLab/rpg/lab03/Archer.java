package com.rpg.lab03;

public class Archer extends Character{
    private int accuracy;
    public Archer(String name, int level, int maxHealthPoints, int damage, int defense,int accuracy,Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Archer");
        this.accuracy = accuracy;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


}
