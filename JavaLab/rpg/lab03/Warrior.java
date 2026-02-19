package com.rpg.lab03;

public class Warrior extends Character{
    private double armorValue;
    public Warrior(String name, int level, int maxHealthPoints, int damage, int defense,double armorValue,Weapon weapon) {
        super(name, level, maxHealthPoints, damage, defense, weapon, "Warrior");
        this.armorValue =armorValue;
    }

    public double getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(double armorValue) {
        this.armorValue = armorValue;
    }

    @Override
    public void receiveDamage(double damage) {
        damage -= this.armorValue;
        super.receiveDamage(damage);
    }

    @Override
    public void attack(Character character) {

    }

}
