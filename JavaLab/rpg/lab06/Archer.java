package com.rpg.lab06;

public class Archer extends Character {
    private int accuracy;

    public Archer(String name, int level, double hp, double damage, int defense, int accuracy, Weapon weapon) {
        super(name, level, hp, damage, defense, weapon);
        this.accuracy = accuracy;
        // ห่อหุ้มการโจมตีพื้นฐานด้วย ArcherStyleDecorator ทันทีที่สร้างตัวละคร
        this.setAttack(new ArcherStyleDecorator(this.getAttack()));
    }

    public int getAccuracy() { return accuracy; }

    // ตรวจสอบเงื่อนไขโบนัสระยะยิง (Range Advantage)
    public boolean hasRangeAdvantage() {
        // Logic เดิมของคุณ: ถ้าสุ่มได้น้อยกว่าค่า Accuracy ถือว่าได้เปรียบระยะยิง [cite: 981, 982]
        return accuracy > (Math.random() * 100);
    }

    @Override
    public void displayCharacterDetails() {
        super.displayCharacterDetails(); // เรียกข้อมูลพื้นฐานจากคลาสแม่
        System.out.println("Role: Archer (Ranged Precision)");
        System.out.println("Accuracy: " + accuracy + "%");
    }


}