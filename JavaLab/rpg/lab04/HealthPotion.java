package com.rpg.lab04;

public class HealthPotion implements Consumable {
    private String name;
    private double healAmount;
    private int uses;

    public HealthPotion(String name, double healAmount, int uses) {
        this.name = name;
        this.healAmount = healAmount;
        this.uses = uses;
    }

    @Override
    public void use(Character user) {
        if (uses > 0) {
            user.setHealthPoints(user.getHealthPoints() + healAmount);
            uses--;
            System.out.println(user.getName() + " used " + name + " and healed " + healAmount + " HP!");
        } else {
            System.out.println(name + " is empty!");
        }
    }

    public void displayPotionDetails() {
        System.out.println("Potion: " + name + " | Heal: " + healAmount + " | Uses left: " + uses);
    }
}