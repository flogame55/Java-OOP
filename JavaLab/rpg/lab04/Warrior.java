package com.rpg.lab04;

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
        double effectiveDamage = damage - this.armorValue;
        if (effectiveDamage < 0) effectiveDamage = 0;
        System.out.println(getName() + "'s armor blocked " + armorValue + " damage.");
        super.receiveDamage(effectiveDamage);
    }

    @Override
    public void attack(Character target) {
        double rawDamage = ((getWeapon().getBaseDamage() + getDamage()) * 1.5);
        double totalDamage = rawDamage - target.getDefense();
        if (totalDamage < 0) totalDamage = 0;
        System.out.println(getName() + " Warrior Attack! (1.5x Damage Bonus)");
        target.receiveDamage(totalDamage);
    }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails();
        System.out.println("Special Attribute: Armor Value = " + armorValue);
        System.out.println();
    }

}
