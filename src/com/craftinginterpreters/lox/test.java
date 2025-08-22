package com.craftinginterpreters.lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        // Wrap System.in (bytes) with InputStreamReader (converts to chars)
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // Wrap InputStreamReader with BufferedReader (lets us read full lines)
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.println("Type something and press Enter:");

        // Read one line of text from the console
        String line = reader.readLine();

        System.out.println("You typed: " + line);
    }
}