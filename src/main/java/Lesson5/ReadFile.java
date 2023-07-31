package Lesson5;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    private static final Logger LOGGER = Logger.getLogger(ReadFile.class.getName());

    public void readLines(String directory, String name) {
        File path = new File(directory, name);

        if (!path.exists()) {
            LOGGER.warning("Файл " + name + " не существует.");
            return;
        }

        try (FileReader reader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Ошибка при чтении файла: " + e.getMessage(), e);
        }
    }
}


/* first version
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
*/
