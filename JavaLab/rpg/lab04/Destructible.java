package com.rpg.lab04;

public interface Destructible {
    void takeDamage(double amount);
    boolean isDestroyed();
}