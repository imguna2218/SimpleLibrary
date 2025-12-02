package com.example.SimpleLibrary;

public class Book {
    private Long id;
    private String title;
    private String author;
    // change
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters are mandatory for Thymeleaf to read the data
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}