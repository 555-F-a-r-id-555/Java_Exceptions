package Lesson1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума,
// метод возвращает -1, в качестве кода ошибки, иначе - длину массива.


class Task1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int res = getLength(arr, 6);
        if (res != -1) System.out.println("Array Length: " + res);
        else System.out.println("Error: " + res);

    }

    static int getLength(int[] array, int minimum) {
        if (array.length < minimum) return -1;
        return array.length;
    }

}