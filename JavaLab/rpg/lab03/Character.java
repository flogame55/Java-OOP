package com.rpg.lab03;

public class Character {
    private String name;
    private int level;
    private double healthPoints;
    private double maxHealthPoints;
    private double damage;
    private double defense;
    private Weapon weapon;
    private String characterClass;
    private String status;

    public Character(String name, int level, int maxHealthPoints,int damage,int defense ,Weapon weapon, String characterClass) {
        this.name = name;
        this.level = level;
        this.healthPoints = maxHealthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.damage = damage;
        this.defense = defense;
        this.weapon = weapon;
        this.characterClass = characterClass;
        this.status = "Active";
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public double getDamage() {return damage;}

    public void setDamage(int damage) {this.damage = damage;}

    public double getDefense() {return defense;}

    public void setDefense(int defense) {this.defense = defense;}

    public String getStaus() {return status;}

    public void setStaus(String staus) {this.status = staus;}

    public void displayCharacterDetails() {
        System.out.println("--- "+name+" ---");
        System.out.println("Class: "+characterClass);
        isAlive();
        System.out.println("Status: "+status);
        System.out.println("Level: "+level);
        System.out.println("Health Points : "+healthPoints+"/"+maxHealthPoints);
        System.out.println("Damage: "+damage);
        System.out.println("Defense: "+defense);
        System.out.println("Weapon: "+ weapon.toString());
    }

    public boolean isAlive() {
        if (healthPoints > 0) {
            this.status = "Active";
            return true;
        } else {
            healthPoints = 0;
            this.status = "Fainted";
            return false;
        }
    }

    public void receiveDamage(double damage) {
        this.healthPoints -= damage;
        if (this.healthPoints <= 0) {
            this.healthPoints = 0;
            this.status = "Fainted";
        }
        System.out.println(name+" Takes "+ damage +"! Current Hp: "+healthPoints+"/"+maxHealthPoints);
    }

    public void attack(Character target) {
        if (!target.isAlive()) {
            System.out.println("Target is already Fainted Attack won't work!");
            return;
        }
        double rawDamage = this.weapon.getBaseDamage() + this.damage;
        double actualDamage = rawDamage - target.getDefense();
        if (actualDamage < 0) actualDamage = 0;
        System.out.println("Raw Attack Damage : "+ rawDamage);
        System.out.println(target.getName()+"'s Defense : "+ target.getDefense() + "(reduces damage by "+ target.getDefense()+")");
        System.out.println("Actual Damage Taken: "+ actualDamage);
        System.out.println(target.getName()+"'s HP: "+ target.getHealthPoints()+"/"+target.getMaxHealthPoints());
        target.receiveDamage(actualDamage);

    }

    public void levelUp(){
        level += 1;
        maxHealthPoints += 10;
        healthPoints = maxHealthPoints;
        System.out.println(name+" leveled up to Level "+ level + " !");
        System.out.println("Max Health increased to "+maxHealthPoints + " (full heal applied)");
    }
}
