package Lesson5;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetDataFromUser {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] strArray = data.split("\\s+");


        if (strArray.length != 6) try {
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Вы ввели n = " + strArray.length + ", нужно 6 строк, разделенных пробелом");
            System.out.println("Введите еще раз:");
            return getData();
        }
        else {
            if (!strArray[0].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Имя написано с ошибкой");
                    return getData();
                }
            } else if (!strArray[1].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Фамилие написано с ошибкой ");
                    return getData();
                }
            } else if (!strArray[2].matches("(?iu)^[а-яёA-Z]+$")) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("Отчество написано с ошибкой ");
                    return getData();
                }

            } else if (!strArray[3].matches("^[0-3][0-9].[01][0-9].[12][09][0-9][0-9]$")) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Дата рождения введена неверно  ");
                    return getData();
                }

            } else if (!strArray[4].matches("^[0-9]+$")) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Номер должен содержать только цифры ");
                    return getData();
                }

            } else if (!(strArray[5].equals("m") || strArray[5].equals("f"))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Пол: male or female");
                    return getData();
                }
            }

        }

//        StringBuilder res = new StringBuilder();
//        for (String elem : strArray) {
//            res.append("<" + elem + ">");
//        }

//        System.out.println(Arrays.toString(strArray));
        return strArray;
    }
}
