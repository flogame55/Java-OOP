package com.rpg.lab04;

public class WoodenBox implements Destructible{
    private String name;
    private int health;
    private boolean status;
    private String reward;

    public WoodenBox(String name,int health , boolean status, String reward) {
        this.reward = reward;
        this.status = status;
        this.health = health;
        this.name = name;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeDamage(int amount) {

    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
