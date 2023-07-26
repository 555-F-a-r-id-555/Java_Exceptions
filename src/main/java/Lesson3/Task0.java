package Lesson3;


    import java.io.BufferedReader;
import java.io.BufferedWriter;
    import java.io.File;
    import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

    /**
     * Перепишите код, воспользовавшись механизмом try-with-resources
     */
    public class Task0 {
        public static void main(String[] args) {
            Path path = Path.of("E:\\java_exceptions\\777\\Java_Exceptions\\src\\main\\java\\Lesson3\\test02.txt");
            Path path1 = Path.of("E:\\java_exceptions\\777\\Java_Exceptions\\src\\main\\java\\Lesson3\\test01.txt");

            try {
                rwLine(path,path1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public  static void rwLine(Path pathRead, Path pathWrite) throws IOException {
            try(BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {

                out.write(in.readLine());
            }
        }
    }

