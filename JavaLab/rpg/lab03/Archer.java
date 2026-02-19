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


    @Override
    public void attack(Character target) {
        int chance = (int) (Math.random() * 100);
        System.out.println(getName() + " aims carefully... (Chance: " + chance + " vs Accuracy: " + accuracy + ")");
        if (chance < accuracy) {
            System.out.println("🎯 Critical Hit! The arrow pierced " + target.getName() + "!");
            super.attack(target);
        } else {
            System.out.println("❌ Miss! " + getName() + "'s arrow flew past the target.");
        }
    }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails();
        System.out.println("Special Attribute: Accuracy = " + accuracy + "%");
        System.out.println();
    }

}
