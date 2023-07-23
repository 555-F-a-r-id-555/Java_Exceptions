package Lesson1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов),
// и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий,
// метод должен бросить RuntimeException с сообщением об ошибке.


public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        errorChecker(ints);
    }

    static int getSum(int[][] array) {
        int sum = 0;
        for (int[] arr : array) {
            if (arr.length != array.length) return -1;
            for (int elem : arr) {
                if (elem != 0 && elem != 1) return -1;
                sum += elem;
            }
        }
        return sum;
    }

    static void errorChecker(int[][] array) {
        int getSum = getSum(array);
        if (getSum != -1) {
            System.out.println(getSum);
        } else {
            RuntimeException error = new RuntimeException("Массив не квадратный, либо числа не 0 или 1");
            System.out.println(error.getMessage());
        }

    }

}
