# 🎓 OOP Learning & Project Implementation

โปรเจกต์นี้เป็นการรวบรวมองค์ความรู้จากการศึกษาหลักการเขียนโปรแกรมเชิงวัตถุ (Object-Oriented Programming) และการฝึกฝนผ่านการทำ Lab ในรูปแบบต่างๆ เพื่อเสริมสร้างทักษะการออกแบบซอฟต์แวร์ที่ดี

---

## 📚 1. Core Concepts (จาก ooppdf)
สรุปเสาหลัก 4 ประการของ OOP ที่นำมาประยุกต์ใช้ในทุกโปรเจกต์:

* **Encapsulation:** การปกป้องข้อมูลภายใน Class โดยใช้ Access Modifiers และจัดการผ่าน Getter/Setter
* **Inheritance:** การถ่ายทอดคุณสมบัติจากคลาสแม่สู่คลาสลูก เพื่อลดความซ้ำซ้อนของโค้ด
* **Polymorphism:** การออกแบบให้ Object สามารถแสดงพฤติกรรมที่หลากหลายผ่าน Method Overriding และ Overloading
* **Abstraction:** การกำหนดโครงสร้างผ่าน Abstract Class หรือ Interface เพื่อมุ่งเน้นไปที่ "ทำอะไร" มากกว่า "ทำอย่างไร"

---

## ⚔️ 2. RPG Game Lab
การทดลองสร้างระบบเกมเพื่อฝึกการจัดการความสัมพันธ์ระหว่างวัตถุที่มีความซับซ้อน

### สิ่งที่ได้เรียนรู้และลงมือทำ:
* **Class Hierarchy:** ออกแบบคลาสพื้นฐาน `Character` และสร้างตัวละครเฉพาะทางผ่านการสืบทอด
* **Object Composition:** การใช้ความสัมพันธ์แบบ "Has-a" เช่น ตัวละครประกอบไปด้วย `Weapon`, `Armor` และ `WoodenBox` สำหรับเก็บไอเทม
* **Battle Logic:** การเขียนอัลกอริทึมสำหรับระบบต่อสู้และการคำนวณค่าสถานะ (Stats) ของตัวละคร

---

## 📖 3. Library Management System
การประยุกต์ใช้ OOP ในการแก้ปัญหาและจัดการข้อมูลที่เป็นระบบในเชิงธุรกิจ

### สิ่งที่ได้เรียนรู้และลงมือทำ:
* **Data Modeling:** การสร้าง Model สำหรับวัตถุในโลกจริง เช่น `Book` และ `Member` ให้กลายเป็น Class ในระบบ
* **Design Patterns:** การนำแนวคิดเช่น **Strategy Pattern** มาใช้ในการจัดการเงื่อนไขสมาชิกที่แตกต่างกัน (เช่น `StudentMembershipStrategy`)
* **System Logic Separation:** การแยกส่วนการทำงานของระบบห้องสมุดออกจากโมเดลข้อมูล เพื่อให้โค้ดมีความยืดหยุ่นและแก้ไขได้ง่าย

---

## 🛠️ Tech Stack
* **Language:** Java
* **Paradigm:** Object-Oriented Programming (OOP)
* **Concepts applied:** Inheritance, Polymorphism, Composition, Strategy Pattern

---
*จัดทำสรุปโดย: Jirayu Promyoun*
