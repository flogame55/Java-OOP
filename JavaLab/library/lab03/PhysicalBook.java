package com.library.lab03;

public class PhysicalBook extends  LibraryItem{
    private String shelfLocation;
    private double price;

    public PhysicalBook(String title, String author, String isbn, double price, String shelfLocation) {
        super(title, author, isbn, "Available");
        this.price = price;
        this.shelfLocation = shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void displayDetails() {
        System.out.println("PHYSICAL BOOK");
        System.out.println("- Title: " + getTitle());
        System.out.println("- Author: " + getAuthor());
        System.out.println("- ISBN: " + getIsbn());
        System.out.println("- Price: " + price + " Baht");
        System.out.println("- Shelf Location: " + shelfLocation);
        System.out.println("- Status: " + getStatus());
        if (getReturnDueDate() != null) {
            System.out.println("- Return Due Date: " + getReturnDueDate());
        }else {
            System.out.println("- Return Due Date: N/A (Book is available)");
        }
        System.out.println();
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 5.0 ;
    }

    @Override
    public void printSummary() {
        System.out.println("Item[Title='"+getTitle()+" , Location='"+ shelfLocation +"' , Status='"+getStatus()+"']");
    }
}
