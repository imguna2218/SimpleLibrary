package com.example.SimpleLibrary;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String getBookName() {
        // TRAP FOR SONARQUBE: We need code smells to prove the analyzer works

        // Smell 1: Unused variable
        int unused = 100;

        // Smell 2: System.out instead of Logger
        System.out.println("Fetching book name from database...");

        return "DevOps Handbook";
    }
}