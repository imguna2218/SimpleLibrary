package com.example.SimpleLibrary;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private long idCounter = 1;

    public BookService() {
        // Pre-load some dummy data so the app isn't empty
        addBook("The Phoenix Project", "Gene Kim");
        addBook("DevOps Handbook", "Patrick Debois");
        addBook("Clean Code", "Robert C. Martin");
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author) {
        books.add(new Book(idCounter++, title, author));
    }

    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}