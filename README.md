# Java-OOP1
ฝึกการเขียนโค้ด Java ในแบบ OOP รายละเอียดดังนี้ 

Scenario 1: Library Management System

  Raw Data:
  
  • A book titled "Java Programming" written by "John Smith". ISBN: 123-456, Price: 450 Baht. Status: Available.
  
  • A book titled "OOP Concepts" written by "Will Jones". ISBN: 999-888, Price: 590 Baht. Status: Borrowed.
  
Instructions:
  1. Design a class named Book.
  2. Identify appropriate Attributes and Methods.
  3. Implement the following Methods:
    • checkOut(): To change the book's status from "Available" to "Borrowed".
    • displayDetails(): To print all information about the book to the console.
  4. Instantiate (create) two objects based on the provided raw data.
  5. Challenge: If we want to store the "Return Due Date," should it be a Class Attribute or calculated within a Method? How would you prevent a book that is already "Borrowed" from being checked out again in your code?
  6. Submit the upgrade code and sample output

Scenario 2: RPG Game Character

Raw Data:

  • A warrior named "Arthur", Level 10, Health Points (HP) 1500, Weapon: "Sword".
  
  • A mage named "Merlin", Level 12, Health Points (HP) 800, Weapon: "Staff".
  
Instructions:
  1. Design a class named Character.
  2. Create objects named warrior and mage.
  3. Implement a method attack() that prints a message (e.g., "Arthur attacks with Sword!") and a method levelUp().
  4. Challenge:
    • If you want to add a "Healer" character who has a unique heal() ability, would you modify the existing Character class or create a new one?
    • Is it necessary to create a separate Weapon class, and what attributes should it have?
  5. Submit the upgrade code and sample output

