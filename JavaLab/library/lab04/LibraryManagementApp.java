package com.library.lab04;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" LIBRARY MANAGEMENT SYSTEM - POLYMORPHISM DEMO");
        System.out.println("=".repeat(60));

        // Create a list of LibraryItem (demonstrates polymorphism)
        List<LibraryItem> items = new ArrayList<>();

        // Add Physical Books
        items.add(new PhysicalBook("Java Programming", "John Smith", "978-0134685991", 450.0, "A1-04"));
        items.add(new PhysicalBook("Clean Code", "Robert Martin", "978-0132350884", 520.0, "B2-15"));
        items.add(new PhysicalBook("Design Patterns", "Gang of Four", "978-0201633612", 680.0, "A3-22"));

        // Add E-Books
        items.add(new EBook("Effective Java", "Joshua Bloch", "978-0134685991", "https://library.ebooks.com/effective-java.pdf", 5.2));
        items.add(new EBook("Python Crash Course", "Eric Matthes", "978-1593279288", "https://library.ebooks.com/python-crash.pdf", 8.7));

        // Instantiate member object
        Member member1 = new Member("M001", "Somsak");
        Member member2 = new Member("M002", "Suda");

        // Display all items using polymorphism
        System.out.println("\n--- ALL LIBRARY ITEMS (Polymorphism Demo) ---");
        for (LibraryItem item : items) {
            item.printSummary();
        }

        // Demonstrate checkOut() method
        System.out.println("\n--- TESTING CHECKOUT FUNCTIONALITY ---");
        items.get(0).checkOut(member1);
        items.get(4).checkOut(member2);

        // Demonstrate returnItem() method
        System.out.println("\n--- TESTING RETURN FUNCTIONALITY ---");
        items.get(0).returnItem(member1);

        // ==================== METHOD OVERRIDING: Late Fee Demo ====================
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" METHOD OVERRIDING: LATE FEE CALCULATION DEMO");
        System.out.println("=".repeat(60));
        int daysLate = 5;
        for (LibraryItem item : items) {
            double lateFee = item.calculateLateFee(daysLate);
            System.out.printf(" %s: %.2f Baht\n", item.getTitle(), lateFee);
        }

        // ==================== INTERFACE IMPLEMENTATION: Digital Content & Taxable Demo
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" INTERFACE IMPLEMENTATION: DIGITAL CONTENT & TAXABLE DEMO");
        System.out.println("=".repeat(60));

        // Demonstrate Digital Content Interface
        System.out.println("\n--- DIGITAL CONTENT INTERFACE ---");
        for (LibraryItem item : items) {
            if (item instanceof DigitalContent) {
                DigitalContent digitalBook = (DigitalContent) item;
                System.out.println("Processing EBook: " + item.getTitle());
                processDigitalAccess(digitalBook);
            }
        }

        // ==================== CHALLENGE: UNIVERSAL STREAMING PLAYER ====================
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" UNIVERSAL STREAMING PLAYER (Polymorphism via Interfaces)");
        System.out.println("=".repeat(60));
        System.out.println("\nThis demonstrates interface-based polymorphism:");
        System.out.println("A single player can handle BOTH movies and e-books!\n");

        List<DigitalContent> digitalContentList = new ArrayList<>();

        // Add movies (NOTE: Movies do NOT inherit from LibraryItem!)
        LibraryMovie movie1 = new LibraryMovie("The Matrix", "Lana Wachowski", "https://streaming.library.com/matrix.mp4", 136, 1999, "Sci-Fi", 199.0);
        LibraryMovie movie2 = new LibraryMovie("Inception", "Christopher Nolan", "https://streaming.library.com/inception.mp4", 148, 2010, "Sci-Fi/Thriller", 249.0);

        digitalContentList.add(movie1); //
        digitalContentList.add(movie2); //

        // Also add ebooks to the digital content list
        digitalContentList.add(new EBook("Effective Java", "Joshua Bloch", "978-0134685991", "https://library.ebooks.com/effective-java.pdf", 5.2)); //

        for (DigitalContent content : digitalContentList) {
            if (content instanceof LibraryMovie) {
                LibraryMovie movie = (LibraryMovie) content;
                System.out.println(" STREAMING PLAYER - Playing Movie: " + movie.getTitle());
            } else if (content instanceof EBook) {
                EBook book = (EBook) content;
                System.out.println(" STREAMING PLAYER - Reading E-Book: " + book.getTitle());
            }
            System.out.println("---");
            processDigitalAccess(content);

        // Demonstrate Taxable Interface
        System.out.println("\n--- TAXABLE INTERFACE ---");
        for (LibraryItem item : items) {
            Taxable taxableItem = (Taxable) item;
            double tax = taxableItem.calculateTax();
            System.out.printf(" %s: Price = %.2f Baht, Tax = %.2f Baht, Total = %.2f Baht\n",
                    item.getTitle(), item.getPrice(), tax, item.getPrice() + tax);
        }


        }
    }

    /**
     * Universal Streaming Player - Works with ANY DigitalContent object!
     */
    public static void processDigitalAccess(DigitalContent item) {
        System.out.println("Connecting to streaming service...");
        System.out.println("Loading content...\n");
        item.streamOnline(); //
        System.out.println("User requests offline copy:");
        item.download(); //
    }
}