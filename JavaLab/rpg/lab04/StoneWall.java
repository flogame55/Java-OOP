package com.rpg.lab04;

public class StoneWall implements Destructible {
    private String location;
    private double durability;
    private double maxDurability;
    private String type;

    public StoneWall(String location, double durability, String type) {
        this.location = location;
        this.durability = durability;
        this.maxDurability = durability;
        this.type = type;
    }

    @Override
    public void takeDamage(double amount) {
        this.durability -= amount;
        System.out.printf("%s takes %.0f damage! (Durability: %.0f/%.0f)\n", location, amount, (durability > 0 ? durability : durability), maxDurability);
        if (isDestroyed()) {
            System.out.println(location + " has CRUMBLED to pieces!");
        }
    }

    @Override
    public boolean isDestroyed() { return durability <= 0; }

    public void displayWallDetails() {
        System.out.println("--- " + location.toUpperCase() + " ---");
        System.out.println("Type: " + type);
        System.out.println("Status: " + (isDestroyed() ? "DESTROYED" : "STANDING"));
        System.out.printf("Durability: %.0f/%.0f\n", (durability > 0 ? durability : 0), maxDurability);
    }

    public String getLocation() { return location; }
}