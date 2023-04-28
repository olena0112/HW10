package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberReader {
    public static void main(String[] args) throws IOException {
        String fileName ="C:\\Users\\Java\\HW10\\src\\main\\java\\org\\example\\file.txt" ;
        readPhoneNumbersFromFile(fileName);
    }

    public static void readPhoneNumbersFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$";
                if (line.matches(regex)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
