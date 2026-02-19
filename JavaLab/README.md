# Java-OOP
ฝึกการเขียนโค้ด Java ในแบบ OOP รายละเอียดดังนี้ 

Lab 02: The Interaction

Scenario 1: Association & Composition

Raw Data:
• A libraryItem titled "Java Programming" written by "John Smith". ISBN: 123-456, Price: 450
Baht. Status: Available. (3 copy)
• A libraryItem titled "OOP Concepts" written by "Will Jones". ISBN: 999-888, Price: 590 Baht.
Status: Borrowed. (3 copy)
• Member: "Somsak" (Member ID: M001) wants to borrow a libraryItem.
• The Action: Somsak borrows the libraryItem "Java Programming"
Instructions:
1. Reuse classes from Lab1 Scenario 1
2. Create a new Class named Member with attributes: name and memberId.
3. Modify the checkOut() method in the Book class (from Lab1 Scenario 1) to accept a
member object as a parameter.
o Example: public void checkOut(Member borrower)
4. Update Logic: When checkOut() is called, the libraryItem's status must change to "Borrowed"
AND it should print: "Book [Title] has been borrowed by [Member Name]."
5. Challenge:
• Identification vs. Identity: If we have a new Object Book that is identical in every
way (same title, same ISBN), do you think these two libraryItems are the same? And
what criteria would we use to determine the 'unique identity' of an object?
• Accountability & Responsibility: When designing the libraryItem borrowing process,
should the logic to verify a member's eligibility (e.g., checking if they have
reached the maximum limit of 3 libraryItems) reside within the Book class or the
Member class? Please analyze which class should hold this responsibility based
on OOP principles and modify the code to enforce this constraint.
6. Submit the upgrade code and sample output

Scenario 2: The Battle System (RPG Combat)

Concept: Understanding how objects communicate and affect each other's state.

New Requirements:
1. Reuse classes from Lab1 Scenario 2
2. Modify the attack() Method: Instead of just printing a message, the method must now
accept another Character object as a target.
• Method Signature: public void attack(Character target)
3. Add Damage Logic: * Add a damage attribute to the Character class or Weapon (if you
have Weapon class) (e.g., Arthur: 20, Merlin: 15).
• When attack(target) is called, the Health Points (HP) of the target must decrease
by the attacker's damage value.
4. Implement Status Checks:
• Add a method isAlive() that returns true if hp > 0.
• Update the displayDetails() method to show if the character is "Active" or
"Fainted".
5. Challenge:
• Encapsulation & Data Integrity: If you call warrior.attack(mage); and the mage's
HP becomes negative (e.g., -5), which method or part of the code should be
responsible for preventing the HP from dropping below 0? Why is it dangerous to
allow other classes to modify the hp attribute directly (e.g., mage.hp = -100;)?
• Responsibility of the Action: In a combat system, who should be responsible for
calculating 'Defense'? Should the Attacker calculate the final damage and send it,
or should the Receiver take the raw damage and subtract their own defense
value? Modify your code with this reasoning using OOP principles.
6. Submit the upgrade code and sample output

