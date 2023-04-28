package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            WordFrequencyCounter.countWordFrequencies("C:\\Users\\Java\\HW10\\src\\main\\java\\org\\example\\words.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
