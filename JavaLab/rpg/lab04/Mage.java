package com.rpg.lab04;

public class Mage extends Character {
    private double mana;
    private double currentMana;

    public Mage(String name, int level, double hp, double damage, int defense, double mana, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.mana = mana;
        this.currentMana = 0; // ตั้งค่าเป็น 0 ตาม Output ที่โชว์ว่า mana ไม่พอ
    }

    @Override
    public void attack(Destructible target) {
        if (target.isDestroyed()) return;

        int requiredMana = 30;
        if (currentMana < requiredMana) {
            System.out.println(getName() + " attempts to cast Magic Missile, but has insufficient mana!");
            System.out.printf("Current Mana: %.0f/%.0f (Need: %d)\n", currentMana, mana, requiredMana);
        } else {
            System.out.println(getName() + " casts Magic Missile!");
            target.takeDamage(getDamage() + getWeapon().getBaseDamage());
            currentMana -= requiredMana;
        }
    }
}