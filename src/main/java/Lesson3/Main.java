package Lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        Integer[] integers = {1, 2, 3, 4, null};
////        EmptyIndex(integers,4);
//        EmptyIndex(integers, 2);

//        try {
//            NonExisted("task1");
//        } catch (NonExistedFileException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(counter.getCount());
//        try {
//            counter.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        Counter counter1 = new Counter();
        counter1.add();
        counter1.close();
        counter1.add();
        try (Counter counter = new Counter()) {
            counter.add();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

//        finally {
//            counter.add();
//        }

    }

    public static void EmptyIndex(Integer[] arg, int index) {
        if (arg[index] == null) {
            throw new EmptyIndexAppealException();
        }
        System.out.println("OK");
    }

    public static void NonExisted(String path) throws NonExistedFileException {
        File file = new File(path);
        if (!file.exists()) {
            throw new NonExistedFileException();
//            if (new File(path).exists())
        }
        System.out.println("OK");
    }


}
