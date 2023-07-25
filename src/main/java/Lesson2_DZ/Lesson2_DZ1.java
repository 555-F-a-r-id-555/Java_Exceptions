package Lesson2_DZ;
//Реализуйте метод, который запрашивает у пользователя
// ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;

import java.util.Scanner;

 class Lesson2_DZ1 {
    public static void main(String[] args) {

        System.out.println(aFloat());
    }

    private static float aFloat() {
        Scanner scanner = new Scanner(System.in);

        try {
            float num = scanner.nextFloat();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Не число");
//            e.printStackTrace();
            System.out.println(e.toString());
//            System.out.println(e.getMessage());
            System.out.println("Введите еще раз: ");
            return aFloat();
        }

    }
}
