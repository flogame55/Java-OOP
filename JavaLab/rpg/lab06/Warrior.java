package com.rpg.lab06;

public class Warrior extends Character {
    private double shieldDefense;

    public Warrior(String name, int level, double hp, double damage, int defense, double shieldDefense, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.shieldDefense = shieldDefense;
        this.setAttack(new WarriorStyleDecorator(this.getAttack()));
    }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails();
        // เพิ่มข้อมูลเฉพาะของ Warrior เช่น Shield หรือ Stamina (ถ้ามี)
        System.out.println("Role: Warrior (Tank/Melee)");
    }



}