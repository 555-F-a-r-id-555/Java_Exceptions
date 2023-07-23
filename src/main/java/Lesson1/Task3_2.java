package Lesson1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов),
// и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий,
// метод должен бросить RuntimeException с сообщением об ошибке.

import java.util.List;
import java.util.stream.IntStream;

public class Task3_2 {
public static void main(String[] args) {
    int[][] ints = new int[][]{
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1}

    };
    System.out.println(matrixSum(ints));
}
    private static int matrixSum(int[][] matrix){
        if(isNotSquer(matrix)){
            throw new RuntimeException("Not Squer Array");
        } else if (isNotOneOrZero(matrix)) {
            throw new RuntimeException("Has to contain One or Zero");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    private static boolean isNotOneOrZero(int[][] matrix){
        List<Integer> container = List.of(0,1);
        return IntStream.range(0, matrix.length)
                .anyMatch(i -> IntStream.range(0, matrix.length)
                        .anyMatch(j -> !container.contains(matrix[i][j])));
    }
    private static boolean isNotSquer(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != matrix.length){
                return true;
            }
        }
        return false;
    }
}



