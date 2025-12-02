package com.example.SimpleLibrary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // Changed from @RestController to @Controller to serve HTML
public class LibraryController {

    private final BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        // Sends the list of books to the UI
        model.addAttribute("books", bookService.getBooks());
        return "index"; // Looks for index.html
    }
    // change
    @PostMapping("/add")
    public String addBook(@RequestParam String title, @RequestParam String author) {
        bookService.addBook(title, author);
        return "redirect:/"; // Refreshes page
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/"; // Refreshes page
    }
}