package com.library.lab02;

import java.time.LocalDate;


public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private String status;
    private LocalDate returnDueDate;
    private int bookId;

    public Book(String title, String author, String isbn, double price, String status){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.status = status;
        this.bookId = (int) (Math.random() * 100);
    }

    public int getBookId() {return bookId;}

    public void setBookId(int bookId) {this.bookId = bookId;}

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        System.out.println("- Price: " + price);
        System.out.println("- Status: " + status);
        System.out.println("- Return Due Date: " + returnDueDate);
        System.out.println();
    }

    public void printSummary(){
        System.out.println("Book Id: "+bookId +" Book[Title='"+title+"' , Status='"+status+"']");
    }

    public void checkOut(Member member){
        if (status.equalsIgnoreCase("Borrowed")){
            System.out.println("Error: Book '" + title + "' is already borrowed and cannot be checked out again.");
            System.out.println();
            return;
        }
        setStatus("Borrowed");
        this.returnDueDate = LocalDate.now().plusDays(14);
        System.out.println("Book '" + title + "' has been borrwed by ["+ member.getMemberName()+"]");
        System.out.println("Return Due Date: " + returnDueDate);
        System.out.println();
    }

    public void returnBook(){
        if (status.equalsIgnoreCase("Available")){
            System.out.println("Error: Book '" + title + "' is Available and be checked out.");
            System.out.println();
            return;
        }
        setStatus("Available");
        this.returnDueDate = null;
        System.out.println("Book '" + title + "' has been returned successfully.");
        System.out.println();

    }
}
