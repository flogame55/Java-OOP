package com.rpg.lab04;

public class Weapon {
    private String name;
    private String type;
    private int baseDamage;
    private String description;

    public Weapon(String name, String type, int baseDamage, String description) {
        this.name = name;
        this.type = type;
        this.baseDamage = baseDamage;
        this.description = description;
    }

    public int getBaseDamage() { return baseDamage; }
    public String getName() { return name; }
}