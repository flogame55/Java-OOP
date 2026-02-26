package com.rpg.lab04;

public class HealthPotion implements  Consumable{
    private String name;
    private int healthPower;
    private int quantity;

    public HealthPotion(String name, int healthPower , int quantity) {
        this.healthPower = healthPower;
        this.name = name;
        this.quantity = quantity;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void use(Character user) {

    }
}
