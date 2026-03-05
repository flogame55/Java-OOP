package com.rpg.lab05;

public interface Destructible {
    void takeDamage(double amount);
    boolean isDestroyed();
}