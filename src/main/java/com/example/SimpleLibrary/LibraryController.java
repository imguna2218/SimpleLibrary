package com.example.SimpleLibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private final BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home() {
        return "<h1 style='color: green'>Library System Online</h1>" +
                "<p>Active Book: " + bookService.getBookName() + "</p>";
    }
}