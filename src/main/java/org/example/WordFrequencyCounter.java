package org.example;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class WordFrequencyCounter {
    public static void countWordFrequencies(String filename) throws IOException {
        File file = new File(filename);
        List<String> lines = FileUtils.readLines(file, "UTF-8");

        // Об'єднати всі рядки в один рядок, видаляючи всі зайві пробіли
        String content = String.join(" ", lines).replaceAll("\\s+", " ");

        // Розділити рядок на слова, використовуючи пробіл як роздільник
        String[] words = content.split(" ");

        // Заповнити словник кількістю зустрічей кожного слова
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            Integer count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }

        // Створити список записів Map.Entry для сортування словника
        List<Map.Entry<String, Integer>> entries = Arrays.asList(wordCounts.entrySet().toArray(new Map.Entry[0]));

        // Сортувати список за значенням кількості зустрічей у зворотньому порядку
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Вивести результат у консоль
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("%s %d\n", entry.getKey(), entry.getValue());
        }
    }
}

