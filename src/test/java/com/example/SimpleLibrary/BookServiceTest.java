package com.example.SimpleLibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {

    @Test
    void testGetBookName() {
        // Setup
        BookService service = new BookService();

        // Execute
        String result = service.getBookName();

        // Assert (This ensures Module 11 passes)
        assertEquals("DevOps Handbook", result);
    }
}