package com.rpg.lab06;

public class Character implements Destructible {
    private String name;
    private double healthPoints;
    private double maxHealthPoints;
    protected double damage;
    protected Weapon weapon;
    private Attack attackBehavior;

    public Character(String name, int level, double hp, double damage, int defense, Weapon weapon) {
        this.name = name;
        this.healthPoints = hp;
        this.maxHealthPoints = hp;
        this.damage = damage;
        this.weapon = weapon;
        this.attackBehavior = new BaseAttack();
    }

    public void attack(Destructible target) {
        attackBehavior.attack(this, target);
    }

    // Getters / Setters ที่จำเป็น
    public Attack getAttack() { return attackBehavior; }
    public void setAttack(Attack newAttack) { this.attackBehavior = newAttack; }
    public String getName() { return name; }
    public double getDamage() { return damage; }
    public void setDamage(double damage) { this.damage = damage; }
    public Weapon getWeapon() { return weapon; }
    public double getHealthPoints() { return healthPoints; }
    public double getMaxHealthPoints() { return maxHealthPoints; }
    public void setHealthPoints(double hp) { this.healthPoints = Math.min(hp, maxHealthPoints); }

    @Override
    public void takeDamage(double amount) {
        this.healthPoints -= amount;
        System.out.println(name + " receives " + amount + " damage.");
    }

    @Override
    public boolean isDestroyed() { return healthPoints <= 0; }

    public void displayCharacterDetails() {
        System.out.println("\n--- CHARACTER DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("HP: " + healthPoints + " / " + maxHealthPoints);
        System.out.println("Base Damage: " + damage);
        System.out.println("Weapon: " + weapon.getName() + " (+" + weapon.getBaseDamage() + " dmg)");
        // แสดงชื่อ Class ของ Decorator ปัจจุบันเพื่อให้รู้ว่าใช้ Style ไหนอยู่
        System.out.println("Current Attack Style: " + attackBehavior.getClass().getSimpleName());
    }
}