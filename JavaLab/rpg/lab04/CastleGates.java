package com.rpg.lab04;

public class CastleGates implements Destructible {
    private String name;
    private double durability;
    private double maxDurability;
    private boolean isLocked;
    private boolean isReinforced;

    public CastleGates(String name, double durability, boolean isLocked, boolean isReinforced) {
        this.name = name;
        this.durability = durability;
        this.maxDurability = durability;
        this.isLocked = isLocked;
        this.isReinforced = isReinforced;
    }

    @Override
    public void takeDamage(double amount) {
        double actualDamage = amount;
        if (isReinforced) {
            actualDamage = amount / 2;
            System.out.printf("%s is REINFORCED! (reduces damage from %.0f to %.0f)\n", name, amount, actualDamage);
        }
        this.durability -= actualDamage;
        System.out.printf("%s takes %.0f damage! (Durability: %.0f/%.0f)\n", name, actualDamage, (durability > 0 ? durability : durability), maxDurability);

        if (isDestroyed()) {
            System.out.println(name + " has been BREACHED! The gate COLLAPSES!");
        }
    }

    @Override
    public boolean isDestroyed() { return durability <= 0; }

    public void displayGateDetails() {
        System.out.println("--- " + name.toUpperCase() + " ---");
        System.out.println("Status: " + (isDestroyed() ? "BREACHED" : "INTACT"));
        System.out.printf("Durability: %.0f/%.0f\n", (durability > 0 ? durability : 0), maxDurability);
        System.out.println("Locked: " + (isLocked ? "Yes" : "No"));
        System.out.println("Reinforced: " + (isReinforced ? "Yes" : "No"));
    }
}