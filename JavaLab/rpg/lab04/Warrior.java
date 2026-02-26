package com.rpg.lab04;

public class Warrior extends Character {
    private double shieldDefense;

    public Warrior(String name, int level, double hp, double damage, int defense, double shieldDefense, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.shieldDefense = shieldDefense;
    }

    @Override
    public void attack(Destructible target) {
        if (target.isDestroyed()) {
            System.out.println("Target is already destroyed!");
            return;
        }
        double baseDamage = getDamage() + getWeapon().getBaseDamage();
        double enhancedDamage = baseDamage * 1.5;

        System.out.println(getName() + " (Warrior) performs a POWERFUL STRIKE on Target!");
        System.out.printf("Base Damage: %.0f → Enhanced: %.0f (1.5x multiplier)\n", baseDamage, enhancedDamage);

        target.takeDamage(enhancedDamage);
    }
}