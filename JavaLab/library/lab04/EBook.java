package com.library.lab04;

public class EBook extends LibraryItem implements DigitalContent, Taxable {
    private String downloadUrl;
    private double fileSize;

    public EBook(String title, String author, String isbn, String downloadUrl, double fileSize) {
        super(title, author, isbn, "Available");
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    @Override
    public double getPrice() { return 99.0; }

    @Override
    public void printSummary() {
        // Output ของคุณไม่มีคำว่า EBOOK นำหน้าในส่วนแรก
        System.out.println("- Title: " + getTitle());
        System.out.println("- ISBN: " + getIsbn());
        System.out.println("- Status: " + getStatus());
        System.out.println("- Return Due Date: " + (getStatus().equals("Available") ? "N/A (Item is available)" : getReturnDueDate()));
    }

    @Override
    public void streamOnline() {
        System.out.println("Streaming '" + getTitle() + "' from URL: " + downloadUrl);
        System.out.println("Starting online stream... connected!");
        System.out.println("You can now read the book online without downloading.");
    }

    @Override
    public void download() {
        System.out.println("Downloading '" + getTitle() + "' from URL: " + downloadUrl);
        System.out.printf("Downloading file... (%.2f MB)\n", fileSize);
        System.out.println("Download complete! File saved to your device.");
        System.out.println("You can now read the book offline.");
    }

    @Override
    public double calculateTax() {
        return 99.0 * 0.05; // 5% tax
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}