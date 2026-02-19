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
    private String staus;

    public Character(String name, int level, int maxHealthPoints,int damage,int defense ,Weapon weapon, String characterClass) {
        this.name = name;
        this.level = level;
        this.healthPoints = maxHealthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.damage = damage;
        this.defense = defense;
        this.weapon = weapon;
        this.characterClass = characterClass;
        this.staus = "Active";
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

    public String getStaus() {return staus;}

    public void setStaus(String staus) {this.staus = staus;}

    public void displayCharacterDetails() {
        System.out.println("--- "+name+" ---");
        System.out.println("Class: "+characterClass);
        isAlive();
        System.out.println("Status: "+staus);
        System.out.println("Level: "+level);
        System.out.println("Health Points : "+healthPoints+"/"+maxHealthPoints);
        System.out.println("Damage: "+damage);
        System.out.println("Defense: "+defense);
        System.out.println("Weapon: "+ weapon.toString());
        System.out.println();
    }

    public boolean isAlive(){
        boolean out;
        if(healthPoints > 0){
            out = true;
            staus = "Active";
        }else {
            out = false;
            staus = "Fainted";
        }
        return out;
    }

    public void receiveDamage(double damage) {
        healthPoints -= damage;
        if (healthPoints < 0){
            healthPoints = 0;
        }
        System.out.println(name+" Takes "+ damage +"! Current Hp: "+healthPoints+"/"+maxHealthPoints);
    }

    public void attack(Character character) {
        int rawdamage = (int) (weapon.getBaseDamage() + this.damage);
        double totaldamage = rawdamage - character.getDefense();
        if (!character.isAlive()){
            System.out.println("Target is already Fainted Attack won't work!");
            return;
        }
        character.setHealthPoints(character.getHealthPoints() - totaldamage);
        System.out.println("Raw Attack Damage : "+ rawdamage);
        System.out.println(character.getName()+"'s Defense : "+ character.getDefense() + "(reduces damage by "+ character.getDefense()+")");
        System.out.println("Actual Damage Taken: "+ totaldamage);
        if (character.getHealthPoints() <= 0){ //check hp less 0 will set to 0 and set status to Fainted
            character.setHealthPoints(0);
            character.setStaus("Fainted");
        }
        System.out.println(character.getName()+"'s HP: "+ character.getHealthPoints()+"/"+character.getMaxHealthPoints());


    }

    public void levelUp(){
        level += 1;
        maxHealthPoints += 10;
        healthPoints = maxHealthPoints;
        System.out.println(name+" leveled up to Level "+ level + " !");
        System.out.println("Max Health increased to "+maxHealthPoints + " (full heal applied)");
    }
}
