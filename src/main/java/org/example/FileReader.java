package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;


public class FileReader {
    public static List<User> readUsersFromFile(String filename) throws IOException {
        List<User> users = new ArrayList<>();

        // Читаем данные из файла
        List<String> lines = FileUtils.readLines(new File(filename), "UTF-8");

        // Парсим каждую строку и создаем объект User
        String[] headers = lines.get(0).split(" ");
        for (int i = 1; i < lines.size(); i++) {
            String[] fields = lines.get(i).split(" ");
            String name = fields[0];
            int age = Integer.parseInt(fields[1]);
            User user = new User(name, age);
            users.add(user);
        }

        return users;
    }
}

