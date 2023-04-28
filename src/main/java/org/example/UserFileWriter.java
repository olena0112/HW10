package org.example;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserFileWriter {
    public static void writeUsersToFile(List<User> users, String filename) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Преобразуем список объектов User в JSON и записываем в файл
        FileWriter writer = new FileWriter(new File(filename));
        writer.write(gson.toJson(users));
        writer.close();
    }
}

