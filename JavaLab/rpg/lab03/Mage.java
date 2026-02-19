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

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " casts 'Magic Missile' spell! ");
        super.attack(target);
    }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails();
        System.out.println("Special Attribute: Mana = " + mana);
        System.out.println();
    }
}
