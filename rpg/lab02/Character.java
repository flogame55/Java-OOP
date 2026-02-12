package com.rpg.lab02;

public class Character {
    private String name;
    private int level;
    private int healthPoints;
    private int maxHealthPoints;
    private Weapon weapon;
    private  String characterClass;

    public Character(String name, int level, int maxHealthPoints, Weapon weapon, String characterClass) {
        this.name = name;
        this.level = level;
        this.healthPoints = maxHealthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.weapon = weapon;
        this.characterClass = characterClass;
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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
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

    public void displayCharacterDetails() {
        System.out.println("--- "+name+" ---");
        System.out.println("Class: "+characterClass);
        System.out.println("Level: "+level);
        System.out.println("Health Points : "+healthPoints+"/"+maxHealthPoints);
        System.out.println("Weapon: "+ weapon.toString());
    }

    public int attack() {
        int damage = weapon.getBaseDamage() + (level * 2);
        System.out.println(name + " ( "+ characterClass+ " ) attacks with" + weapon.getName()+" ! " );
        System.out.println("Attack Damage: "+ damage +"( "+"Weapon base: "+weapon.getBaseDamage()+" + Level Bonus: "+ level * 2 +")");
        return damage;
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints < 0){
            healthPoints = 0;
        }
        System.out.println(name+" Takes "+ damage +"! Current Hp: "+healthPoints+"/"+maxHealthPoints);
    }

    public void levelUp(){
        level += 1;
        maxHealthPoints += 10;
        healthPoints = maxHealthPoints;
        System.out.println(name+" leveled up to Level "+ level + " !");
        System.out.println("Max Health increased to "+maxHealthPoints + " (full heal applied)");
    }
}
