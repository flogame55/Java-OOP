package com.library.lab03;

public class EBook extends  LibraryItem{
    private String downloadUrl;
    private double fileSize;

    public EBook(String title, String author, String isbn,String downloadUrl, double fileSize) {
        super(title, author, isbn, "Available");
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 0.0 ;
    }

    @Override
    public void displayDetails(){
        System.out.println("E-BOOK");
        System.out.println("- Title: " + getTitle());
        System.out.println("- Author: " + getAuthor());
        System.out.println("- ISBN: " + getIsbn());
        System.out.println("- Download URL: " + downloadUrl);
        System.out.println("- File Size: " + fileSize);
        System.out.println("- Status: " + getStatus());
        if (getReturnDueDate() != null) {
            System.out.println("- Return Due Date: " + getReturnDueDate());
        }else {
            System.out.println("- Return Due Date: N/A (Book is available)");
        }
        System.out.println();
    }


}
