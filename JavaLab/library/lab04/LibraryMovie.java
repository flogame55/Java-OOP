package com.library.lab04;

public class LibraryMovie implements DigitalContent, Taxable {
    private String title;
    private String director;
    private String streamingUrl;
    private int durationMinutes;
    private int releaseYear;
    private String genre;
    private double price;

    public LibraryMovie(String title, String director, String streamingUrl, int durationMinutes, int releaseYear, String genre, double price) {
        this.title = title;
        this.director = director;
        this.streamingUrl = streamingUrl;
        this.durationMinutes = durationMinutes;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public void streamOnline() {
        System.out.println("Streaming Movie: '" + title + "' from URL: " + streamingUrl);
        System.out.println("Enjoy your " + durationMinutes + " minutes of " + genre + " cinema!");
    }

    @Override
    public void download() {
        System.out.println("Downloading '" + title + "' for offline viewing...");
    }

    @Override
    public double calculateTax() {
        return this.price * 0.05;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }
}