package Lesson2_DZ;

import java.util.Scanner;

public class Lesson2_DZ4_v2 {
    public static void main(String[] args) {
        System.out.println("str = " + scannerChecker());

    }

    private static String scannerChecker() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите cроку: ");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                // Exception - никогда не будет выведено
                throw new RuntimeException("Пустую строку вводить нельзя....");
            }
            return str;
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введите строку еще раз : ");
            return scannerChecker();

        }

    }

}
