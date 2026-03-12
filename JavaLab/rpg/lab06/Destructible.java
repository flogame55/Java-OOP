package com.rpg.lab06;

public interface Destructible {
    void takeDamage(double amount);
    boolean isDestroyed();
}