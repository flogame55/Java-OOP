package com.rpg.lab02;

public class Weapon {
    private  String name;
    private  String type;
    private int baseDamage;
    private   String ability;

    public Weapon(String type, String name, int baseDamage, String ability) {
        this.type = type;
        this.name = name;
        this.baseDamage = baseDamage;
        this.ability = ability;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString(){
        return name +" ("+"Type: "+type+", Damage: " + baseDamage+", Ability: " +ability+" )";
    }

}
