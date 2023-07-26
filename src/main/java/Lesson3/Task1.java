package Lesson3;

import java.io.File;
import java.io.FileReader;

/**
 Создайте метод doSomething(), который может быть источником одного
 из типов checked exceptions(тело самого метода прописывать не обязательно).
 Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
 метод doSomething().
 */

public class Task1 {
    public static void main(String[] args) {

        try {
            doSomething();
        } catch (Exception e) {
            System.out.println(" Something exception");
            throw new RuntimeException(e);
        }
    }

    private static void doSomething() throws Exception{
        System.out.println("Exception's ");
        FileReader fileReader = new FileReader("test.txt");
    }

}
