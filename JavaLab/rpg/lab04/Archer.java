package com.rpg.lab04;

public class Archer extends Character {
    private int accuracy;

    public Archer(String name, int level, double hp, double damage, int defense, int accuracy, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.accuracy = accuracy;
    }

    @Override
    public void attack(Destructible target) {
        if (target.isDestroyed()) return;

        double baseDamage = getDamage();
        double rangeBonus = getWeapon().getBaseDamage();
        double totalDamage = baseDamage + rangeBonus;

        System.out.println(getName() + " (Archer) shoots a precise arrow at Target!");
        System.out.printf("Base Damage: %.0f + Range Bonus: %.0f = %.0f\n", baseDamage, rangeBonus, totalDamage);

        // จำลองการยิงโดนตาม Output
        System.out.println("Accuracy: " + accuracy + "% (HIT!)");
        target.takeDamage(totalDamage);
    }
}