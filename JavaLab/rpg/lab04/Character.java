package com.rpg.lab04;

public class Character implements Destructible {
    private String name;
    private int level;
    protected double healthPoints;
    protected double damage;
    private int defense;
    protected Weapon weapon;

    public Character(String name, int level, double healthPoints, double damage, int defense, Weapon weapon) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.defense = defense;
        this.weapon = weapon;
    }

    // แก้ไข: รับ Destructible เพื่อให้โจมตีได้ทั้งคนและกล่อง
    public void attack(Destructible target) {
        if (target.isDestroyed()) {
            System.out.println("Target is already destroyed!");
            return;
        }
        double totalDamage = this.damage + this.weapon.getBaseDamage();
        System.out.println(this.name + " attacks the target!");
        target.takeDamage(totalDamage);
    }

    @Override
    public void takeDamage(double amount) {
        double effectiveDamage = amount - this.defense;
        if (effectiveDamage < 0) effectiveDamage = 0;
        this.healthPoints -= effectiveDamage;
        if (this.healthPoints < 0) this.healthPoints = 0;
        System.out.println(name + " receives " + effectiveDamage + " damage. HP left: " + healthPoints);
    }

    @Override
    public boolean isDestroyed() {
        return healthPoints <= 0;
    }

    public void displayCharacterDetails() {
        System.out.println("Character: " + name + " | HP: " + healthPoints + " | Level: " + level);
    }

    // Getters สำหรับคลาสลูก
    public String getName() { return name; }
    public double getDamage() { return damage; }
    public Weapon getWeapon() { return weapon; }
    public void setHealthPoints(double hp) { this.healthPoints = hp; }
    public double getHealthPoints() { return healthPoints; }
}