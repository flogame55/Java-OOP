package com.rpg.lab06;


public class Mage extends Character {
    private double currentMana;
    private double maxMana; // เพิ่ม maxMana

    public Mage(String name, int level, double hp, double damage, int defense, double mana, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.maxMana = mana;
        this.currentMana = mana; // เริ่มต้นให้ Mana เต็ม

        // ห่อหุ้มการโจมตีพื้นฐานด้วย MageStyleDecorator ตั้งแต่เกิด
        this.setAttack(new MageStyleDecorator(this.getAttack()));
    }

    public void setMaxMana(double maxMana) {
        this.maxMana = maxMana;
    }

    // เมธอดสำหรับจัดการ Mana
    public double getCurrentMana() { return currentMana; }
    public void setCurrentMana(double currentMana) {
        this.currentMana = Math.max(0, Math.min(currentMana, maxMana));
    }
    public double getMaxMana() { return maxMana; }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails();
        System.out.println("Role: Mage (Magic User)");
        System.out.println("Mana: " + currentMana + " / " + maxMana);
    }

    }