package Lesson5;

import java.io.*;

public class ReadFile {
    public void readLines(String directory, String name) {
        File path = new File(directory + File.separator + name);
        try (FileReader reader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(reader);) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
