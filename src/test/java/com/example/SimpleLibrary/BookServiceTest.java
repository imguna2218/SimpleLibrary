package com.example.SimpleLibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BookServiceTest {
    @Test
    void testAddAndGetBooks() {
        BookService service = new BookService();
        int initialSize = service.getBooks().size();

        service.addBook("Test Book", "Test Author");

        assertEquals(initialSize + 1, service.getBooks().size());
    }
}