package Lesson2_DZ;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.
public class Lesson2_DZ4 {
    public static void main(String[] args) {
        scannerChecker();
    }
    private static String scannerChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите проку: ");
        String str = scanner.nextLine();
        if(str.isEmpty()){
//            throw new RuntimeException("Cтрока пустая вводить нельзя....");
            System.out.println("Введите не пустую строку: ");
            return scannerChecker();
        }else{
            System.out.println("str = " + str);
            return str;
        }
    }


}
