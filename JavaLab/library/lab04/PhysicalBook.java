package com.library.lab04;

public class PhysicalBook extends LibraryItem implements Taxable {
    private double price;
    private String shelfLocation;

    public PhysicalBook(String title, String author, String isbn, double price, String shelfLocation) {
        super(title, author, isbn, "Available");
        this.price = price;
        this.shelfLocation = shelfLocation;
    }

    @Override
    public double getPrice() { return price; }

    @Override
    public void printSummary() {
        System.out.println("PHYSICAL BOOK");
        System.out.println("- Title: " + getTitle());
        System.out.println("- Author: " + getAuthor());
        System.out.println("- ISBN: " + getIsbn());
        System.out.println("- Price: " + price + " Baht");
        System.out.println("- Shelf Location: " + shelfLocation);
        System.out.println("- Status: " + getStatus());
        System.out.println("- Return Due Date: " + (getStatus().equals("Available") ? "N/A (Book is available)" : getReturnDueDate()));
    }

    @Override
    public double calculateTax() {
        return price * 0.07; // 7% tax
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }
}