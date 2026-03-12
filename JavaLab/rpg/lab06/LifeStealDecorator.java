package com.rpg.lab06;

/**
 * Generic decorator that restores HP after an attack.
 */
public class LifeStealDecorator extends AttackDecorator {
    private final double ratio;
    public LifeStealDecorator(Attack wrappedAttack, double ratio) {
        super(wrappedAttack);
        if (ratio < 0 || ratio > 1) {
            throw new IllegalArgumentException("Life steal ratio must be between 0 and 1.");
        }
        this.ratio = ratio;
    }
    @Override
    public void attack(Character attacker, Destructible target) {
        int hpBefore = (int) attacker.getHealthPoints();
        wrappedAttack.attack(attacker, target);
        if (!attacker.isDestroyed()) {
            return;
        }
        int healBase = (int) (attacker.getDamage() + attacker.getWeapon().getBaseDamage());
        int healAmount = Math.max(1, (int) Math.round(healBase * ratio));
        int missing = (int) (attacker.getMaxHealthPoints() - attacker.getHealthPoints());
        if (missing <= 0) {
            return;
        }
        int restored = Math.min(healAmount, missing);
        attacker.setHealthPoints(attacker.getHealthPoints() + restored);
        System.out.println(" [Decorator] Life Steal restored " + restored + " HP to " + attacker.getName() + " (" + hpBefore + " -> " + attacker.getHealthPoints() + ")");
    }
}
