package com.library.lab04;

import java.time.LocalDate;


public class LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private String status;
    private LocalDate returnDueDate;


    public LibraryItem(String title, String author, String isbn, String status){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getReturnDueDate() {
        return returnDueDate;
    }

    public void setReturnDueDate(LocalDate returnDueDate) {
        this.returnDueDate = returnDueDate;
    }

    public void displayDetails(){
        System.out.println("- Title: " + title);
        System.out.println("- Author: " + author);
        System.out.println("- Isbn: " + isbn);
        System.out.println("- Status: " + status);
        if (returnDueDate == null){
            System.out.println("- Return Due Date: N/A (Book is available)");
        }else {
            System.out.println("- Return Due Date: " + returnDueDate);
        }
    }

    public void printSummary(){
        System.out.println("Item[Title='"+title+"' , Status='"+status+"']");
    }

    public void checkOut(Member member){
        if (status.equalsIgnoreCase("Borrowed")){
            System.out.println("Error: Item '" + title + "' is already borrowed and cannot be checked out again.");
            return;
        }
        if (member.getBorrowTime() >= 3){
            System.out.println("Member " + member.getMemberName() + " has reached the borrowed limit (3).");
            return;
        }

        setStatus("Borrowed");
        member.setBorrowTime(member.getBorrowTime() + 1);
        this.returnDueDate = LocalDate.now().plusDays(14);
        System.out.println("Item '" + title + "' has been checked out successfully.");
        System.out.println("Item '" + title + "' has been borrwed by ["+member.getMemberName()+"]");
        System.out.println("Return Due Date: " + returnDueDate);
    }

    public void returnItem(Member member){
        if (status.equalsIgnoreCase("Available")){
            System.out.println("Error: Item '" + title + "' is Available and be checked out.");
            return;
        }
        member.setBorrowTime(member.getBorrowTime() - 1);
        setStatus("Available");
        this.returnDueDate = null;
        System.out.println("Item '" + title + "' has been returned successfully.");

    }

    public double calculateLateFee(int daysLate){
        return daysLate * 5.0 ;
    }
}
