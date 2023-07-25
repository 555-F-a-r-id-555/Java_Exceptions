package Lesson2_DZ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson2_DZ1v2 {
    // Это как вариант замета do-while задача_1
    public static void main(String[] args) {
        System.out.println(aFloat());
    }

    private static float aFloat() {
        Scanner scanner = new Scanner(System.in);
//        float num = scanner.nextFloat();
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Input again:");
             scanner.nextLine();

        }
        return aFloat();
    }
}
