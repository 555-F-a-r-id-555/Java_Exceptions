package Lesson5;

import java.io.*;

public class WriteFile {
    public void WriteLines(String str, String fileName, String directoryName) {
        File dir = new File(directoryName);
        if (!dir.exists()) dir.mkdir();


        File file = new File(dir, fileName);
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.equals(str)){
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println(line);
                            System.err.println("Такая запись уже существует");
                            throw new RuntimeException();
                        }
                    }
                }

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }

        try (FileWriter writer = new FileWriter(file, true);) {
            writer.write(str + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }

    }
}
