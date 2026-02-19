package com.rpg.lab03;

public class Healer extends Character {
    private int healBase;
    private int healPower;

    public Healer(String name, int level, int maxHealthPoints,int damage,int defense, Weapon weapon, int healBase) {
        super(name, level, maxHealthPoints, damage , defense ,weapon, "Healer");
        this.healBase = healBase;
        this.healPower = healBase + (getLevel() * 2);
    }

    public int getHealBase() {return healBase;}

    public void setHealBase(int healBase) {this.healBase = healBase;}

    public void heal() {
        if (getHealthPoints() >= getMaxHealthPoints()) {
            System.out.println("HealthPoints is already Full!");
            return;
        }
        double newHp = getHealthPoints() + healPower;
        setHealthPoints(newHp);
        if (getHealthPoints() >= getMaxHealthPoints()) {
            setHealthPoints(getMaxHealthPoints());
        }
        System.out.println(getName()+" ("+ getClass() + ") casts a healing spell!");
        System.out.println("Healing Amount: " + healPower + " ( Base: "+ healBase + " + "+"Level Bonus: "+ (getLevel() * 2)+")");
        System.out.println("Restored: " + healPower + " HP!  Current HP: " + getHealthPoints()+"/"+getMaxHealthPoints());
    }

    public void healAlly(Character character) {
        if (character.getHealthPoints() >= character.getMaxHealthPoints()) {
            System.out.println("Target HealthPoints is already Full!");
            return;
        }
        double newHp = character.getHealthPoints() + healPower;
        character.setHealthPoints(newHp);
        if (character.getHealthPoints() >= character.getMaxHealthPoints()) {
            character.setHealthPoints(character.getMaxHealthPoints());
        }
        System.out.println(getName() + " ( " + getCharacterClass() + " ) casts a healing spell on " + character.getName() + "!");
        System.out.println("Healing Amount: " + healPower);
        System.out.println("Restored: " + healPower + " HP To  " + character.getName() + "! Their HP is : " + character.getHealthPoints());

    }
}
