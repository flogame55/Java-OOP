package com.rpg.lab04;

public class WoodenBox implements Destructible {
    private String name;
    private double healthPoints;
    private boolean isLocked;
    private String content;

    public WoodenBox(String name, double hp, boolean isLocked, String content) {
        this.name = name;
        this.healthPoints = hp;
        this.isLocked = isLocked;
        this.content = content;
    }

    @Override
    public void takeDamage(double amount) {
        this.healthPoints -= amount;
        System.out.println(name + " takes " + amount + " damage. Box HP: " + (healthPoints > 0 ? healthPoints : 0));
    }

    @Override
    public boolean isDestroyed() {
        return healthPoints <= 0;
    }

    public void displayBoxDetails() {
        System.out.println("Object: " + name + " | HP: " + healthPoints + " | Locked: " + isLocked);
    }

    public void breakOpen() {
        if (isDestroyed()) {
            System.out.println("Box broke open! Found: " + content);
        } else {
            System.out.println("The box is still intact and cannot be opened.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}