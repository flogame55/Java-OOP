package com.library.lab02;


import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" LIBRARY MANAGEMENT SYSTEM - DEMONSTRATION");
        System.out.println("=".repeat(60));

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            // Instantiate two book objects based on the provided raw data
            books.add(new Book("Java Programming", "John Smith", "123-456", 450.0, "Available"));
            books.add(new Book("OOP Concepts", "Will Jones", "999-888", 590.0, "Available"));
        }

        // Instantiate member object
        Member member1 = new Member("M001", "Somsak");


        System.out.println("\n--- Initial Book Information ---");

        for (Book book : books ) {
            book.printSummary();
        }

        // Demonstrate checkOut() method
        System.out.println("\n--- Testing checkOut() Method ---");
        System.out.println("\nAttempting to checkout Book 1 and Book 2 (Available):");
        books.get(0).checkOut(member1);
        books.get(1).checkOut(member1);

//
//        System.out.println("Attempting to checkout Book 2 again (Already Borrowed):");
//        book2.checkOut();
//
//        // Challenge: Attempt to checkout a book that is already borrowed
//        // Demonstrate returnBook() method
//        System.out.println("\n--- Testing returnBook() Method ---");
//        System.out.println("\nReturning Book 1:");
//        book1.returnBook();
//
//        // Display final details
//        System.out.println("\n--- Final Book Information ---");
//        book1.displayDetails();
//        book2.displayDetails();

    }
}