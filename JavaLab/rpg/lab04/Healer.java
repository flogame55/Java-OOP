package com.rpg.lab04;

public class Healer extends Character {
    private String healType;

    // แก้ไข Constructor ให้รับค่าและส่ง super() ให้ตรงกับ Character.java
    public Healer(String name, int level, double hp, double damage, int defense, Weapon weapon, String healType) {
        // ลำดับต้องเป็น: name, level, hp, damage, defense, weapon
        super(name, level, hp, damage, defense, weapon);
        this.healType = healType;
    }

    @Override
    public void attack(Destructible target) {
        if (target.isDestroyed()) {
            System.out.println("Target is already destroyed!");
            return;
        }
        System.out.println(getName() + " (Healer) uses " + healType + " to push back the target!");
        super.attack(target); // ใช้แรงโจมตีพื้นฐานจากคลาสแม่
    }
}