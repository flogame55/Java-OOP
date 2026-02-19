package com.rpg.lab03;

public class Mage extends Character{
    private double mana;
    public Mage(String name, int level, int maxHealthPoints, int damage, int defense,double mana,Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Mage");
        this.mana =mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }


}
